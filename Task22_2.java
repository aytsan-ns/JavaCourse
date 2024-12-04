import java.io.FileOutputStream;
import java.io.IOException;

public class Task22_2 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            String data = "Hello, OutputStream!";
            for (int i = 0; i < data.length(); i++) {
                fos.write(data.charAt(i)); // запись по одному символу
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
