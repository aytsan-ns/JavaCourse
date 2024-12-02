/* Напишите программу, которая просит ввести имя
и выводит на консоль строку "Привет, <введенное имя>". */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = scan.next();

        System.out.println("Привет, " + name);

        scan.close();
    }
}
