class Ex1 extends Exception {}
class Ex2 extends Ex1 {}
class Ex3 extends Ex2 {}

public class Task20 {
    public static void main(String[] args) {
        // Пример идентичной обработки нескольких исключений
        try {
            int[] array = {1, 2, 3};
            System.out.println("Элемент с индексом 5: " + array[5]); // ArrayIndexOutOfBoundsException

            int num = Integer.parseInt("abc"); // NumberFormatException
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("Идентичная обработка исключений: " + e.getClass().getSimpleName());
        }

        // Пример обработки исключений в иерархии
        try {
            throw new Ex3(); // Исключение самого нижнего уровня в иерархии
        } catch (Ex3 e) {
            System.out.println("Перехвачено Ex3");
        } catch (Ex2 e) {
            System.out.println("Перехвачено Ex2");
        } catch (Ex1 e) {
            System.out.println("Перехвачено Ex1");
        }
    }
}
