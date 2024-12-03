import java.util.Arrays;

public class Task5_2 {
    public static void main(String[] args) {
        int[] array = {9, 3, 7, 1, 5};

        // toString
        System.out.println("Original array: " + Arrays.toString(array));

        // Sort
        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));

        // Binary Search
        int index = Arrays.binarySearch(array, 7);
        System.out.println("Index of 7: " + index);

        // Equals
        int[] anotherArray = {1, 3, 5, 7, 9};
        System.out.println("Arrays are equal: " + Arrays.equals(array, anotherArray));

        // Compare
        System.out.println("Comparison result: " + Arrays.compare(array, anotherArray));
    }
}
