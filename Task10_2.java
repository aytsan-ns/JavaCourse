public class Task10_2 {
    final static class FinalClass {
        public void showMessage() {
            System.out.println("This is a final class.");
        }
    }

    // Ошибка: нельзя создать подкласс для final-класса
/*
static class SubClass extends FinalClass {
    // Нельзя наследовать final-класс
}
*/
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.showMessage(); // Вызов метода из final-класса
    }
}
