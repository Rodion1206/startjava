class VariablesTheme{

    public static void main(String[] args) {
        System.out.println("1. Создание переменных и вывод их значений на консоль\n");
        byte yearsOfUse = 8;
        short ram = 8192;
        byte sysBitDepth = 64;
        long corAmo = 2L;
        float corFreq = 2.4F;
        double dispRefRate = 60.0;
        char logo = 'F';
        boolean isHaveRemont = true;
        System.out.println("Yeats of use - " + yearsOfUse + " years");
        System.out.println("RAM - " + ram + " mb");
        System.out.println("System bit depth - " + sysBitDepth + " bit");
        System.out.println("Cores amount - " + corAmo + " psc");
        System.out.println("Frequency of core - " + corFreq + " GHz");
        System.out.println("Display refresh rate - " + dispRefRate + " Hz");
        System.out.println("Logotype - " + logo);
        System.out.println("Is have remont - " + isHaveRemont + "\n");

        System.out.println("2. Расчет стоимости товара со скидкой\n");
        double penPrice = 100.0;
        double bookPrice = 200.0;
        double disProc = 11;
        double disSum = (penPrice + bookPrice) * disProc / 100.0;
        double sumWithDis = (penPrice + bookPrice) - disSum;
        System.out.println("Сумма скидки - " + disSum);
        System.out.println("Общая стоимость товаров со скидкой - " + sumWithDis + "\n");

        System.out.println("3. Вывод на консоль слова JAVA\n");
        System.out.println("   J    a  v     v  a       \n   J   a a  v   v  a a      ");
        System.out.println("J  J  aaaaa  V V  aaaaa          \n JJ  a     a  V  a     a\n");

        System.out.println("4. Отображение min и max значений числовых типов данных\n");
        byte byteMaxVal = 127;
        short shortMaxVal = 32767;
        int intMaxVal = 2147483647;
        long longMaxVal = 9223372036854775807L;
        System.out.println("Byte max val = " + byteMaxVal);
        byteMaxVal++;
        System.out.println("Byte max val after inc = " + byteMaxVal);
        byteMaxVal--;
        System.out.println("Byte max val after dec = " + byteMaxVal + "\n");
        System.out.println("Short max val = " + shortMaxVal);
        shortMaxVal++;
        System.out.println("Short max val after inc = " + shortMaxVal);
        shortMaxVal--;;
        System.out.println("Short max val after dec = " + shortMaxVal + "\n");
        System.out.println("Int max val = " + intMaxVal);
        intMaxVal++;
        System.out.println("Int max val after inc = " + intMaxVal);
        intMaxVal--;
        System.out.println("Int max val after dec = " + intMaxVal + "\n");
        System.out.println("Long max val = " + longMaxVal);
        longMaxVal++;
        System.out.println("Long max val after inc = " + longMaxVal);
        longMaxVal--;
        System.out.println("Long max val after dec = " + longMaxVal + "\n");

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
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;
        System.out.println("Новые значения a = " + a + " b = " + b + "\n");

        System.out.println("6. Вывод символов и их кодов\n");
        char hash = '#';
        char amp = '&';
        char dog = '@';
        char pow = '^';
        char unSpc = '_';
        System.out.println("Код символа - " + (int) hash + " символ - " + hash);
        System.out.println("Код символа - " + (int) amp + " символ - " + amp);
        System.out.println("Код символа - " + (int) dog + " символ - " + dog);
        System.out.println("Код символа - " + (int) pow + " символ - " + pow);
        System.out.println("Код символа - " + (int) unSpc + " символ - " + unSpc + "\n");

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
        unSpc = '_';
        char spc = ' ';
        System.out.println(Character.toString(spc) + Character.toString(spc) + Character.toString(spc) +
                Character.toString(spc) + Character.toString(slash) + Character.toString(backSlash));
        System.out.println(Character.toString(spc) + Character.toString(spc) + Character.toString(spc) +
                Character.toString(slash) + Character.toString(spc) + Character.toString(spc) + Character.toString(backSlash));
        System.out.println(Character.toString(spc) + Character.toString(spc) + Character.toString(slash) +
                Character.toString(unSpc) + Character.toString(lScope) + Character.toString(spc) + Character.toString(rScope) +
                Character.toString(backSlash));
        System.out.println(Character.toString(spc) + Character.toString(slash) + Character.toString(spc) +
                Character.toString(spc) + Character.toString(spc) + Character.toString(spc) + Character.toString(spc) +
                Character.toString(spc) + Character.toString(backSlash));
        System.out.println(Character.toString(slash) + Character.toString(unSpc) + Character.toString(unSpc) +
                Character.toString(unSpc) + Character.toString(unSpc) + Character.toString(slash) + Character.toString(backSlash) +
                Character.toString(unSpc) + Character.toString(unSpc) + Character.toString(backSlash));

        System.out.println("9. Произведение и сумма цифр числа\n");
        num = 345;
        System.out.println("Дано число " + num);
        int hundrers = num / 100 % 10;
        int dozens = num / 10 % 10;
        int units = num % 10;
        System.out.println("Сумма цифр числа " + num + " = " + (hundrers + dozens + units));
        System.out.println("Произведение цифр числа " + num + " = " + hundrers * dozens * units + "\n");

        System.out.println("10. Преобразование секунд\n");
        int secAmount = 86399;
        int intHours = secAmount / 3600;
        int intHoursInSec = intHours * 3600;
        int secAmountWithoutHours = secAmount - intHoursInSec;
        int intMinutes = secAmountWithoutHours / 60;
        int intMinutesInSec = intMinutes * 60;
        int secWithoutHoursAndMinutes = (secAmount - intHoursInSec) - intMinutesInSec;
        System.out.println("" + intHours + ":" + intMinutes + ":" + secWithoutHoursAndMinutes);
    }
}