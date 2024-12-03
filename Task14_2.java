interface InterfaceA {
    default void show() {
        System.out.println("Show from InterfaceA");
    }
}

interface InterfaceB {
    default void show() {
        System.out.println("Show from InterfaceB");
    }
}

public class Task14_2 {
    static class MyClass implements InterfaceA, InterfaceB {
        // переопределяем метод, чтобы разрешить конфликт
        @Override
        public void show() {
            System.out.println("Show from MyClass, resolved conflict");
        }
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.show();  // вызов метода, переопределенного в классе
    }
}
