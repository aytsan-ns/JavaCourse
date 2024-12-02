public class Task3_1 {
    public static void main(String[] args) {

        // = и += и -= и *= и /= и %=
        int a = 10;  // =
        a += 5;      // a = a + 5 (15)
        a -= 3;      // a = a - 3 (12)
        a *= 2;      // a = a * 2 (24)
        a /= 4;      // a = a / 4 (6)
        a %= 5;      // a = a % 5 (1)

        String s = "Hello";  // Присваивание строки
        s += " World!";      // Конкатенация строк ("Hello World!")

        // ?:
        int x = 10, y = 20;
        int max = (x > y) ? x : y;  // Если x > y, то max = x, иначе max = y

        // || и &&
        boolean A = true, B = false;
        boolean C = A && B;  // Логическое И (false)
        boolean D = A || B;  // Логическое ИЛИ (true)

        boolean isNotEmpty = s != null && !s.isEmpty();  // Проверка строки (true)

        // == и > и >= и < и <=
        boolean isEqual = x == y;    // Сравнение на равенство (false)
        boolean isNotEqual = x != y;  // Сравнение на неравенство (true)
        boolean isGreater = x > y;   // Больше (false)
        boolean isLessOrEqual = x <= y;  // Меньше или равно (true)

        // | и ^ и &
        int b = 5, c = 3;  // В двоичном виде: b = 0101, c = 0011
        int orResult = b | c;  // Побитовое ИЛИ: 0111 -> 7
        int xorResult = b ^ c; // Побитовый XOR: 0110 -> 6
        int andResult = b & c; // Побитовое И: 0001 -> 1

        // >> и >>> и <<
        int shift = 8;  // 00001000
        int rightShift = shift >> 2;  // 00000010 -> 2
        int zeroFillShift = shift >>> 2;  // 00000010 -> 2
        int leftShift = shift << 2;  // 00100000 -> 32

        // + и - и * и / и %
        int sum = b + c;        // Сложение
        int difference = b - c; // Вычитание
        int product = b * c;    // Умножение
        int quotient = b / c;   // Деление
        int remainder = b % c;  // Остаток от деления

        s = "Hello";
        String greeting = s + " World";  // Конкатенация строк

        // Инкремент и декремент
        int count = 5;
        int preIncrement = ++count;  // Префикс: сначала увеличение, потом использование
        int postIncrement = count++; // Постфикс: сначала использование, потом увеличение

        int preDecrement = --count;  // Префикс: сначала уменьшение, потом использование
        int postDecrement = count--; // Постфикс: сначала использование, потом уменьшение

        // ~ и !
        int notB = ~b;  // Побитовое НЕ: инверсия битов
        boolean flag = false;
        boolean notFlag = !flag;  // Логическое НЕ (true)

        // Демонстрация приоритета операторов
        int priority = 10 + 20 * 3 / 5 - 2;  // Умножение и деление выполняются раньше сложения и вычитания
        int explicitPriority = (10 + 20) * (3 / (5 - 2));  // Явное указание порядка с помощью скобок
    }
}
