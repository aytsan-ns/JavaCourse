public class Task9_2 {
    enum Animal {
        CAT("кошка"),
        DOG("собака");

        private String russianName;

        // Конструктор перечисления
        Animal(String russianName) {
            this.russianName = russianName;
        }

        // Дополнительный метод
        public String getRussianName() {
            return russianName;
        }
    }

    public static void main(String[] args) {
        Animal animal = Animal.CAT;

        System.out.println(animal.getRussianName());
    }
}