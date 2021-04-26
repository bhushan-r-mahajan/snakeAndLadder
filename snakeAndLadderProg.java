public class snakeAndLadderProg {

	public static void main (String[] args) {
		System.out.println("Welcome to the Snake & Ladder Game !!");

		int position = 0;
		System.out.println("The player Position is: " + position);
		int diceRoll = (int) (Math.floor(Math.random() * 10 ) % 6 + 1);
		System.out.println("Dice Roll: " + diceRoll);
		position = position + diceRoll;
		System.out.println("New Position of Player is: " + position);
	}
}
