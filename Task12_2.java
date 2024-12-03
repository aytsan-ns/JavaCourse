public class Task12_2 {
    static class Animal {
        // метод суперкласса
        public String sound() {
            return "Some generic sound";
        }
    }

    static class Cat extends Animal {
        // переопределенный метод
        @Override
        public String sound() {
            return "Meow";
        }
    }

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myCat = new Cat();

        System.out.println("Animal sound: " + myAnimal.sound()); // Вызов метода Animal
        System.out.println("Cat sound: " + myCat.sound()); // Вызов метода Dog
    }
}
