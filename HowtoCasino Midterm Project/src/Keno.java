import java.util.Scanner;
public class Keno 
{
	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		int dollars = 100;
		int [] kenoNumbers = new int [20];
		for (int i = 0; i < 20; i++)
			{
				kenoNumbers [i] = (int) (Math.random()*80) + 1; 
			}
		System.out.println("Welcome to Keno!");
		System.out.println("Keno is a number based betting game. You get to pick up to 20 numbers from 1-80.");
		System.out.println("20 numbers will then be randomely selected.");
		System.out.println("The more numbers that match the ones you picked, the more you win!.");
		System.out.println("You have $" + dollars + ".");
		System.out.println("How much would you like to bet?");
		int bet = userInput.nextInt();
		int [] numbersChosen = new int [20];
		for (int i = 0; i < 20; i++)
			{
				System.out.println("Enter a number you want to choose.");
				numbersChosen [i] = userInput.nextInt();
			}
		System.out.println("The winning numbers are:");
		for (int i = 0; i < 20; i++)
			{
				System.out.print(kenoNumbers[i]);
			}		
		int numbersThatMatch = 0;
		for (int i = 0; i < 20; i++)
			{
				if (kenoNumbers[i] == numbersChosen[0] || kenoNumbers[i] == numbersChosen[1] || kenoNumbers[i] == numbersChosen[2] || kenoNumbers[i] == numbersChosen[3] || kenoNumbers[i] == numbersChosen[4] || kenoNumbers[i] == numbersChosen[5] || kenoNumbers[i] == numbersChosen[6] || kenoNumbers[i] == numbersChosen[7] || kenoNumbers[i] == numbersChosen[8] || kenoNumbers[i] == numbersChosen[9] || kenoNumbers[i] == numbersChosen[10] || kenoNumbers[i] == numbersChosen[11] || kenoNumbers[i] == numbersChosen[12] || kenoNumbers[i] == numbersChosen[13] || kenoNumbers[i] == numbersChosen[14] || kenoNumbers[i] == numbersChosen[15] || kenoNumbers[i] == numbersChosen[16] || kenoNumbers[i] == numbersChosen[17] || kenoNumbers[i] == numbersChosen[18] || kenoNumbers[i] == numbersChosen[19])
					{
						numbersThatMatch++;
					}
				else
					{
						numbersThatMatch = numbersThatMatch;
					}
			}
		if (numbersThatMatch > 0)
			{
				System.out.println("You had " + numbersThatMatch + " winning numbers!");
				bet = bet*numbersThatMatch;
				System.out.println("You win $" + bet + "!");
				dollars = dollars + bet;
			}
		else
			{
				System.out.println("You had 0 winning numbers.");
				System.out.println("You lose.");
				dollars = dollars - bet;
			}
		System.out.println("You have $" + dollars + " remaining.");
	}
}
