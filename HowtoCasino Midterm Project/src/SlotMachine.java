import java.util.Scanner;
public class SlotMachine
	{
		static int picture = 0;
		static int picture2 = 0;
		static int picture3 = 0;
		static String pictures = "";
		static String pictures2 = "";
		static String pictures3 = "";
		public static void main(String[] args)
			{
				Scanner userInput = new Scanner(System.in);
				
				int dollars = 100;
				
				System.out.println("Welcome to Slots.");
				System.out.println("You have $" + dollars + ".");
				System.out.println("We offer 3 slot machines for you to choose from.");
				System.out.println("Choose the machine you would like to play.");
				System.out.println("(1) Jungle Jackpot");
				System.out.println("(2) Aces Adventure");
				System.out.println("(3) Triple Threat");
				
				int machine = userInput.nextInt();
				
				if (machine == 1)
					{
						System.out.println("You've chosen Jungle Jackpot!");
					}
				else if (machine == 2)
					{
						System.out.println("You've chosen Aces Adventure!");
					}
				else
					{
						System.out.println("You've chosen Triple Threat!");
					}
				
				boolean playingSlots = true;
				
				while (playingSlots == true)
					{
						System.out.println("How much would you like to bet on this spin?");
						
						int bet = userInput.nextInt();
						
						if (bet > dollars)
							{
								System.out.println("You have entered an invalid bet.");
								System.out.println("Enter a bet that is equal to or less than $" + dollars + ".");
								bet = userInput.nextInt();
							}
						else
							{
								System.out.println("\"You just bet $" + bet + " on this game,\" says the speaker. \"Let's get started!\"");
							}
						
						
						System.out.println("Hit enter to spin.");
						
						Scanner userInput2 = new Scanner(System.in);
						String spin = userInput2.nextLine();
						System.out.println("Spinning...");
						
						picture = (int)(Math.random()*7) + 1;
						picture2 = (int)(Math.random()*7) + 1;
						picture3 = (int)(Math.random()*7) + 1;	
						
						if (picture == picture2 & picture == picture3)
							{
								digitsToPictures();
								
								System.out.println(pictures + " " + pictures2 + " " + pictures3);
								
								if (picture == 5)
									{
										System.out.println("You got a King Jackpot! You get five times your bet!");
										bet = bet * 5;
									}
								else if (picture == 6)
									{
										System.out.println("You got a Queen Jackpot! You get four times your bet!");
										bet = bet * 4;
									}
								else if (picture == 7)
									{
										System.out.println("You got a Joker Jackpot! You get three times your bet!");
										bet = bet * 3;
									}
								else
									{
										System.out.println("You got Three in a Row! You win!");
									}
								
								System.out.println("You won $" + bet + "!");
								dollars = dollars + bet;
								System.out.println("\"You have $" + dollars + " remaining.\"");		
								System.out.println("Would you like to play Slots again?");
								System.out.println("(1) Yes");
								System.out.println("(2) No");
								int playSlotsAgain = userInput.nextInt();
								if (playSlotsAgain == 1)
									{
										System.out.println("\"Let's play again!\" says the voice from the speaker.");
									}
								else
									{
										System.out.println("\"Come play again soon!\" says the voice from the speaker.");
										playingSlots = false;
									}
							}
						else
							{
								digitsToPictures();
								
								System.out.println(pictures + " " + pictures2 + " " + pictures3);
								System.out.println("You didn't win on this spin.");
								dollars = dollars - bet;
								System.out.println("\"You have $" + dollars + " remaining.\"");
								if (dollars < 1)
									{
										System.out.println("You have lost everything.");
										playingSlots = false;
									}
								else
									{
										System.out.println("Would you like to play Slots again?");
										System.out.println("(1) Yes");
										System.out.println("(2) No");
										int playSlotsAgain = userInput.nextInt();
										if (playSlotsAgain == 1)
											{
												System.out.println("\"Let's play again!\" says the voice from the speaker.");
											}
										else
											{
												System.out.println("\"Come play again soon!\" says the voice from the speaker.");
												playingSlots = false;
											}
									}
							}
					}
			}
		
		public static void digitsToPictures()
		
			{
				pictures = "0";
				switch (picture)
				{
					case 1:
						{
							pictures = "spade";
							break;
						}
					case 2:
						{
							pictures = "club";
							break;
						}
					case 3:
						{
							pictures = "heart";
							break;
						}
					case 4:
						{
							pictures = "diamond";
							break;
						}
					case 5:
						{
							pictures = "King";
							break;
						}
					case 6:
						{
							pictures = "Queen";
							break;
						}
					default:
						{
							pictures = "Joker";
						}				
				}
				
				pictures2 = "0";
				switch (picture2)
				{
					case 1:
						{
							pictures2 = "spade";
							break;
						}
					case 2:
						{
							pictures2 = "club";
							break;
						}
					case 3:
						{
							pictures2 = "heart";
							break;
						}
					case 4:
						{
							pictures2 = "diamond";
							break;
						}
					case 5:
						{
							pictures2 = "King";
							break;
						}
					case 6:
						{
							pictures2 = "Queen";
							break;
						}
					default:
						{
							pictures2 = "Joker";
						}				
				}
				
				pictures3 = "0";
				switch (picture3)
				{
					case 1:
						{
							pictures3 = "spade";
							break;
						}
					case 2:
						{
							pictures3 = "club";
							break;
						}
					case 3:
						{
							pictures3 = "heart";
							break;
						}
					case 4:
						{
							pictures3 = "diamond";
							break;
						}
					case 5:
						{
							pictures3 = "King";
							break;
						}
					case 6:
						{
							pictures3 = "Queen";
							break;
						}
					default:
						{
							pictures3 = "Joker";
						}				
				}
				
			}
		
	}

