public class Task18_2 {
    public static void main(String[] args) {
        // ArithmeticException: Деление на ноль
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Деление на ноль!");
            e.printStackTrace();
        }

        // ArrayIndexOutOfBoundsException: Выход за пределы массива
        try {
            int[] array = {1, 2, 3};
            int value = array[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Индекс выходит за пределы массива!");
            e.printStackTrace();
        }

        // IllegalArgumentException: Недопустимый аргумент
        try {
            setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: Недопустимый аргумент!");
            e.printStackTrace();
        }

        // ClassCastException: Некорректное приведение типа
        try {
            Object obj = "Строка";
            Integer num = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: Некорректное приведение типа!");
            e.printStackTrace();
        }

        // NullPointerException: Попытка доступа к null
        try {
            String str = null;
            int length = str.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: Попытка обращения к null!");
            e.printStackTrace();
        }
    }

    // Метод для проверки IllegalArgumentException
    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным.");
        }
    }
}
