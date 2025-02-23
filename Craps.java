import java.security.SecureRandom;

public class Craps {
	private static final SecureRandom randNum = new SecureRandom();

	private enum Status {
		CONTINUE, WON, LOST
	};

	public static void main(String[] args) {
		int points = 0;
		Status gameStatus;
		int sumOfDice = rollDice();

		switch (sumOfDice) {
			case 7:
			case 11:
				gameStatus = Status.WON;
				break;
			case 2:
			case 3:
			case 12:
				gameStatus = Status.LOST;
				break;
			default:
				gameStatus = Status.CONTINUE;
				points = sumOfDice;
				System.out.printf("Point is %d %n", points);
		}

		while (gameStatus == Status.CONTINUE) {
			sumOfDice = rollDice();
			if (sumOfDice == points)
				gameStatus = Status.WON;
			if (sumOfDice == 7)
				gameStatus = Status.LOST;
		}
		if (gameStatus == Status.WON) {
			System.out.println("Player Wins");
		} else {
			System.out.println("House Wins");
		}
	}

	public static int rollDice() {
		int die1 = 1 + randNum.nextInt(6);
		int die2 = 1 + randNum.nextInt(6);
		System.out.printf("Player rolled %d + %d = %d %n", die1, die2, die1 + die2);
		return die1 + die2;
	}
}
