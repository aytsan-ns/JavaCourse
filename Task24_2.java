import java.util.ArrayList;
import java.util.List;

public class Task24_2 {
    public static void main(String[] args) {
        // Пример использования <? extends T> (верхняя граница)
        List<Integer> intList = List.of(1, 2, 3, 4, 5); // Список для чтения
        System.out.println("Чтение из списка с <? extends T>:");
        printList(intList); // Используем метод с <? extends T>

        // Пример использования <? super T> (нижняя граница)
        List<Number> numList = new ArrayList<>(); // Список для записи
        addToList(numList); // Используем метод с <? super T>
        System.out.println("\nЗапись в список с <? super T>:");
        printList(numList); // Выводим содержимое списка после записи
    }

    // Метод для чтения данных (использует <? extends T>)
    public static void printList(List<? extends Number> list) {
        for (Number num : list) {
            System.out.println(num);
        }
    }

    // Метод для записи данных (использует <? super T>)
    public static void addToList(List<? super Integer> list) {
        list.add(10); // Добавляем элементы типа Integer
        list.add(20);
        list.add(30);
    }
}
