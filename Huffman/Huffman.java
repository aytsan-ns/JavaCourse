import java.io.IOException;

public class Huffman {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java Main <encode|decode> <inputFile> <outputFile>");
            return;
        }

        String command = args[0];
        String inputFile = args[1];
        String outputFile = args[2];

        HuffmanCoding huffman = new HuffmanCoding();

        try {
            if (command.equalsIgnoreCase("encode")) {
                huffman.buildTree(inputFile, outputFile);
                System.out.println("File encoded successfully.");
            } else if (command.equalsIgnoreCase("decode")) {
                huffman.decodeFile(inputFile, outputFile);
                System.out.println("File decoded successfully.");
            } else {
                System.out.println("Invalid command. Use 'encode' or 'decode'.");
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}