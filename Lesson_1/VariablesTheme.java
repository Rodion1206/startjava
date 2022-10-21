class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Создание переменных и вывод их значений на консоль\n");
        byte yearsOfUse = 8;
        short ram = 8192;
        byte systemBitDepth = 64;
        long coresAmount = 2L;
        float coreFrequency = 2.4F;
        double displayRefreshRate = 60.0;
        char logo = 'F';
        boolean isHaveRemont = true;
        System.out.println("Yeats of use - " + yearsOfUse + " years");
        System.out.println("RAM - " + ram + " mb");
        System.out.println("System bit depth - " + systemBitDepth + " bit");
        System.out.println("Cores amount - " + coresAmount + " psc");
        System.out.println("Frequency of core - " + coreFrequency + " GHz");
        System.out.println("Display refresh rate - " + displayRefreshRate + " Hz");
        System.out.println("Logotype - " + logo);
        System.out.println("Is have remont - " + isHaveRemont + "\n");

        System.out.println("2. Расчет стоимости товара со скидкой\n");
        double penPrice = 100.0;
        double bookPrice = 200.0;
        double discountProcent = 11;
        double discountSum = (penPrice + bookPrice) * discountProcent / 100.0;
        double priceWithDiscount = (penPrice + bookPrice) - discountSum;
        System.out.println("Сумма скидки - " + discountSum);
        System.out.println("Общая стоимость товаров со скидкой - " + priceWithDiscount + "\n");

        System.out.println("3. Вывод на консоль слова JAVA\n");
        System.out.println("   J    a  v     v  a       \n   J   a a  v   v  a a      ");
        System.out.println("J  J  aaaaa  V V  aaaaa          \n JJ  a     a  V  a     a\n");

        System.out.println("4. Отображение min и max значений числовых типов данных\n");
        byte byteMaxNumber = 127;
        short shortMaxNumber = 32767;
        int intMaxNumber = 2147483647;
        long longMaxNumber = 9223372036854775807L;
        System.out.println("Byte max number = " + byteMaxNumber);
        System.out.println("Byte max number after increment = " + ++byteMaxNumber);
        System.out.println("Byte max number after decrement = " + --byteMaxNumber + "\n");

        System.out.println("Short max number = " + shortMaxNumber);
        System.out.println("Short max number after increment = " + ++shortMaxNumber);
        System.out.println("Short max number after decrement = " + --shortMaxNumber + "\n");

        System.out.println("Int max number = " + intMaxNumber);
        System.out.println("Int max number after increment = " + ++intMaxNumber);
        System.out.println("Int max number after decrement = " + --intMaxNumber + "\n");

        System.out.println("Long max number = " + longMaxNumber);
        System.out.println("Long max number after increment = " + ++longMaxNumber);
        System.out.println("Long max number after decrement = " + --longMaxNumber + "\n");

        System.out.println("5. Перестановка значений переменных\n");
        int a = 2;
        int b = 5;
        System.out.println("Через третью переменную\nНачальные значения a = " + a + " b = " + b);
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("Новые значения a = " + a + " b = " + b + "\n");
        System.out.println("С помощью арифметических операций\nНачальные значения a = " + a + " b = " + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("Новые значения a = " + a + " b = " + b + "\n");
        System.out.println("С помощью побитовых операций\nНачальные значения a = " + a + " b = " + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("Новые значения a = " + a + " b = " + b + "\n");

        System.out.println("6. Вывод символов и их кодов\n");
        char hash = '#';
        char amp = '&';
        char dog = '@';
        char pow = '^';
        char unSpace = '_';
        System.out.println("Код символа - " + (int) hash + " символ - " + hash);
        System.out.println("Код символа - " + (int) amp + " символ - " + amp);
        System.out.println("Код символа - " + (int) dog + " символ - " + dog);
        System.out.println("Код символа - " + (int) pow + " символ - " + pow);
        System.out.println("Код символа - " + (int) unSpace + " символ - " + unSpace + "\n");

        System.out.println("7. Отображение количества сотен, десятков и единиц числа\n");
        short num = 123;
        System.out.println("Число " + num + " содержит");
        System.out.println((num / 100 % 10) + " сотен");
        System.out.println(num / 10 % 10 + " десятков");
        System.out.println(num % 10 + " единиц\n");

        System.out.println("8. Вывод на консоль ASCII-арт Дюка\n");
        char slash = '/';
        char backSlash = '\\';
        char lScope = '(';
        char rScope = ')';
        unSpace = '_';
        char space = ' ';
        System.out.println("" + space + space + space + space+ slash + backSlash);
        System.out.println("" + space + space + space + slash + space + space + backSlash);
        System.out.println("" + space + space + slash + unSpace + lScope + space + rScope + backSlash);
        System.out.println("" + space + slash + space + space + space + space + space + space + backSlash);
        System.out.println("" + slash + unSpace + unSpace + unSpace + unSpace + slash + backSlash +
                unSpace + unSpace + backSlash + "\n");

        System.out.println("9. Произведение и сумма цифр числа\n");
        num = 345;
        System.out.println("Дано число " + num);
        int hundreds = num / 100 % 10;
        int dozens = num / 10 % 10;
        int units = num % 10;
        System.out.println("Сумма цифр числа " + num + " = " + (hundreds + dozens + units));
        System.out.println("Произведение цифр числа " + num + " = " + hundreds * dozens * units + "\n");

        System.out.println("10. Преобразование секунд\n");
        int secAmount = 86399;
        int hours = secAmount / 3600;
        int minutes = secAmount % 3600 / 60;
        int seconds = secAmount % 3600 % 60;
        System.out.println("" + hours + ":" + minutes + ":" + seconds);
    }
}