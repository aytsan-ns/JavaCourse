public class Task9_1 {
    enum Day {
        MONDAY("Понедельник", "Начало недели"),
        TUESDAY("Вторник", "Второй день недели"),
        WEDNESDAY("Среда", "Середина недели"),
        THURSDAY("Четверг", "Почти конец недели"),
        FRIDAY("Пятница", "Последний рабочий день"),
        SATURDAY("Суббота", "Выходной день"),
        SUNDAY("Воскресенье", "Выходной день");

        private String russianName;
        private String description;

        // Конструктор перечисления
        Day(String russianName, String description) {
            this.russianName = russianName;
            this.description = description;
        }
    }

    public static void main(String[] args) {
        Day day = Day.MONDAY;
    }
}
