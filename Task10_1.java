public class Task10_1 {
    static class Parent {
        public final void displayMessage() {
            System.out.println("This is a final method in the Parent class.");
        }
    }
    static class Child extends Parent {
        // Ошибка: нельзя переопределить final метод суперкласса
    /*
    @Override
    public void displayMessage() {
        System.out.println("Attempt to override the final method.");
    }
    */
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.displayMessage(); // Вызов метода из Parent
    }
}
