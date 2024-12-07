import java.io.*;
import java.util.*;

class Node implements Comparable<Node> {
    char symbol;
    int frequency;
    Node left, right;

    public Node(char symbol, int frequency) {
        this.symbol = symbol;
        this.frequency = frequency;
    }

    public Node(int frequency, Node left, Node right) {
        this.frequency = frequency;
        this.left = left;
        this.right = right;
    }

    @Override
    public int compareTo(Node other) {
        return Integer.compare(this.frequency, other.frequency);
    }
}

public class HuffmanCoding {
    private Map<Character, String> huffmanCodes = new HashMap<>();
    private Map<String, Character> reverseCodes = new HashMap<>();

    public void buildTree(String inputFile, String encodedFile) throws IOException {
        // Подсчитать частоты символов
        Map<Character, Integer> frequencyMap = calculateFrequency(inputFile);

        System.out.println("Read file and symbol frequencies:");
        frequencyMap.forEach((key, value) -> System.out.println("Symbol: '" + key + "' Frequency: " + value));

        PriorityQueue<Node> queue = new PriorityQueue<>();

        // Построить дерево Хаффмана
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            queue.add(new Node(entry.getKey(), entry.getValue()));
        }

        // Если в файле только один уникальный символ
        if (queue.size() == 1) {
            Node uniqueNode = queue.poll();
            huffmanCodes.put(uniqueNode.symbol, "0");
            reverseCodes.put("0", uniqueNode.symbol);
            System.out.println("Huffman dictionary built:");
            huffmanCodes.forEach((key, value) -> System.out.println("Symbol: '" + key + "' Code: " + value));
            encodeFile(inputFile, encodedFile);
            return;
        }

        // Построение дерева
        while (queue.size() > 1) {
            Node left = queue.poll();
            Node right = queue.poll();
            Node parent = new Node(left.frequency + right.frequency, left, right);
            queue.add(parent);
        }

        Node root = queue.poll();
        generateCodes(root, "");

        System.out.println("Huffman dictionary built:");
        huffmanCodes.forEach((key, value) -> System.out.println("Symbol: '" + key + "' Code: " + value));

        encodeFile(inputFile, encodedFile);
    }

    // Подсчёт частот символов в файле
    private Map<Character, Integer> calculateFrequency(String inputFile) throws IOException {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        try (FileInputStream fis = new FileInputStream(inputFile)) {
            int b;
            while ((b = fis.read()) != -1) {
                char ch = (char) b;
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            }
        }
        return frequencyMap;
    }

    // Построение кодов для дерева Хаффмана
    private void generateCodes(Node node, String code) {
        if (node == null) return;

        // Если это единственный узел (листовое дерево)
        if (node.left == null && node.right == null) {
            huffmanCodes.put(node.symbol, code.length() > 0 ? code : "0");
            reverseCodes.put(code.length() > 0 ? code : "0", node.symbol);
            return;
        }

        generateCodes(node.left, code + "0");
        generateCodes(node.right, code + "1");
    }

    // Кодирование данных в файл
    public void encodeFile(String inputFile, String encodedFile) throws IOException {
        try (FileInputStream fis = new FileInputStream(inputFile);
             DataOutputStream dos = new DataOutputStream(new FileOutputStream(encodedFile))) {

            // Сохранить словарь
            dos.writeInt(huffmanCodes.size());
            for (Map.Entry<Character, String> entry : huffmanCodes.entrySet()) {
                dos.writeChar(entry.getKey());
                dos.writeUTF(entry.getValue());
            }


            // Кодировать данные
            StringBuilder encodedData = new StringBuilder();
            int b;
            while ((b = fis.read()) != -1) {
                char ch = (char) b;
                encodedData.append(huffmanCodes.get(ch));
            }

            System.out.println("Encoded data (bit string): " + encodedData);

            // Сохранить количество битов
            dos.writeInt(encodedData.length());

            // Сохранить побитово закодированные данные
            writeBits(dos, encodedData.toString());
        }
    }

    // Декодирование данных из файла
    public void decodeFile(String encodedFile, String outputFile) throws IOException {
        File file = new File(encodedFile);
        if (!file.exists()) {
            throw new FileNotFoundException("File " + encodedFile + " not found.");
        }
        System.out.println("File size: " + file.length() + " bytes");

        try (DataInputStream dis = new DataInputStream(new FileInputStream(file));
             FileOutputStream fos = new FileOutputStream(outputFile)) {

            // Загрузить словарь
            int size = dis.readInt();
            System.out.println("Reading number of symbols in the dictionary: " + size);

            for (int i = 0; i < size; i++) {
                char key = dis.readChar();
                String value = dis.readUTF();
                reverseCodes.put(value, key);
            }

            System.out.println("Loaded decoding dictionary:");
            reverseCodes.forEach((key, value) -> System.out.println("Code: " + key + " Symbol: '" + value + "'"));

            // Прочитать количество битов
            if (dis.available() >= 4) { // Проверка на наличие данных
                int bitLength = dis.readInt();
                System.out.println("Number of encoded bits: " + bitLength);

                // Прочитать закодированные данные побитово
                String encodedData = readBits(dis, bitLength);

                if (encodedData == null || encodedData.isEmpty()) {
                    throw new IOException("Encoded data is missing or empty.");
                }
                System.out.println("Encoded data for decoding: " + encodedData);

                // Декодировать данные
                StringBuilder decodedData = new StringBuilder();
                StringBuilder currentCode = new StringBuilder();

                for (char bit : encodedData.toCharArray()) {
                    currentCode.append(bit);
                    if (reverseCodes.containsKey(currentCode.toString())) {
                        decodedData.append(reverseCodes.get(currentCode.toString()));
                        currentCode.setLength(0);
                    }
                }

                System.out.println("Decoded data: " + decodedData);

                // Сохранить декодированные данные в файл
                for (char ch : decodedData.toString().toCharArray()) {
                    fos.write(ch);
                }
            } else {
                throw new IOException("File does not contain encoded data.");
            }
        }
    }

    // Прочитать побитовые данные
    private String readBits(DataInputStream input, int bitLength) throws IOException {
        StringBuilder bits = new StringBuilder();
        int totalBytes = (bitLength + 7) / 8; // Количество байтов для хранения битов

        for (int i = 0; i < totalBytes; i++) {
            int currentByte = input.read();
            for (int j = 7; j >= 0; j--) {
                if (bits.length() < bitLength) {
                    bits.append((currentByte >> j) & 1);
                }
            }
        }

        return bits.toString();
    }

    // Записать побитовые данные
    private void writeBits(DataOutputStream output, String bits) throws IOException {
        int currentByte = 0;
        int bitCount = 0;

        for (char bit : bits.toCharArray()) {
            currentByte = (currentByte << 1) | (bit - '0');
            bitCount++;

            if (bitCount == 8) {
                output.write(currentByte);
                currentByte = 0;
                bitCount = 0;
            }
        }

        if (bitCount > 0) {
            currentByte = currentByte << (8 - bitCount); // Дополнить оставшиеся биты нулями
            output.write(currentByte);
        }
    }
}
