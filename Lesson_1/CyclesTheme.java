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
		int min = -1;
		int max = 10;

		if (a < min) {
			min = a;
		}
		if (b < min) {
			min = b;
		}
		if (c < min) {
			min = c;
		}

		if (a > max) {
			max = a;
		}
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		System.out.println("min = " + min);
		System.out.println("max = " + max);
		for (i = max - 1; i > min; i--) {
			System.out.print(i + " ");
		}

		System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
		int num = 1234;
		int revertedNum = 0;
		System.out.print("Исходное число в обратном порядке - ");
		while (num > 0) {
			a = num % 10;
			revertedNum += a;
			System.out.print(a);
			num /= 10;
		}
		System.out.println("\nСумма его цифр - " + revertedNum);

		System.out.println("\n4. Вывод чисел на консоль в несколько строк");
		int numberCounter = 0;
		for (i = 1; i < 24; i += 2) {
			if (numberCounter == 5) {
				System.out.println();
				numberCounter = 0;
			}
			System.out.printf("%2s ", i);
			numberCounter++;
		}
		if (numberCounter < 5) {
			for (i = 1; i <= (5 - numberCounter); i++) {
				System.out.printf("%2s ", 0);
			}
		}

		System.out.println("\n\n5. Проверка количества единиц на четность");
		num = 3141591;
		int numForPrint = num;
		int onesCounter = 0;
		while (num > 0) {
			a = num % 10;
			if (a == 1) {
				onesCounter += 1;
			}
			num /= 10;
		}
		if (onesCounter % 2 == 0) {
			System.out.println("Число " + numForPrint + " содержит " + onesCounter +" четное количество единиц");
		} else {
			System.out.println("Число " + numForPrint + " содержит " + onesCounter +" нечетное количество единиц");
		}
		
		System.out.println("\n6. Отображение фигур в консоли");
		for (i = 0; i < 5; i++) {
			System.out.println("**********");
		}
		System.out.println();

		int rowCounter = 5;
		int symbolsAmount = 5;
		while(rowCounter > 0) {
			while(symbolsAmount > 0) {
				System.out.print("#");
				symbolsAmount -= 1;
			}
			rowCounter -= 1;
			symbolsAmount = rowCounter;
			System.out.println();
		}
		System.out.println();

		rowCounter = 5;
		symbolsAmount = 1;
		do {
			if (rowCounter == 1 || rowCounter == 5) {
				symbolsAmount = 1;
			} else if (rowCounter == 2 || rowCounter == 4) {
				symbolsAmount = 2;
			} else {
				symbolsAmount = 3;
			}
			for (int symbolCounter = 1; symbolCounter <= symbolsAmount; symbolCounter++){
				System.out.print("$");	
			}
			rowCounter--;
			System.out.println();
		} while (rowCounter > 0);
		
		System.out.println("\n7. Отображение ASCII-символов");
		// символы, идущие до цифр и имеющие нечетные коды [0 - 47]
		// маленькие английские буквы, имеющие четные коды [97 - 122]
		System.out.println("DEC CHAR");
		for (i = 0; i <= 47; i++) {
			if (i % 2 != 0) {
				System.out.printf("%3d %4c\n",i, (char) i);
			}
		}

		for (i = 97; i <= 123; i++) {
			if (i % 2 == 0) {
				System.out.printf("%3d %4c\n",i, (char) i);
			}
		}

		System.out.println("\n8. Проверка, является ли число палиндромом");
		num = 1234321;
		numForPrint = num;
		int revertedNumber = 0;
		while(num > revertedNumber) {
			revertedNumber = revertedNumber * 10 + num % 10;
			num /= 10;
	    }
	    if (num < 0 || (num % 10 == 0 && num != 0)) {
			System.out.printf("Число %s не является палиндромом", numForPrint);
		}
		if (num == revertedNumber || num == revertedNumber/10) {
			System.out.printf("Число %s является палиндромом", numForPrint);
	    } else {
			System.out.printf("Число %s не является палиндромом", numForPrint);
	    }
    	
		System.out.println("\n\n9. Определение, является ли число счастливым");
		num = 223322;
		int hundredsPart1  = (num / 100000) % 10;
        int tensPart1    = (num / 10000) % 10;
        int onesPart1     = (num / 1000) % 10;
        int hundredsPart2  = (num / 100) % 10;
        int tensPart2    = (num / 10) % 10;
        int onesPart2     = num % 10;
        int sumOfPart1 = hundredsPart1 + tensPart1 + onesPart1;
        int sumOfPart2 = hundredsPart2 + tensPart2 + onesPart2;
        System.out.println(num);
        System.out.printf("Сумма цифр %d%d%d = %d\n", hundredsPart1, tensPart1, onesPart1, sumOfPart1);
        System.out.printf("Сумма цифр %d%d%d = %d\n", hundredsPart2, tensPart2, onesPart2, sumOfPart2);
        if (sumOfPart1 == sumOfPart2) {
    		System.out.println("Число является счастливым");
        } else {
    		System.out.println("Число не является ");
        }
        
		System.out.println("\n10. Вывод таблицы умножения Пифагора");
		System.out.println("  ТАБЛИЦА      ПИФАГОРА");
		for (i = 1; i < 10; i++) {
			for (j = 1; j < 10; j++) {
		     	// самая первая ячейка
		     	if (i == 1 && j == 1) {
		     	System.out.print("__|");
				// первая ячейка ряда
				} else if (j == 1) {
					System.out.printf("%2s|", (i * j));
				// первый ряд
				} else if (i == 1) {
					System.out.printf("_%s_", (i * j));
				// прочие ячейки
				} else {
					System.out.printf("%2s ", (i * j));	
				}		
			}
			System.out.println();
		}
    }
}
