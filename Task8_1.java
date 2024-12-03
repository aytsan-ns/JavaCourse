class Printer {
    // Метод для печати целых чисел
    public void printValues(int... numbers) {
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    // Метод для печати строк
    public void printValues(String... strings) {
        for (String str : strings) {
            System.out.println(str);
        }
    }
}

public class Task8_1 {
    public static void main(String[] args) {
        Printer printer = new Printer();

        // Вызов метода для целых чисел
        printer.printValues(1, 2, 3, 4, 5);

        // Вызов метода для строк
        printer.printValues("Apple", "Banana", "Cherry");

    }
}
