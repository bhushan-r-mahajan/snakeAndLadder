public class snakeAndLadderProg
{
	public static void main (String[] args)
	{
		System.out.println("WELCOME TO THE SNAKE AND LADDER GAME!!");
		int diceRoll = 0;
		int position = 0;
		int numDiceRolls = 0;
		System.out.println("ORIGINAL PLAYER POSITION IS: " + position);
		while (position < 100 )
		{
			int win = 100;
			if (position < 0)
			{
				position = 0;
			}
			diceRoll = (int) (Math.floor(Math.random() * 10 ) % 6 + 1);
			numDiceRolls++;
         System.out.println("DICE ROLLED AND YOU HAVE: " + diceRoll);
			System.out.println("New Position of player is: " + position);
			int option = (int) (Math.floor(Math.random() * 10 ) % 3 + 1);
			switch (option)
			{
				case 1:
					System.out.println("PLAYER HAS PASSED HIS CHANCE!!");
					System.out.println("Position after Pass: " + position);
					break;
				case 2:
					System.out.println("PLAYER GOT A LADDER!!");
					if ((position + diceRoll) > win)
					{
						position = position - diceRoll;
						break;
					}
					else
					{
						position = position + diceRoll;
						System.out.println("Position after Ladder: " + position);
						break;
					}
				case 3:
					System.out.println("PLAYER GOT A SNAKE!!");
					position = position - diceRoll;
					System.out.println("Position after Snake: " + position);
					break;
			}
		}
		System.out.println("Total number of Dice Rolls required to win is: " + numDiceRolls);
	}
}
