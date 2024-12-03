public class Task12_3 {
    static class Animal {
        // метод суперкласса
        public String sound() {
            return "Some generic sound";
        }
    }

    static class Cat extends Animal {
        // переопределенный метод с ошибкой в имени
        @Override
        public String soundtrack() {  // компилятор сообщит об ошибке
            return "Meow";
        }
    }

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myCat = new Cat();
    }
}