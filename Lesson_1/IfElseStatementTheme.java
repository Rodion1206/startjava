import java.util.HashMap;
import java.util.Map;

class IfElseStatementTheme{

    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 29;
        String sex = "male";
        double height = 1.90;
        String name = "Rodion";

        if (age > 20) {
            System.out.println("Age more than 20");
        } else {
            System.out.println("Age less then 20");
        }

        if (!sex.equals("male")) {
            System.out.println("female");
        } else {
            System.out.println("male");
        }

        if (height < 1.80) {
            System.out.println("Height less then 1.80");
        } else {
            System.out.println("Height more then 1.80");
        }

        char firstLetterOfName = name.charAt(0);
        if (firstLetterOfName == 'M') {
            System.out.println("First letter of name - M");
        } else if (firstLetterOfName == 'I') {
            System.out.println("First letter of name - I");
        } else {
            System.out.println("First letter of name - " + Character.toString(firstLetterOfName));
        }
        System.out.println();

        System.out.println("2. Поиск max и min числа");
        int a = 5;
        int b = 3;
        System.out.println("a = " + a + " b = " + b);
        if (a > b) {
            System.out.println("a max, b min\n");
        } else if (b > a) {
            System.out.println("b max, a min\n");
        } else {
            System.out.println("a equals to b\n");
        }

        System.out.println("3. Работа с числом");
        boolean isZero = a == 0;
        boolean isEvenNum = false;
        boolean isPositive = false;
        if (!isZero) {
            if (a % 2 == 0) {
                isEvenNum = true;
            }
            if (a > 0) {
                isPositive = true;
            }
            System.out.println("Origin number = " + a);
            System.out.println("Is even number - " + isEvenNum);
            System.out.println("Is positive num - " + isPositive + "\n");
        }

        System.out.println("4. Поиск одинаковых цифр в числах");
        a = 123;
        b = 323;
        int hundredsOfA = (a / 100) % 10;
        int dozensOfA = (a / 10) % 10;
        int unitsOfA = a % 10;
        int hundredsOfB = (b / 100) % 10;
        int dozensOfB = (b / 10) % 10;
        int unitsOfB = b % 10;
        System.out.println("Origin numbers a = " + a + ", b = " + b);
        if (unitsOfA == unitsOfB) {
            System.out.println("Одинаковая цифра " + unitsOfA + ", разряд 1\n");
        } else if (dozensOfA == dozensOfB) {
            System.out.println("Одинаковая цифра " + dozensOfA + ", разряд 2\n");
        } else if (hundredsOfA == hundredsOfB) {
            System.out.println("Одинаковое число " + hundredsOfA + ", разряд 3\n");
        } else {
            System.out.println("Одинаковых цифр стоящих в одном разряде нет\n");
        }

        System.out.println("5. Определение буквы, числа или символа по их коду");
        // при проверке используйте символы, а не их коды
        boolean isUpperCaseLetter = false;
        boolean isLowerCaseLetter = false;
        boolean isDigit = false;
        char someSymbol = '\u0057';
        // A-Z = 65-90; a-z = 97-122; 0-9 = 48-57
        if (someSymbol >= 'A' && someSymbol <= 'Z') {
            isUpperCaseLetter = true;
        }
        if (someSymbol >= 'a' && someSymbol <= 'z') {
            isLowerCaseLetter = true;
        }
        if (someSymbol >= '0' && someSymbol <= '9') {
            isDigit = true;
        }
        System.out.println("Символ - " + someSymbol); // 87 код
        System.out.println("Большая буква - " + isUpperCaseLetter);
        System.out.println("Маленькая буква - " + isLowerCaseLetter);
        System.out.println("Число - " + isDigit);
        if (!isUpperCaseLetter && !isLowerCaseLetter && !isDigit) {
            System.out.println("Не буква и не число");
        }
        System.out.println();

        System.out.println("6. Определение суммы вклада и начисленных банком %");
        double depositSum = 300000;
        double prcPerAnnum = 0;
        if (depositSum < 100000) {
            prcPerAnnum = depositSum * 0.05;
        } else if (depositSum >= 100000 && depositSum <= 300000) {
            prcPerAnnum = depositSum * 0.07;
        } else if (depositSum > 300000) {
            prcPerAnnum = depositSum * 0.10;
        }
        System.out.println("Сумма вклада - " + depositSum);
        System.out.println("Начисленный % - " + prcPerAnnum); // НЕПРАВИЛЬНО
        System.out.println("Итоговая сумма с % - " + (depositSum + prcPerAnnum) + "\n");

        System.out.println("7. Определение оценки по предметам");
        Map<String, Integer> grades = new HashMap<>();
        grades.put("History", 59);
        grades.put("Programming", 91);
        for (String s : grades.keySet()) {
            int prc = grades.get(s);
            int gr = 0;
            if (prc <= 60) {
                gr = 2;
            } else if ((prc > 60) && (prc <= 73)) {
                gr = 3;
            } else if ((prc > 73) && (prc <= 91)) {
                gr = 4;
            } else if (prc > 91) {
                gr = 5;
            }
            System.out.println(s + " " + gr);
        }
        System.out.println();

        System.out.println("8. Расчет прибыли");
        double rantPerMon = 5000;
        double salesPerMon = 13000;
        double costPerMon = 9000;
        double profitPerMon = salesPerMon - costPerMon - rantPerMon;
        double annualProfit = profitPerMon * 12;
        if (annualProfit > 0) {
            System.out.println("+" + annualProfit + "\n");
        } else {
            System.out.println(annualProfit + "\n");
        }

        System.out.println("9. Подсчет количества банкнот");
        int sum = 567;
        System.out.println((sum / 100) % 10 + " по сотне");
        System.out.println((sum / 10) % 10 + " по десять");
        System.out.println(sum % 10 + " по одному");
    }
}