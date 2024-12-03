public class Task16_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        StringBuffer sbf = new StringBuffer("World");

        // 1. append() - добавляет строку в конец
        sb.append(" there!");  // Hello there!
        sbf.append(" everyone!");  // World everyone!
        System.out.println(sb);  // Output: Hello there!
        System.out.println(sbf);  // Output: World everyone!

        // 2. insert() - вставляет строку в указанную позицию
        sb.insert(6, "beautiful ");  // Hello beautiful there!
        sbf.insert(5, " amazing");  // World amazing everyone!
        System.out.println(sb);  // Output: Hello beautiful there!
        System.out.println(sbf);  // Output: World amazing everyone!

        // 3. delete() - удаляет строку с указанной позиции
        sb.delete(6, 16);  // Hello there!
        sbf.delete(5, 12);  // World everyone!
        System.out.println(sb);  // Output: Hello there!
        System.out.println(sbf);  // Output: World everyone!

        // 4. reverse() - переворачивает строку
        sb.reverse();  // !ereht olleH
        sbf.reverse();  // !noyreve dlroW
        System.out.println(sb);  // Output: !ereht olleH
        System.out.println(sbf);  // Output: !noyreve dlroW

        // 5. capacity() - возвращает текущую емкость строки
        System.out.println("StringBuilder capacity: " + sb.capacity());  // Output: StringBuilder capacity: 32
        System.out.println("StringBuffer capacity: " + sbf.capacity());  // Output: StringBuffer capacity: 32

        // 6. ensureCapacity() - гарантирует минимальную емкость
        sb.ensureCapacity(50);  // Установим минимальную емкость
        sbf.ensureCapacity(50);
        System.out.println("New StringBuilder capacity: " + sb.capacity());  // Output: New StringBuilder capacity: 50
        System.out.println("New StringBuffer capacity: " + sbf.capacity());  // Output: New StringBuffer capacity: 50

        // 7. setLength() - устанавливает длину строки
        sb.setLength(5);  // Устанавливаем длину на 5
        sbf.setLength(5);  // Устанавливаем длину на 5
        System.out.println(sb);  // Output: !ere
        System.out.println(sbf);  // Output: !noy

        // 8. Метод toString() - преобразует StringBuilder или StringBuffer в строку
        String strSb = sb.toString();  // Преобразуем StringBuilder в строку
        String strSbf = sbf.toString();  // Преобразуем StringBuffer в строку
        System.out.println("String from StringBuilder: " + strSb);  // Output: String from StringBuilder: !ere
        System.out.println("String from StringBuffer: " + strSbf);  // Output: String from StringBuffer: !noy

        // 9. Метод substring() - извлекает подстроку
        String subSb = sb.substring(1, 4);  // Подстрока с позиции 1 по 4
        String subSbf = sbf.substring(1, 4);  // Подстрока с позиции 1 по 4
        System.out.println("Substring of StringBuilder: " + subSb);  // Output: Substring of StringBuilder: ere
        System.out.println("Substring of StringBuffer: " + subSbf);  // Output: Substring of StringBuffer: noy

        // 10. Метод indexOf() - находит индекс первого вхождения символа или строки
        int indexSb = sb.indexOf("ere");  // Ищем подстроку "ere"
        int indexSbf = sbf.indexOf("noy");  // Ищем подстроку "noy"
        System.out.println("Index of 'ere' in StringBuilder: " + indexSb);  // Output: Index of 'ere' in StringBuilder: 1
        System.out.println("Index of 'noy' in StringBuffer: " + indexSbf);  // Output: Index of 'noy' in StringBuffer: 1
    }
}
