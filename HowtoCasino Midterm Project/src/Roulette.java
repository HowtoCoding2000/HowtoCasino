import java.nio.charset.MalformedInputException;
import java.util.Scanner;
public class Roulette 
{
		static String colorBet = "";
		static int numberBet = 0;
		public static void main(String[] args)
			{
				
				Scanner userInput = new Scanner (System.in);
				Scanner userInput1 = new Scanner (System.in);
				System.out.println("Input your name:");
				String name = userInput.nextLine();
				System.out.println("Welcome, " + name + ".");
				//delete above this line
				System.out.println("OK, " + name + ". Let's begin.");
				

				int [] rouletteWheel = new int [39];
				rouletteWheel[0] = 0;
				rouletteWheel[1] = 28;
				rouletteWheel[2] = 9;
				rouletteWheel[3] = 26;
				rouletteWheel[4] = 30;
				rouletteWheel[5] = 11;
				rouletteWheel[6] = 7;
				rouletteWheel[7] = 20;
				rouletteWheel[8] = 32;
				rouletteWheel[9] = 17;
				rouletteWheel[10] = 5;
				rouletteWheel[11] = 22;
				rouletteWheel[12] = 22;
				rouletteWheel[13] = 34;
				rouletteWheel[14] = 15;
				rouletteWheel[15] = 3;
				rouletteWheel[16] = 24;
				rouletteWheel[17] = 36;
				rouletteWheel[18] = 13;
				rouletteWheel[19] = 1;
				rouletteWheel[20] = 00;
				rouletteWheel[21] = 27;
				rouletteWheel[22] = 10;
				rouletteWheel[23] = 25;
				rouletteWheel[24] = 29;
				rouletteWheel[25] = 12;
				rouletteWheel[26] = 8;
				rouletteWheel[27] = 19;
				rouletteWheel[28] = 31;
				rouletteWheel[29] = 18;
				rouletteWheel[30] = 6;
				rouletteWheel[31] = 21;
				rouletteWheel[32] = 33;
				rouletteWheel[33] = 16;
				rouletteWheel[34] = 4;
				rouletteWheel[35] = 23;
				rouletteWheel[36] = 35;
				rouletteWheel[37] = 14;
				rouletteWheel[38] = 2;
				
				String [] rouletteColors = new String [39];
				rouletteColors[0] = "green";
				rouletteColors[1] = "red";
				rouletteColors[2] = "black";
				rouletteColors[3] = "red";
				rouletteColors[4] = "black";
				rouletteColors[5] = "red";
				rouletteColors[6] = "black";
				rouletteColors[7] = "red";
				rouletteColors[8] = "black";
				rouletteColors[9] = "red";
				rouletteColors[10] = "black";
				rouletteColors[11] = "red";
				rouletteColors[12] = "black";
				rouletteColors[13] = "red";
				rouletteColors[14] = "black";
				rouletteColors[15] = "red";
				rouletteColors[16] = "black";
				rouletteColors[17] = "red";
				rouletteColors[18] = "black";
				rouletteColors[19] = "red";
				rouletteColors[20] = "black";
				rouletteColors[21] = "red";
				rouletteColors[22] = "black";
				rouletteColors[23] = "red";
				rouletteColors[24] = "black";
				rouletteColors[25] = "red";
				rouletteColors[26] = "black";
				rouletteColors[27] = "red";
				rouletteColors[28] = "black";
				rouletteColors[29] = "red";
				rouletteColors[30] = "black";
				rouletteColors[31] = "red";
				rouletteColors[32] = "black";
				rouletteColors[33] = "red";
				rouletteColors[34] = "black";
				rouletteColors[35] = "red";
				rouletteColors[36] = "black";
				rouletteColors[37] = "red";
				rouletteColors[38] = "black";
				
				System.out.println(" ");
				
				System.out.println("BETTING OPTIONS");
				System.out.println(" ");
				
				for (int i = 0; i < 39; i++ )
					{
						System.out.println((i + 1) + ": " + rouletteColors[i] + ", " + rouletteWheel[i]);
					}
				
				//System.out.println("Place your bet on a color- red, black or green.");
				
				System.out.println(" ");
				
				System.out.println(name + ", do you want to bet on a color or a number?");
				System.out.println("(1) COLOR");
				System.out.println("(2) NUMBER");
				int betOnColor = userInput1.nextInt();
				
				if (betOnColor == 1)
					{
						System.out.println("OK, " + name + ", input the color you wish to bet on.");
						colorBet = userInput.nextLine();
					}
				else 
					{
						System.out.println("OK, " + name + ", input the number you wish to bet on.");
						numberBet = userInput.nextInt();
					}
				
				
				int spin=(int)(Math.random() * 39);
				
				System.out.println("The marble stops on " + rouletteWheel[spin] + ", " + rouletteColors[spin] + ".");
				
				if (colorBet.equals(rouletteColors[spin])||numberBet==(rouletteWheel[spin]))
					{
						System.out.println("You win!");
						System.exit(0);
					}
				
				else
					{
						System.out.println("You lose.");
						System.exit(0);
					}
				
					
				
				//System.out.println(rouletteWheel[rouletteWheel.length -1]);

			}

}

