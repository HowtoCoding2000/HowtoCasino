import java.util.Scanner;
public class Craps
	{
		static int dollars = 100;
		
		public static void main(String[] args)
			{
				Scanner userInput = new
				Scanner (System.in);
				System.out.println("Welcome to HowtoSurvival's HowtoCasino! What is your name?");
				String name = userInput.nextLine();
				System.out.println("Hello, " + name + ". Would you like to play Craps?");
				System.out.println("(1) Yes");
				System.out.println("(2) No");
				int answer = userInput.nextInt();
				if (answer == 2)
					{
						System.out.println("Shame, come back again soon when you would like to play Craps!");
					}
				else if (answer == 1)
					{
						boolean stillPlayingSlots = true;
						boolean letsPlaySlots = true;
						while (letsPlaySlots == true)
							{
							System.out.println("Welcome to Craps " + name + "! You have $" + dollars + "!");
							System.out.println("How much would you like to bet on this game?");
							int bet = userInput.nextInt();
							while (bet > dollars || bet < 1)
								{
									System.out.println("You have entered an invalid bet. Enter a number that is less than or equal to $" + dollars + ".");
									bet = userInput.nextInt(); 
								}
							System.out.println("You bet $" + bet + " on this game.");
							int dieRoll1 = (int)(Math.random ()*6) + 1;
							int dieRoll2 = (int)(Math.random ()*6) + 1;
							int totalDice = dieRoll1 + dieRoll2;
							if (totalDice == 7 || totalDice == 11)
								{
									System.out.println("You rolled a " + dieRoll1 + " and a " + dieRoll2 + " for a total of " + totalDice + ".");
									System.out.println("You win " + name + "!");
									dollars += bet;
									if (dollars == 0)
										{
											letsPlaySlots = false;
										}
									else if (dollars > 0)
										{
											System.out.println("You have $" + dollars + " remaining.");
											System.out.println("Would you like to play again " + name + "?");
											System.out.println("(1) Yes");
											System.out.println("(2) No");
											int playGameAgain = userInput.nextInt();
											if (playGameAgain == 2)
												{
													letsPlaySlots = false;
												}
											else
												{
													System.out.println("Let's play!");
												}
										}
							}
						else if (totalDice == 2 || totalDice == 12)
							{
								System.out.println("You rolled a " + dieRoll1 + " and a " + dieRoll2 + " for a total of " + totalDice + ".");
								System.out.println("Sorry, but you lost, " + name + ".");
								dollars -= bet;
								if (dollars == 0)
									{
										letsPlaySlots = false;
									}
								else if (dollars > 0)
									{
										System.out.println("You have $" + dollars + " remaining.");
										System.out.println("Would you like to play again " + name + "?");
										System.out.println("(1) Yes");
										System.out.println("(2) No");
										int playAgain = userInput.nextInt();
										if (playAgain == 2)
											{
												letsPlaySlots = false;
											}
										else
											{
												System.out.println("Let's play!");
											}
									}
							}
						else
							{
								boolean rollingAgain = true;
								while (rollingAgain)
									{	
									System.out.println("You rolled a " + dieRoll1 + " and a " + dieRoll2 + " for a total of " + totalDice + ".");
									System.out.println("Your point is " + totalDice + ", " + name + ".");
									boolean rollingOn = true;
									while (rollingOn)
										{
											int dieRoll3 = (int)(Math.random()*6) + 1;
											int dieRoll4 = (int)(Math.random()*6) + 1;
											int totalDice2 = dieRoll3 + dieRoll4;
											if (totalDice2 == 7)
												{
													System.out.println("Your point is " + totalDice + ", but you rolled a " + dieRoll3 + " and a " + dieRoll4 + " for a total of " + totalDice2 + ".");
													System.out.println("Sorry, but you lost, " + name + ".");
													dollars -= bet;
													if (dollars == 0)
														{
															rollingAgain = false;
															rollingOn = false;
															letsPlaySlots = false;
															stillPlayingSlots = false;
														}
													else if (dollars > 0)
														{
															System.out.println("You have $" + dollars + " remaining.");
															System.out.println("Would you like to play again " + name + "?");
															System.out.println("(1) Yes");
															System.out.println("(2) No");
															int playAgain = userInput.nextInt();
															if (playAgain == 2)
																{
																	rollingAgain = false;
																	rollingOn = false;
																	letsPlaySlots = false;
																	stillPlayingSlots = false;
																}
															else
																{
																	rollingOn = false;
																	rollingAgain = false;
																	System.out.println("Let's play!");
																}
														}
												}
											else if (totalDice2 == totalDice)
												{
													System.out.println("Your point is " + totalDice + " and you rolled a " + dieRoll3 + " and a " + dieRoll4 + " for a total of " + totalDice2 + ".");
													System.out.println("You win " + name + "!");
													dollars += bet;
													if (dollars == 0)
														{
															stillPlayingSlots = false;
														}
													else if (dollars > 0)
														{
															System.out.println("You have $" + dollars + " remaining.");
															System.out.println("Would you like to play again " + name + "?");
															System.out.println("(1) Yes");
															System.out.println("(2) No");
															int playAgain = userInput.nextInt();
															if (playAgain == 2)
																{
																	rollingAgain = false;
																	rollingOn = false;
																	letsPlaySlots = false;
																	stillPlayingSlots = false;
																}
															else
																{
																	rollingOn = false;
																	rollingAgain = false;
																	System.out.println("Let's play!");
																}
														}
												}
										}
									}
								
							}
					}
			}
		if (dollars == 0)
			{
				System.out.println("You have lost all your money. The dealer turns his back to you. 'Guido!' the dealer shouts, 'We've got another looser!'");
				System.out.println("A huge man steps out from behind a curtain. 'I'm afraid you're time is up,' he says. He lifts you off your chair and throws you into the street.");
				System.out.println("You have been shown the door.");
			}
		else
			{
				System.out.println("You won $" + dollars + ", " + name + ".");
			}
	}
	}