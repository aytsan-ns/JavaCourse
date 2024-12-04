import java.util.ArrayList;

public class Task27_3 {
    @SuppressWarnings("unchecked") // Подавляет предупреждение о необобщенных операциях
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Текст"); // Без аннотации появилось бы предупреждение
        System.out.println(list.get(0));
    }
}
