public class Task19 {
    public static void main(String[] args) {
        // Обработка первого исключения (перехватывается)
        try {
            int[] array = {1, 2, 3};
            System.out.println("Элемент с индексом 5: " + array[5]); // Это вызовет ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException перехвачено: " + e.getMessage());
        }

        // Второе исключение (не перехватывается)
        int[] nullArray = null;
        System.out.println("Длина массива: " + nullArray.length); // Это вызовет NullPointerException

        // Этот код не выполнится
        System.out.println("Программа завершена без аварии.");
    }
}
