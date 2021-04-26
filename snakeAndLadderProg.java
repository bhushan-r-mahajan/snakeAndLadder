public class snakeAndLadderProg {

	public static void main (String[] args) {
		System.out.println("Welcome to the Snake & Ladder Game !!");

		int position = 0;
		System.out.println("The player Position is: " + position);
		while (position <= 100)
		{
			int diceRoll = (int) (Math.floor(Math.random() * 10 ) % 6 + 1);
			System.out.println("Dice Roll: " + diceRoll);
			position = position + diceRoll;
			System.out.println("New Position of Player is: " + position);
			int option = (int) (Math.floor(Math.random() * 10 ) % 3 + 1);
			switch (option)
			{
				case 1:
					System.out.println("No Play");
					System.out.println("Position: " + position);
					break;
				case 2:
					System.out.println("Ladder");
					position = position + diceRoll;
					System.out.println("Position: " + position);
					break;
				case 3:
					System.out.println("Snake");
					position = position - diceRoll;
					System.out.println("Position: " + position);
					break;

			}
		}
	}
}
