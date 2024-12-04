import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        try {
            // объект Scanner для чтения из файла
            File file = new File("example.txt");
            Scanner scanner = new Scanner(file);

            // чтение файла строка за строкой
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            // закрытие Scanner
            scanner.close();
        } catch (FileNotFoundException e) {
            // обработка исключения, если файл не найден
            System.err.println("Файл не найден: " + e.getMessage());
        }
    }
}
