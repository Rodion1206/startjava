class MyFirstGame {

	public static void main(String[] args) {
		int hiddenNum = 5;
		int playerNum = 1;
		System.out.println("Отгадайте загаданное положительное целое число");
		while (playerNum != hiddenNum) {
			if (hiddenNum < playerNum) {
				System.out.printf("число %d больше того, что загадал компьютер\n", playerNum++);
			} else {
				System.out.printf("число %d меньше того, что загадал компьютер\n", playerNum--);
			}	
		}
		System.out.println("Вы победили!");
	}
}