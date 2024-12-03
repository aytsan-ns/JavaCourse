public class Task12_1 {
    static class Calculator {
        public int add(int a, int b) {
            return a + b;
        }

        public double add(double a, double b) {
            return a + b;
        }

        public int add(int a, int b, int c) {
            return a + b + c;
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("2 + 3 = " + calc.add(2, 3)); // add(int, int)
        System.out.println("2.5 + 3.5 = " + calc.add(2.5, 3.5)); // add(double, double)
        System.out.println("1 + 2 + 3 = " + calc.add(1, 2, 3)); // add(int, int, int)
    }
}
