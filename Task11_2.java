public class Task11_2 {
    static class A {
        int a;
        int b;
        int c;
        int z;

        public A() {
            this(0); // Вызов конструктора с одним параметром
        }

        public A(int a) {
            this(a, 0); // Вызов конструктора с двумя параметрами
        }

        public A(int a, int b) {
            this(a, b, 0); // Вызов конструктора с тремя параметрами
        }

        public A(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.z = 1; // Инициализация общего поля
        }
    }
}
