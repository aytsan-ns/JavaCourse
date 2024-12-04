class OuterClass2 {
    private String privateField = "Приватное поле внешнего класса";

    public class InnerClass {
        public void accessOuter() {
            System.out.println("Доступ из внутреннего класса: " + privateField);
        }
    }
}

public class Task25_2 {
    public static void main(String[] args) {
        OuterClass2 outer = new OuterClass2();
        OuterClass2.InnerClass inner = outer.new InnerClass();
        inner.accessOuter(); // Внутренний класс обращается к приватному полю внешнего класса
    }
}
