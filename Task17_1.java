import java.util.Formatter;

public class Task17_1 {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();

        // 1. %b - Логическое значение
        formatter.format("Логическое значение true: %b%n", true);

        // 2. %d - Десятичное целое значение
        formatter.format("Целое число: %d%n", 42);

        // 3. %f - Десятичное значение с плавающей точкой
        formatter.format("Число с плавающей точкой: %.2f%n", 3.14159);

        // 4. %s - Строковое представление
        formatter.format("Строка: %s%n", "Hello, Formatter!");

        // 5. %% - Вставка знака %
        formatter.format("Процент: %%");

        System.out.println(formatter);
        formatter.close();
    }
}
