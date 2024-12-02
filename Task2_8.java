interface Animal {
    void sound();
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Woof!");
    }
}

class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Meow!");
    }
}
public class Task2_8 {
    public static void main(String[] args) {

        var myDog = new Dog();  // Dog
        var myCat = new Cat();  // Cat

        myDog.sound();
        myCat.sound();
    }
}
