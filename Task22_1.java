import java.io.FileInputStream;
import java.io.IOException;

public class Task22_1 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("example.txt")) {
            int data;
            while ((data = fis.read()) != -1) { // чтение байта за байтом
                System.out.print((char) data); // преобразование байтов в символы
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}