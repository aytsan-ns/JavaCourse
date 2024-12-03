public class Task13 {
    static class Animal {
        private String name;
        private String sound;

        public Animal(String name, String sound) {
            this.name = name;
            this.sound = sound;
        }

        // переопределение метода equals()
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }

            // проверка на null и тип
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }

            Animal other = (Animal) obj;

            return this.name.equals(other.name) && this.sound.equals(other.sound);
        }

        // переопределение метода hashCode() для соблюдения контракта equals() и hashCode()
        @Override
        public int hashCode() {
            int result = name.hashCode();
            result = 31 * result + sound.hashCode();
            return result;
        }
    }
    public static void main(String[] args) {
        Animal dog1 = new Animal("Dog", "Bark");
        Animal dog2 = new Animal("Dog", "Bark");
        Animal cat = new Animal("Cat", "Meow");

        System.out.println(dog1.equals(dog2)); // true
        System.out.println(dog1.equals(cat));  // false
    }
}
