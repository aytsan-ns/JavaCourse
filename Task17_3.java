import java.util.Formatter;
import java.util.Calendar;

public class Task17_3 {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        Calendar calendar = Calendar.getInstance();

        // 1. %tH - Часы (00–23)
        formatter.format("Часы (24-часовой формат): %tH%n", calendar);

        // 2. %tM - Минуты
        formatter.format("Минуты: %tM%n", calendar);

        // 3. %tS - Секунды
        formatter.format("Секунды: %tS%n", calendar);

        // 4. %tY - Год (четырехзначный формат)
        formatter.format("Год (4 цифры): %tY%n", calendar);

        // 5. %tB - Полное название месяца
        formatter.format("Месяц: %tB%n", calendar);

        System.out.println(formatter);
        formatter.close();
    }
}
