class MyException extends Exception {

    // конструктор без параметров
    public MyException() {
        super("Произошло исключение MyFirstException");
    }

    // конструктор с сообщением об ошибке
    public MyException(String message) {
        super(message);
    }

    // конструктор с сообщением об ошибке и причиной
    public MyException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class Task21 {
    public static void main(String[] args) {
        try {
            testException();
        } catch (MyException e) {
            // обработка исключения
            System.out.println("Поймано исключение: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Метод, который выбрасывает наше исключение
    public static void testException() throws MyException {
        throw new MyException("Пример использования собственного исключения");
    }
}
