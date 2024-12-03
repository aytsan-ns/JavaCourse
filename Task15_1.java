public class Task15_1 {
    public static void main(String[] args) {
        // Пример строки для демонстрации методов
        String str = "Hello, World!";

        // 1. length() - возвращает длину строки
        System.out.println("Length of the string: " + str.length()); // 13

        // 2. charAt() - возвращает символ на указанной позиции
        System.out.println("Character at position 7: " + str.charAt(7)); // W

        // 3. toUpperCase() - преобразует строку в верхний регистр
        System.out.println("Uppercase string: " + str.toUpperCase()); // HELLO, WORLD!

        // 4. toLowerCase() - преобразует строку в нижний регистр
        System.out.println("Lowercase string: " + str.toLowerCase()); // hello, world!

        // 5. substring() - возвращает подстроку от индекса до конца
        System.out.println("Substring from index 7: " + str.substring(7)); // World!

        // 6. indexOf() - находит индекс первого вхождения подстроки
        System.out.println("Index of 'World': " + str.indexOf("World")); // 7

        // 7. replace() - заменяет символы или подстроки
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java")); // Hello, Java!

        // 8. trim() - удаляет начальные и конечные пробелы
        String strWithSpaces = "  Hello, World!  ";
        System.out.println("Trimmed string: '" + strWithSpaces.trim() + "'"); // 'Hello, World!'

        // 9. equals() - сравнивает строки на равенство
        String str2 = "Hello, World!";
        System.out.println("Strings are equal: " + str.equals(str2)); // true

        // 10. concat() - объединяет две строки
        System.out.println("Concatenated string: " + str.concat(" How are you?")); // Hello, World! How are you?
    }
}
