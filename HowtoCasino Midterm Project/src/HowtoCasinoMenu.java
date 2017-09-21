import java.util.Scanner;
public class HowtoCasinoMenu
	{
		static int dollars = 1000;
		static int timesUsed = 1;
		static int picture = 0;
		static int picture2 = 0;
		static int picture3 = 0;
		static String pictures = "";
		static String pictures2 = "";
		static String pictures3 = "";
		public static void main(String[] args)
			{
				Scanner userInput = new Scanner(System.in);
				boolean stillPlaying = true;
				while (stillPlaying == true)
					{
						if (timesUsed == 1)
							{
								System.out.println("You have $" + dollars + "");
								System.out.println("Welcome to the HowtoCasino!");
								System.out.println("Here at the HowtoCasino, we offer several games for you to choose from!");
								System.out.println("Take your pick!");
							}
						else
							{
								System.out.println("Welcome back to the HowtoCasino lobby!");
								System.out.println("Choose the game you want to play.");
							}
						System.out.println("(1) Craps");
						System.out.println("(2) Slots");
						int game = userInput.nextInt();
						if (game == 1)
							{
								craps();
							}
						else if (game == 2)
							{
								slotMachine();
							}
						System.out.println("Would you like to Play again and return to the lobby?");
						System.out.println("(1) Yes, return to the HowtoCasino lobby.");
						System.out.println("(2) No, exit the HowtoCansino.");
						int backToLobby = userInput.nextInt();
						if (backToLobby == 2)
							{
								stillPlaying = false;
								System.out.println("Come back again soon!");
							}
					}
			}
		public static void craps()
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
			}
		public static void slotMachine()
			{
						Scanner userInput = new Scanner(System.in);
						
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
