public class Task3_2 {
    public static void main(String[] args) {
        // Пример с различными классами
        Object obj = "Hello, World!";
        if (obj instanceof String) {
            System.out.println("obj является строкой и его значение: " + obj);
        }

        // Пример с подклассами и суперклассами
        Animal animal = new Dog();  // Dog в ссылке типа Animal
        if (animal instanceof Dog) {
            System.out.println("animal является объектом класса Dog.");
        }
        if (animal instanceof Animal) {
            System.out.println("animal также является объектом класса Animal.");
        }

        // Пример с null
        Object nullObj = null;
        if (nullObj instanceof String) {
            System.out.println("nullObj является строкой.");
        } else {
            System.out.println("nullObj не является строкой (instanceof всегда false для null).");
        }
    }
}
