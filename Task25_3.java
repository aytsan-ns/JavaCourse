class OuterClass3 {
    public class InnerClass {
        private String privateField = "Приватное поле внутреннего класса";

        public String getPrivateField() {
            return privateField;
        }
    }

    public void demo() {
        InnerClass inner = new InnerClass();
        System.out.println("Доступ к приватному полю внутреннего класса: " + inner.getPrivateField());
    }
}

public class Task25_3 {
    public static void main(String[] args) {
        OuterClass3 outer = new OuterClass3();
        outer.demo();

        // Прямой доступ невозможен
        // OuterClass.InnerClass inner = outer.new InnerClass();
        // System.out.println(inner.privateField); // Ошибка компиляции
    }
}
