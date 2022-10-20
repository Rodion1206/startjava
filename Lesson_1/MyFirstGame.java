class MyFirstGame{

	public static void main(String[] args) {
		int i = 5;
		int j = 0;
		System.out.println("Отгадайте загаданное положительное целое число");
		while (true) {
			if (j == i) {
				System.out.println("Вы победили!");
				break;
			} else {
				if (i < j) {
					System.out.printf("число %d больше того, что загадал компьютер\n", j);
				} else {
					System.out.printf("число %d меньше того, что загадал компьютер\n", j);
				}
				j++;
			}
		}
	}
}