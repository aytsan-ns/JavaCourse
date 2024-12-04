class Parent2 {
    public void display() {
        System.out.println("Метод суперкласса.");
    }
}

class Child2 extends Parent2 {
    @Override
    public void display() { // Метод переопределяется
        System.out.println("Метод подкласса.");
    }
}
public class Task27_1 {
    public static void main(String[] args) {
        Parent2 obj = new Child2();
        obj.display(); // Вывод: "Метод подкласса."
    }
}
