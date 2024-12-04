class Wrapper<T> {
    private T item;

    public Wrapper(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class Task24_1 {
    public static void main(String[] args) {
        Wrapper<Integer> intWrapper = new Wrapper<>(10);
        Wrapper<String> stringWrapper = new Wrapper<>("Hello");

        // Проверяем только основной тип
        System.out.println(intWrapper instanceof Wrapper); // true
        System.out.println(stringWrapper instanceof Wrapper); // true

        // Нельзя проверить тип параметра (например, Integer или String)
        // Ошибка компиляции:
        // System.out.println(intWrapper instanceof Wrapper<Integer>);
    }
}
