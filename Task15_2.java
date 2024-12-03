import java.util.StringJoiner;

public class Task15_2 {
    public static void main(String[] args) {
        // cоздание StringJoiner с разделителем
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        sj.add("Apple");
        sj.add("Banana");
        sj.add("Cherry");
        System.out.println("StringJoiner result: " + sj); // [Apple, Banana, Cherry]

        // bспользование StringJoiner без начальной и конечной строки
        StringJoiner sj2 = new StringJoiner(";");
        sj2.add("John");
        sj2.add("Paul");
        sj2.add("George");
        sj2.add("Ringo");
        System.out.println("StringJoiner result: " + sj2); // John;Paul;George;Ringo
    }
}
