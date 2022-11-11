package com.startjava.lesson_1.base;

class IfElseStatementTheme {

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
            System.out.println("First letter of name - " + firstLetterOfName);
        }

        System.out.println("\n2. Поиск max и min числа");
        int a = 5;
        int b = 3;
        System.out.println("a = " + a + " b = " + b);
        if (a > b) {
            System.out.println("a max, b min");
        } else if (b > a) {
            System.out.println("b max, a min");
        } else {
            System.out.println("a equals to b");
        }

        System.out.println("\n3. Работа с числом");
        boolean isEvenNum = false;
        boolean isPositive = false;
        if (a != 0) {
            if (a % 2 == 0) {
                isEvenNum = true;
            }
            if (a > 0) {
                isPositive = true;
            }
            System.out.println("Origin number = " + a);
            System.out.println("Is even number - " + isEvenNum);
            System.out.println("Is positive num - " + isPositive);
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        a = 123;
        b = 323;
        int hundredsA = (a / 100) % 10;
        int tensA = (a / 10) % 10;
        int onesA = a % 10;
        int hundredsB = (b / 100) % 10;
        int tensB = (b / 10) % 10;
        int onesB = b % 10;
        System.out.println("Origin numbers a = " + a + ", b = " + b);
        if (onesA == onesB) {
            System.out.println("Одинаковая цифра " + onesA + ", разряд 1");
        }
        if (tensA == tensB) {
            System.out.println("Одинаковая цифра " + tensA + ", разряд 2");
        }
        if (hundredsA == hundredsB) {
            System.out.println("Одинаковое число " + hundredsA + ", разряд 3");
        }
        if (!(onesA == onesB) && !(tensA == tensB) && !(hundredsA == hundredsB)) {
            System.out.println("Одинаковых цифр стоящих в одном разряде нет");
        }

        System.out.println("\n5. Определение буквы, числа или символа по их коду");
        // при проверке используйте символы, а не их коды
        char someSymbol = '\u0057';
        System.out.println("Символ - " + someSymbol); // 87 код
        // A-Z = 65-90; a-z = 97-122; 0-9 = 48-57
        if (someSymbol >= 'A' && someSymbol <= 'Z') {
            System.out.println("Большая буква");
        }
        if (someSymbol >= 'a' && someSymbol <= 'z') {
            System.out.println("Маленькая буква");
        }
        if (someSymbol >= '0' && someSymbol <= '9') {
            System.out.println("Число");
        }
        if (!(someSymbol >= 'A' && someSymbol <= 'Z') && !(someSymbol >= 'a' && someSymbol <= 'z') &&
            !(someSymbol >= '0' && someSymbol <= '9')) {
            System.out.println("Не буква и не число");
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
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
        System.out.println("Итоговая сумма с % - " + (depositSum + prcPerAnnum));

        System.out.println("\n7. Определение оценки по предметам");
        int historyProcent = 59;
        int programmingProcent = 91;
        int historyGrade = 0;
        int programmingGrade = 0;

        if (historyProcent <= 60) {
            historyGrade = 2;
        } else if ((historyProcent > 60) && (historyProcent <= 73)) {
            historyGrade = 3;
        } else if ((historyProcent > 73) && (historyProcent <= 91)) {
            historyGrade = 4;
        } else if (historyProcent > 91) {
            historyGrade = 5;
        }

        if (programmingProcent <= 60) {
            programmingGrade = 2;
        } else if ((programmingProcent > 60) && (programmingProcent <= 73)) {
            programmingGrade = 3;
        } else if ((programmingProcent > 73) && (programmingProcent <= 91)) {
            programmingGrade = 4;
        } else if (programmingProcent > 91) {
            programmingGrade = 5;
        }
        System.out.println("" + historyGrade + " history");
        System.out.println("" + programmingGrade + " programming");
        System.out.println("средний балл оценок по предметам " + (double) ((historyGrade + programmingGrade) / 2));
        System.out.println("средний % по предметам " + (double) ((historyProcent + programmingProcent) / 2));

        System.out.println("\n8. Расчет прибыли");
        double rantPerMon = 5000;
        double salesPerMon = 13000;
        double costPerMon = 9000;
        double profitPerMon = salesPerMon - costPerMon - rantPerMon;
        double annualProfit = profitPerMon * 12;
        if (annualProfit > 0) {
            System.out.println("+" + annualProfit);
        } else {
            System.out.println(annualProfit);
        }

        System.out.println("\n9. Подсчет количества банкнот");
        int sum = 567;
        System.out.println((sum / 100) % 10 + " по сотне");
        System.out.println((sum / 10) % 10 + " по десять");
        System.out.println(sum % 10 + " по одному");
    }
}