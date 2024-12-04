class OuterClass {
    // внутренний класс с публичным доступом
    public class PublicInner {
        public void display() {
            System.out.println("Это публичный внутренний класс");
        }
    }

    // внутренний класс с защищенным доступом
    protected class ProtectedInner {
        public void display() {
            System.out.println("Это защищенный внутренний класс");
        }
    }

    // внутренний класс с приватным доступом
    private class PrivateInner {
        public void display() {
            System.out.println("Это приватный внутренний класс");
        }
    }

    // метод для демонстрации создания внутренних объектов
    public void demo() {
        PublicInner publicInner = new PublicInner();
        publicInner.display();

        ProtectedInner protectedInner = new ProtectedInner();
        protectedInner.display();

        PrivateInner privateInner = new PrivateInner();
        privateInner.display();
    }
}

public class Task25_1 {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();

        // доступ к публичному внутреннему классу извне
        OuterClass.PublicInner publicInner = outer.new PublicInner();
        publicInner.display();

        // доступ к защищенному внутреннему классу (в пределах пакета)
        OuterClass.ProtectedInner protectedInner = outer.new ProtectedInner();
        protectedInner.display();

        // доступ к приватному внутреннему классу невозможен извне
        // OuterClass.PrivateInner privateInner = outer.new PrivateInner();
    }
}
