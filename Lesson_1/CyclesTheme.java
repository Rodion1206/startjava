class CyclesTheme{
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
								", а нечетных = " + sumOdd + "\n");

		System.out.println("2. Вывод чисел в интервале (min и max) в порядке убывания");
		int a = 10;
		int b = 5;
		int c = -1;
		int min, max;

		if (a >= b && a >= c) {
			max = a;
		} else if (b >= a && b >= c) {
			max = b;
		} else {
			max = c;
		}
		if (a <= b && a <= c) {
			min = a;
		} else if (b <= a && b <= c) {
			min = b;
		} else {
			min = c;
		}
		System.out.println("min = " + min);
		System.out.println("max = " + max);
		for (i = max - 1; i > min; i--) {
			System.out.print(i + " ");
		}
		System.out.println("\n");

		System.out.println("3. Вывод реверсивного числа и суммы его цифр");
		i = 1234;
		j = 0;
		System.out.print("Исходное число в обратном порядке - ");
		while (i > 0) {
			a = i % 10;
			j += a;
			System.out.print(a);
			i = i / 10;
		}
		System.out.println();
		System.out.println("Сумма его цифр - " + j + "\n");

		System.out.println("4. Вывод чисел на консоль в несколько строк");
		j = 1;
		for (i = 1; i < 24; i += 2) {
			if (j == 5) {
				System.out.printf("%2s \n", i);
				j = 0;
			} else {
				System.out.printf("%2s ", i);
			}
			j++;
		}
		System.out.println("\n");

		System.out.println("5. Проверка количества единиц на четность");
		i = 3141591;
		b = i;
		j = 0;
		while (i > 0) {
			a = i % 10;
			if (a == 1) {
				j += 1;
			}
			i = i / 10;
		}
		if (j % 2 == 0) {
			System.out.println("Число " + b + " содержит " + j +" четное количество единиц\n");
		} else {
			System.out.println("Число " + b + " содержит " + j +" нечетное количество единиц\n");
		}
		
		System.out.println("6. Отображение фигур в консоли");
		for (i = 0; i < 5; i++) {
			System.out.println("**********");
		}
		System.out.println();

		i = 5;
		j = 5;
		while(i > 0) {
			while(j > 0) {
				System.out.print("#");
				j -= 1;
			}
			i -= 1;
			j = i;
			System.out.println();
		}
		System.out.println();

		i = 5;
		do {
			if (i == 1 || i == 5) {
				System.out.print("$");
			} else if (i == 2 || i == 4) {
				System.out.print("$");
				System.out.print("$");
			} else {
				System.out.print("$");
				System.out.print("$");
				System.out.print("$");
			}
			i--;
			System.out.println();
		} while (i > 0);
		System.out.println();
		
		System.out.println("7. Отображение ASCII-символов");
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
		System.out.println();

		System.out.println("8. Проверка, является ли число палиндромом");
		i = 1234321;
		j = i;
	    int revertedNumber = 0;
	    while(i > revertedNumber)
	    {
	        revertedNumber = revertedNumber * 10 + i % 10;
	        i /= 10;
	    }
	    if(i < 0 || (i % 10 == 0 && i != 0)) {
        	System.out.printf("Число %s не является палиндромом\n\n", j);
		}
	    if (i == revertedNumber || i == revertedNumber/10) {
	    	System.out.printf("Число %s является палиндромом\n\n", j);
	    } else {
	    	System.out.printf("Число %s не является палиндромом\n\n", j);
	    }
    	
		System.out.println("9. Определение, является ли число счастливым");
		i = 223322;
		int hundredsOfPart1  = (i / 100000) % 10;
        int dozensOfPart1    = (i / 10000) % 10;
        int unitsOfPart1     = (i / 1000) % 10;
        int hundredsOfPart2  = (i / 100) % 10;
        int dozensOfPart2    = (i / 10) % 10;
        int unitsOfPart2     = i % 10;
        int sumOfPart1 = hundredsOfPart1 + dozensOfPart1 + unitsOfPart1;
        int sumOfPart2 = hundredsOfPart2 + dozensOfPart2 + unitsOfPart2;
        System.out.println(i);
        System.out.printf("Сумма цифр %d%d%d = %d\n", hundredsOfPart1, dozensOfPart1, unitsOfPart1, sumOfPart1);
        System.out.printf("Сумма цифр %d%d%d = %d\n", hundredsOfPart2, dozensOfPart2, unitsOfPart2, sumOfPart2);
        if (sumOfPart1 == sumOfPart2) {
    		System.out.println("Число является счастливым\n");
        } else {
    		System.out.println("Число не является счастливым\n");
        }
        
		System.out.println("10. Вывод таблицы умножения Пифагора");
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