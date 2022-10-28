class CyclesTheme {

	public static void main(String[] args) {
		System.out.println("1. Подсчет суммы четных и нечетных чисел");
		int j = 1;
		int i = -10;
		int sumOdd = 0;
		int sumEven = 0;
		do {
			if (i % 2 == 0) {
				sumEven += i;
			} else {
				sumOdd += i;
			}
			i++;
		} while (i < 22);
		System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sumEven + 
				", а нечетных = " + sumOdd);

		System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
		int a = 10;
		int b = 5;
		int c = -1;
		int min = c;
		int max = a;

		System.out.println("min = " + min);
		System.out.println("max = " + max);
		for (i = max - 1; i > min; i--) {
			System.out.print(i + " ");
		}

		System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
		int num = 1234;
		int sumDigits = 0;
		System.out.print("Исходное число в обратном порядке - ");
		while (num > 0) {
			int digit = num % 10;
			sumDigits += digit;
			System.out.print(digit);
			num /= 10;
		}
		System.out.println("\nСумма его цифр - " + sumDigits);

		System.out.println("\n4. Вывод чисел на консоль в несколько строк");
		int numbersCounter = 0;
		for (i = 1; i < 24; i += 2) {
			if (numbersCounter == 5) {
				System.out.println();
				numbersCounter = 0;
			}
			System.out.printf("%2s ", i);
			numbersCounter++;
		}
		if (numbersCounter < 5) {
			for (i = 1; i <= (5 - numbersCounter); i++) {
				System.out.printf("%2s ", 0);
			}
		}

		System.out.println("\n\n5. Проверка количества единиц на четность");
		num = 3141591;
		int copyNum = num;
		int countOnes = 0;
		while (num > 0) {
			int digit = num % 10;
			if (digit == 1) {
				countOnes++;
			}
			num /= 10;
		}
		if (countOnes % 2 == 0) {
			System.out.println("Число " + copyNum + " содержит " + countOnes +" четное количество единиц");
		} else {
			System.out.println("Число " + copyNum + " содержит " + countOnes +" нечетное количество единиц");
		}
		
		System.out.println("\n6. Отображение фигур в консоли");
		for (i = 0; i < 5; i++) {
			System.out.println("**********");
		}
		System.out.println();

		int countRows = 5;
		int symbolsAmount = 5;
		while(countRows > 0) {
			while(symbolsAmount > 0) {
				System.out.print("#");
				symbolsAmount--;
			}
			countRows--;
			symbolsAmount = countRows;
			System.out.println();
		}
		System.out.println();

		countRows = 0;
        int count = 0;
        do {
            int elements = 0;
            do {
               System.out.print("$");
            } while (++elements <= countRows);
            if (++count <= 2) {
                countRows++;
            } else {
                countRows--;
            }
            System.out.println();
        } while (countRows >= 0);
		
		System.out.println("\n7. Отображение ASCII-символов");
		// символы, идущие до цифр и имеющие нечетные коды [0 - 47]
		// маленькие английские буквы, имеющие четные коды [97 - 122]
		System.out.println("DEC CHAR");
		for (i = 0; i <= 47; i++) {
			if (i % 2 != 0) {
				System.out.printf("%3d %4c\n", i, i);
			}
		}

		for (i = 97; i <= 123; i++) {
			if (i % 2 == 0) {
				System.out.printf("%3d %4c\n", i, i);
			}
		}

		System.out.println("\n8. Проверка, является ли число палиндромом");
		num = 1234321;
		copyNum = num;
		int reverseNum = 0;
		while(num != 0) {
			reverseNum = reverseNum * 10 + num % 10;
			num /= 10;
	    }
	    if (copyNum == reverseNum) {
	    	System.out.printf("Число %s является палиндромом", copyNum);
	    } else {
	    	System.out.printf("Число %s не является палиндромом", copyNum);
	    }
     	
		System.out.println("\n\n9. Определение, является ли число счастливым");
		num = 223322;
		int numCopy = num;
        int digitOrder = 0;
        int sumTopHalf = 0;
        int sumBottomHalf = 0;
        while (num != 0) {
            int digit = num % 10;
            if (digitOrder < 3) {
                sumTopHalf += digit;
            } else {
                sumBottomHalf += digit;
            }
            num /= 10;
            digitOrder++;
        }
        System.out.printf("Сумма цифр %d = %d", numCopy / 1000, sumTopHalf);
        System.out.printf("\nСумма цифр %d = %d", numCopy % 1000, sumBottomHalf);
        if (sumTopHalf == sumBottomHalf) {
            System.out.println("\nЧисло является счастливым");
        } else {
            System.out.println("\nЧисло не является счастливым");
        }
        
		System.out.println("\n10. Вывод таблицы умножения Пифагора");
		System.out.println("  ТАБЛИЦА      ПИФАГОРА");
		// отдельно вывести шапку и таблицу
		System.out.print("__|");
        for (i = 2; i < 10; i++) {
            System.out.printf("__%d", i);    
        }
        System.out.println();
        for (i = 2; i < 10; i++) {
            for (j = 1; j < 10; j++) {
                if (j == 1) {
                    System.out.printf("%2d|", i * j);
                } else {
                    System.out.printf("%3d", i * j);
                }
            }
            System.out.println();
        }
    }
}
