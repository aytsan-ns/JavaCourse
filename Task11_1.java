public class Task11_1 {
    static class A {
        int a = 10;

        A() {
            System.out.println("Constructor of A");
        }

        void display() {
            System.out.println("Method of A: a = " + a);
        }
    }

    static class B extends A {
        int a = 20;

        B() {
            super(); // обращение к конструктору суперкласса
            System.out.println("Constructor of B");
        }

        void display() {
            super.display(); // доступ к методу суперкласса
            System.out.println("Method of B: a = " + this.a);
        }

        void showSuperField() {
            System.out.println("Field from A: a = " + super.a); // доступ к полю суперкласса
        }
    }

    public static void main(String[] args) {
        B obj = new B();
        obj.display();
        obj.showSuperField();
    }
}
