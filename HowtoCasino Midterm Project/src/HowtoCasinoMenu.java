import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class HowtoCasinoMenu
	{
		private static final long serialVersionUID = 1L;
		static JFrame frame = new JFrame();
		static int className;
		static String number;
		
		static Scanner userInput = new Scanner(System.in);
		static boolean stillPlaying = true;
		static int dollars = 1000;
		static int timesUsed = 1;
		static int backToLobby = 1;
		static int picture = 0;
		static int picture2 = 0;
		static int picture3 = 0;
		static String pictures = "";
		static String pictures2 = "";
		static String pictures3 = "";
		static String name = "";
		static ArrayList <Card> deck = new ArrayList<Card>();
		static ArrayList <String> nameArray = new ArrayList <String>();
		static int aIDollars1 = (int)(Math.random())*250 + 751;
		static int aIDollars2 = (int)(Math.random())*250 + 751;
		static int aIBet1 = 0;
		static int aIBet2 = 0;
		static int bet = 0;
		static int aIHand1Total = 0;
		static int aIHand2Total = 0;
		static int dealerHandTotal = 0;
		static int playerHandTotal = 0;
		static String name1 = "";
		static String name2 = "";
		static int playerBeingDeltTo = 0;
		//dealer = 0
		//aIPlayer1 = 1
		//aIPlayer2 = 2
		//player = 3
		static boolean stillPlayingBlackjack = true;
		public static void main(String[] args)
			{
				while (stillPlaying == true)
					{
						if (timesUsed == 1)
							{
								JOptionPane.showMessageDialog(frame, "Welcome to the HowtoCasino!");
								name = JOptionPane.showInputDialog("What is your name?");  
								JOptionPane.showMessageDialog(frame, "Welcome, " + name + "!");
								JOptionPane.showMessageDialog(frame, "You have $" + dollars + ".");
								JOptionPane.showMessageDialog(frame, "Here at the HowtoCasino, we offer several games for you to choose from!");
							}
						else if (timesUsed > 1)
							{
								JOptionPane.showMessageDialog(frame, "Welcome back to the HowtoCasino lobby!");
		
							}
						Object[] game = {"Craps", "Slots", "Keno", "Blackjack"};
						className = JOptionPane.showOptionDialog(
								frame, 
								"Choose the game you want to play.",
								"Game Selection",
								JOptionPane.YES_NO_CANCEL_OPTION,
								JOptionPane.QUESTION_MESSAGE,
								null, 
								game, 
								game[3]
								);
						switch (className)
							{
								case 0:
										{
											craps();
											break;
										}
								case 1:
										{
											slotMachine();
											break;
										}
								case 2:
										{
											keno();
											break;
										}
								default:
										{
											blackjack();
										}
							}
					if (dollars < 1)
						{
							stillPlaying = false;
						}
					else
						{
							Object[] yesOrNo = {"Yes", "No"};
							className = JOptionPane.showOptionDialog(
									frame, 
									"Would you like to return to the lobby to play another game?",
									"Hallway",
									JOptionPane.YES_NO_CANCEL_OPTION,
									JOptionPane.QUESTION_MESSAGE,
									null, 
									yesOrNo, 
									yesOrNo[1]
									);
							switch (className)
								{
									case 0:
											{
												stillPlaying = true;
												break;
											}
									default:
											{
												stillPlaying = false;
												JOptionPane.showMessageDialog(frame, "Come back again soon!");
											}
								}
						}
						timesUsed++;
					}
			}
		//CRAPS
		public static void craps()
			{
				boolean letsPlayCraps = true;
				while (letsPlayCraps == true)
					{
						JOptionPane.showMessageDialog(frame, "Welcome to Craps, " + name + "! You have $" + dollars + "!");
						number = JOptionPane.showInputDialog("How much would you like to bet on this game?");
						bet = Integer.parseInt(number);
						while (bet > dollars || bet < 1)
							{
								number = JOptionPane.showInputDialog("You have entered an invalid bet. Enter a number that is less than or equal to $" + dollars + ".");
								bet = Integer.parseInt(number);
							}
						JOptionPane.showMessageDialog(frame, "You bet $" + bet + " on this game.");
						int dieRoll1 = (int)(Math.random ()*6) + 1;
						int dieRoll2 = (int)(Math.random ()*6) + 1;
						int totalDice = dieRoll1 + dieRoll2;
						JOptionPane.showMessageDialog(frame, "Hit OK to roll.");
						if (totalDice == 7 || totalDice == 11)
							{
								JOptionPane.showMessageDialog(frame, "You rolled a " + dieRoll1 + " and a " + dieRoll2 + " for a total of " + totalDice + ".");
								JOptionPane.showMessageDialog(frame, "You win " + name + "!");
								dollars += bet;
								if (dollars == 0)
									{
										letsPlayCraps = false;
									}
								else if (dollars > 0)
									{
										JOptionPane.showMessageDialog(frame, "You have $" + dollars + " remaining.");
										Object[] yesOrNo = {"Yes", "No"};
										className = JOptionPane.showOptionDialog(
												frame, 
												"Would you like to play again, " + name + "?",
												"Play Craps Again?",
												JOptionPane.YES_NO_CANCEL_OPTION,
												JOptionPane.QUESTION_MESSAGE,
												null, 
												yesOrNo, 
												yesOrNo[1]
												);
										switch (className)
											{
												case 0:
														{
															JOptionPane.showMessageDialog(frame, "Let's play!");
															break;
														}
												case 1:
														{
															letsPlayCraps = false;
															break;
														}
											}
									}
										}
								else if (totalDice == 2 || totalDice == 12)
									{
										JOptionPane.showMessageDialog(frame, "You rolled a " + dieRoll1 + " and a " + dieRoll2 + " for a total of " + totalDice + ".");
										JOptionPane.showMessageDialog(frame, "Sorry, but you lost, " + name + ".");
										dollars -= bet;
										if (dollars == 0)
											{
												letsPlayCraps = false;
												stillPlaying = false;
											}
										else if (dollars > 0)
											{
												JOptionPane.showMessageDialog(frame, "You have $" + dollars + " remaining.");
												JOptionPane.showMessageDialog(frame, "You have $" + dollars + " remaining.");
												Object[] yesOrNo = {"Yes", "No"};
												className = JOptionPane.showOptionDialog(
														frame, 
														"Would you like to play again, " + name + "?",
														"Play Craps Again?",
														JOptionPane.YES_NO_CANCEL_OPTION,
														JOptionPane.QUESTION_MESSAGE,
														null, 
														yesOrNo, 
														yesOrNo[1]
														);
												switch (className)
													{
														case 0:
																{
																	JOptionPane.showMessageDialog(frame, "Let's play!");
																	break;
																}
														case 1:
																{
																	letsPlayCraps = false;
																	break;
																}
													}
											}
									}
								else
									{
										boolean rollingAgain = true;
										while (rollingAgain)
											{	
												JOptionPane.showMessageDialog(frame, "You rolled a " + dieRoll1 + " and a " + dieRoll2 + " for a total of " + totalDice + ".");
												JOptionPane.showMessageDialog(frame, "Your point is " + totalDice + ", " + name + ".");
												boolean rollingOn = true;
												while (rollingOn)
													{
														int dieRoll3 = (int)(Math.random()*6) + 1;
														int dieRoll4 = (int)(Math.random()*6) + 1;
														int totalDice2 = dieRoll3 + dieRoll4;
														if (totalDice2 == 7)
															{
																JOptionPane.showMessageDialog(frame, "Your point is " + totalDice + ", but you rolled a " + dieRoll3 + " and a " + dieRoll4 + " for a total of " + totalDice2 + ".");
																JOptionPane.showMessageDialog(frame, "Sorry, but you lost, " + name + ".");
																dollars -= bet;
																if (dollars == 0)
																	{
																		JOptionPane.showMessageDialog(frame, "You have lost everything.");
																		stillPlaying = false;
																		rollingAgain = false;
																		rollingOn = false;
																		letsPlayCraps = false;
																	}
																else if (dollars > 0)
																	{
																		JOptionPane.showMessageDialog(frame, "You have $" + dollars + " remaining.");
																		Object[] yesOrNo = {"Yes", "No"};
																		className = JOptionPane.showOptionDialog(
																				frame, 
																				"Would you like to play again, " + name + "?",
																				"Play Craps Again?",
																				JOptionPane.YES_NO_CANCEL_OPTION,
																				JOptionPane.QUESTION_MESSAGE,
																				null, 
																				yesOrNo, 
																				yesOrNo[1]
																				);
																		switch (className)
																			{
																				case 0:
																						{
																							JOptionPane.showMessageDialog(frame, "Let's play!");
																							rollingAgain = false;
																							rollingOn = false;
																							break;
																						}
																				case 1:
																						{
																							rollingAgain = false;
																							rollingOn = false;
																							letsPlayCraps = false;
																							break;
																						}
																			}
																	}
															}
														else if (totalDice2 == totalDice)
															{
																JOptionPane.showMessageDialog(frame, "Your point is " + totalDice + " and you rolled a " + dieRoll3 + " and a " + dieRoll4 + " for a total of " + totalDice2 + ".");
																JOptionPane.showMessageDialog(frame, "You win " + name + "!");
																dollars += bet;
																if (dollars == 0)
																	{
																		JOptionPane.showMessageDialog(frame, "You have lost everything.");
																		stillPlaying = false;
																	}
																else if (dollars > 0)
																	{
																		JOptionPane.showMessageDialog(frame, "You have $" + dollars + " remaining.");
																		Object[] yesOrNo = {"Yes", "No"};
																		className = JOptionPane.showOptionDialog(
																				frame, 
																				"Would you like to play again, " + name + "?",
																				"Play Craps Again?",
																				JOptionPane.YES_NO_CANCEL_OPTION,
																				JOptionPane.QUESTION_MESSAGE,
																				null, 
																				yesOrNo, 
																				yesOrNo[1]
																				);
																		switch (className)
																			{
																				case 0:
																						{
																							JOptionPane.showMessageDialog(frame, "Let's play!");
																							rollingAgain = false;
																							rollingOn = false;
																							break;
																						}
																				case 1:
																						{
																							rollingAgain = false;
																							rollingOn = false;
																							letsPlayCraps = false;
																							break;
																						}
																			}
																	}
															}
													}
											}
									}
					}
			}
		//SLOT MACHINE
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
				System.out.println("You have $" + dollars + ".");
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
												System.out.println("Would you like to play Slots again, " + name + "?");
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
														stillPlaying = false;
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
		//KENO
		public static void keno()
			{
				Scanner userInput = new Scanner (System.in);
				int [] kenoNumbers = new int [20];
				boolean stillPlayingKeno = true;
				for (int i = 0; i < 20; i++)
					{
						kenoNumbers [i] = (int) (Math.random()*80) + 1;
						boolean twoKenoNumbersTheSame = true;
						while (twoKenoNumbersTheSame == true)
						{
							for (int j = 0; j < 20; j++)
								{
									if (kenoNumbers [i] == kenoNumbers [j])
										{
											if (i == j)
												{
													twoKenoNumbersTheSame = false;
												}
												else
												{
													kenoNumbers [i] = (int) (Math.random()*80) + 1;
												}
										}
								}
						}
					}
				System.out.println("Welcome to Keno!");
				System.out.println("Keno is a number based betting game. You get to pick up to 20 numbers from 1-80.");
				System.out.println("20 numbers will then be randomely selected.");
				System.out.println("The more numbers that match the ones you picked, the more you win!.");
				System.out.println("You have $" + dollars + ".");
				while (stillPlayingKeno == true)
					{
						System.out.println("How much would you like to bet?");
						int bet = userInput.nextInt();
						if (bet > dollars)
						{
							System.out.println("You have entered an invalid bet.");
							System.out.println("Enter a bet that is equal to or less than $" + dollars + ".");
							bet = userInput.nextInt();
						}
					else
						{
							System.out.println("You bet $" + bet + " on this game.");
						}
						int [] numbersChosen = new int [20];
						for (int i = 0; i < 20; i++)
							{
								System.out.println("Enter a number you want to choose.");
								numbersChosen [i] = userInput.nextInt();
							}
						System.out.println("The winning numbers are:");
						for (int i = 0; i < 20; i++) 
							{
								if (i < 19)
									{
										System.out.print(kenoNumbers[i] + ", ");
									}
								else
									{
										System.out.println("and " + kenoNumbers[i]);
									}
							}		
						int numbersThatMatch = 0;
						for (int i = 0; i < 20; i++ )
							{
								if (kenoNumbers[i] == numbersChosen[0] || kenoNumbers[i] == numbersChosen[1] || kenoNumbers[i] == numbersChosen[2] || kenoNumbers[i] == numbersChosen[3] || kenoNumbers[i] == numbersChosen[4] || kenoNumbers[i] == numbersChosen[5] || kenoNumbers[i] == numbersChosen[6] || kenoNumbers[i] == numbersChosen[7] || kenoNumbers[i] == numbersChosen[8] || kenoNumbers[i] == numbersChosen[9] || kenoNumbers[i] == numbersChosen[10] || kenoNumbers[i] == numbersChosen[11] || kenoNumbers[i] == numbersChosen[12] || kenoNumbers[i] == numbersChosen[13] || kenoNumbers[i] == numbersChosen[14] || kenoNumbers[i] == numbersChosen[15] || kenoNumbers[i] == numbersChosen[16] || kenoNumbers[i] == numbersChosen[17] || kenoNumbers[i] == numbersChosen[18] || kenoNumbers[i] == numbersChosen[19])
									{
										numbersThatMatch++;
									}
							}
						if (numbersThatMatch > 0)
							{
								System.out.println("You had " + numbersThatMatch + " winning numbers!");
								bet = bet*numbersThatMatch;
								System.out.println("You win $" + bet + "!");
								dollars = dollars + bet;
								System.out.println();
								System.out.println("You have $" + dollars + " remaining.");
								System.out.println("Would you like to play Keno again, " + name + "?");
								System.out.println("(1) Yes");
								System.out.println("(2) No");
								int playKenoAgain = userInput.nextInt();
								if (playKenoAgain == 2)
									{
										System.out.println("Come play Keno again soon!");
										stillPlayingKeno = false;
									}

							}
						else
							{
								System.out.println("You had 0 winning numbers.");
								System.out.println("You lose.");
								dollars = dollars - bet;
								if (dollars < 1)
									{
										System.out.println("You have lost everything.");
										stillPlaying = false;
										stillPlayingKeno = false;
										
									}
								else
									{
										System.out.println("You have $" + dollars + " remaining.");
										System.out.println("Would you like to play Keno again, " + name + "?");
										System.out.println("(1) Yes");
										System.out.println("(2) No");
										int playKenoAgain = userInput.nextInt();
										if (playKenoAgain == 2)
											{
												System.out.println("Come play Keno again soon!");
												stillPlayingKeno = false;
											}
									}
							}
					}
			}
		//BLACKJACK
		public static void blackjack()
			{
				generateRandomNames();
				introduceBlackjack();
				System.out.println();
				while (stillPlayingBlackjack)
					{
						assignBets();
						shuffletheDeck();
						deal();
						System.out.println();
						playARound();
						System.out.println();
						determineWinners();
						System.out.println();
						wantToPlayAgain();
					}
			}
		public static void introduceBlackjack()
			{
				System.out.println("Blackjack is a card game in which your goal is to get closer, than the dealer, to 21 points.");
				System.out.println("You should try to get as close to twenty-one as you can without going over.");
				System.out.println();
				System.out.print("Loading");
				for (int i = 0; i < 3; i++)
					{
						try
							{
								Thread.sleep(1250);
							} catch (InterruptedException e)
							{
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						System.out.print(".");
					}
				System.out.println();
				System.out.println("Did you know that it is possible to use an entire half of the deck in a single round and not have a single player bust?");
				System.out.print("Loading");
				for (int i = 0; i < 3; i++)
					{
						try
							{
								Thread.sleep(1250);
							} catch (InterruptedException e)
							{
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						System.out.print(".");
					}
				System.out.println();
				System.out.println();
				System.out.println("You will be playing against the dealer, " + name1 + ", and " + name2 + ".");
			}
		public static void generateRandomNames()
			{
				fillNameArray();
				pickRandomFirstName();
				pickRandomSecondName();
			}
		public static void pickRandomFirstName()
			{
				int i = (int)(Math.random()*16);
				name1 = nameArray.get(i);
			}
		public static void pickRandomSecondName()
			{
				int i = (int)(Math.random()*16);
				name2 = nameArray.get(i);
				while (name1 == name2)
					{
						i = (int)(Math.random()*16);
						name2 = nameArray.get(i);
					}
			}
		public static void assignBets()
			{
				int betMax1 = aIDollars1 / 2;
				int betMax2 = aIDollars2 / 2;
				if (aIDollars1 < 200)
					{
						aIDollars1 = aIDollars1 + 750;
						aIBet1 = (aIDollars2 / 4) + (int)(Math.random()*betMax1);
						System.out.println(name1 + " bet $" + aIBet1 + ".");
					}
				else
					{
						aIBet1 = (aIDollars1 / 4) + (int)(Math.random()*betMax1);
						System.out.println(name1 + " bet $" + aIBet1 + ".");
					}
				if (aIDollars2 < 200)
					{
						aIDollars2 = aIDollars2 + 750;
						aIBet2 = (aIDollars2 / 4) + (int)(Math.random()*betMax2);
						System.out.println(name2 + " bet $" + aIBet2 + ".");
					}
				else
					{
						aIBet2 = (aIDollars2 / 4) + (int)(Math.random()*betMax2);
						System.out.println(name2 + " bet $" + aIBet2 + ".");
					}
				System.out.println("You have $" + dollars + ", " + name + ".");
				System.out.println("How much would you like to bet on this round?");
				bet = userInput.nextInt();
				while (bet > dollars || bet < 1)
					{
						if (bet > dollars)
							{
								System.out.println("Please enter a bet that is less than or equal to $" + dollars + ".");
								bet = userInput.nextInt();
							}
						else if (bet < 1)
							{
								System.out.println("Please enter a bet that is greater than 1.");
								bet = userInput.nextInt();
							}
					}
			}
		public static void shuffletheDeck()
			{
				fillArrayDeckOfCards();
				shuffle();
			}
		public static void fillArrayDeckOfCards()
			{
				//Hearts
				deck.add(new Card("Hearts", "Ace", 1));
				deck.add(new Card("Hearts", "2", 2));
				deck.add(new Card("Hearts", "3", 3));
				deck.add(new Card("Hearts", "4", 4));
				deck.add(new Card("Hearts", "5", 5));
				deck.add(new Card("Hearts", "6", 6));
				deck.add(new Card("Hearts", "7", 7));
				deck.add(new Card("Hearts", "8", 8));
				deck.add(new Card("Hearts", "9", 9));
				deck.add(new Card("Hearts", "10", 10));
				deck.add(new Card("Hearts", "Jack", 10));
				deck.add(new Card("Hearts", "Queen", 10));
				deck.add(new Card("Hearts", "King", 10));
				//Diamonds
				deck.add(new Card("Diamonds", "Ace", 1));
				deck.add(new Card("Diamonds", "2", 2));
				deck.add(new Card("Diamonds", "3", 3));
				deck.add(new Card("Diamonds", "4", 4));
				deck.add(new Card("Diamonds", "5", 5));
				deck.add(new Card("Diamonds", "6", 6));
				deck.add(new Card("Diamonds", "7", 7));
				deck.add(new Card("Diamonds", "8", 8));
				deck.add(new Card("Diamonds", "9", 9));
				deck.add(new Card("Diamonds", "10", 10));
				deck.add(new Card("Diamonds", "Jack", 10));
				deck.add(new Card("Diamonds", "Queen", 10));
				deck.add(new Card("Diamonds", "King", 10));
				//Clubs
				deck.add(new Card("Clubs", "Ace", 1));
				deck.add(new Card("Clubs", "2", 2));
				deck.add(new Card("Clubs", "3", 3));
				deck.add(new Card("Clubs", "4", 4));
				deck.add(new Card("Clubs", "5", 5));
				deck.add(new Card("Clubs", "6", 6));
				deck.add(new Card("Clubs", "7", 7));
				deck.add(new Card("Clubs", "8", 8));
				deck.add(new Card("Clubs", "9", 9));
				deck.add(new Card("Clubs", "10", 10));
				deck.add(new Card("Clubs", "Jack", 10));
				deck.add(new Card("Clubs", "Queen", 10));
				deck.add(new Card("Clubs", "King", 10));
				//Spades
				deck.add(new Card("Spades", "Ace", 1));
				deck.add(new Card("Spades", "2", 2));
				deck.add(new Card("Spades", "3", 3));
				deck.add(new Card("Spades", "4", 4));
				deck.add(new Card("Spades", "5", 5));
				deck.add(new Card("Spades", "6", 6));
				deck.add(new Card("Spades", "7", 7));
				deck.add(new Card("Spades", "8", 8));
				deck.add(new Card("Spades", "9", 9));
				deck.add(new Card("Spades", "10", 10));
				deck.add(new Card("Spades", "Jack", 10));
				deck.add(new Card("Spades", "Queen", 10));
				deck.add(new Card("Spades", "King", 10));
			}
		public static void shuffle()
			{
				Collections.shuffle(deck);
			}
		public static void fillNameArray()
			{
				nameArray.add("Steve");
				nameArray.add("Bill");
				nameArray.add("Frank");
				nameArray.add("Joe");
				nameArray.add("Herbert");
				nameArray.add("John");
				nameArray.add("Hank");
				nameArray.add("Paul");
				nameArray.add("Mary");
				nameArray.add("Sarah");
				nameArray.add("Maria");
				nameArray.add("Bonnie");
				nameArray.add("Suzy");
				nameArray.add("Jane");
				nameArray.add("Morgan");
				nameArray.add("Lucy");
			}
		public static void deal()
			{
				dealerHandTotal = 0;
				aIHand1Total = 0;
				aIHand2Total = 0;
				playerHandTotal = 0;
				for (int i = 1; i <= 2; i++)
					{
						playerBeingDeltTo = 0;
						assignValueIfAce();
						if (i == 1)
							{
								dealerHandTotal = dealerHandTotal + deck.get(0).getValue();
								System.out.println("The dealer has the " + deck.get(0).getRank() + " of " + deck.get(0).getSuit() + " worth " + deck.get(0).getValue() + " points.");
								deck.remove(0);
							}
						else if (i == 2)
							{
								dealerHandTotal = dealerHandTotal + deck.get(0).getValue();
								deck.remove(0);
							}
						System.out.println();
						playerBeingDeltTo = 1;
						assignValueIfAce();
						aIHand1Total = aIHand1Total + deck.get(0).getValue();
						deck.remove(0);
						playerBeingDeltTo = 2;
						assignValueIfAce();
						aIHand2Total = aIHand2Total + deck.get(0).getValue();
						deck.remove(0);
						playerBeingDeltTo = 3;
						assignValueIfAce();
						playerHandTotal = playerHandTotal + deck.get(0).getValue();
						System.out.println("You got the " + deck.get(0).getRank() + " of " + deck.get(0).getSuit() + " worth " + deck.get(0).getValue() + " points.");
						deck.remove(0);
					}
			}
		public static void assignValueIfAce()
			{
				if (deck.get(0).getValue() == 1)
					{
						if (playerBeingDeltTo == 0)
							{
								if (dealerHandTotal + 11 <= 21)
									{
										deck.get(0).setValue(11);
									}
								if (dealerHandTotal + 11 > 21)
									{
										deck.get(0).setValue(1);
									}
							}
						else if (playerBeingDeltTo == 1)
							{
								if (aIHand1Total + 11 <= 21)
									{
										deck.get(0).setValue(11);
									}
								if (aIHand1Total + 11 > 21)
									{
										deck.get(0).setValue(1);
									}
							}
						else if (playerBeingDeltTo == 2)
							{
								if (aIHand2Total + 11 <= 21)
									{
										deck.get(0).setValue(11);
									}
								if (aIHand2Total + 11 > 21)
									{
										deck.get(0).setValue(1);
									}
							}
						else if (playerBeingDeltTo == 3)
							{
								System.out.println("You get the " + deck.get(0).getRank() + " of " + deck.get(0).getSuit() + ".");
								System.out.println("You have " + playerHandTotal + " points. Would you like this Ace to be worth 1 or 11 points?");
								int aceValueChoice = userInput.nextInt();
								if (aceValueChoice == 1)
									{
										deck.get(0).setValue(1);
									}
								else if (aceValueChoice == 11)
									{
										deck.get(0).setValue(11);
									}
								else
									{
										System.out.println("You have " + playerHandTotal + " points. Would you like this Ace to be worth 1 or 11 points?");
									}
							}
					}
			}
		public static void playARound()
			{
				boolean aIPlayer1Playing = true;
				while (aIPlayer1Playing)
					{
						System.out.println(name1 + " has " + aIHand1Total + " points.");
						if (aIHand1Total < 16)
							{
								System.out.println(name1 + " hits and gets another card.");
								playerBeingDeltTo = 0;
								assignValueIfAce();
								aIHand1Total = aIHand1Total + deck.get(0).getValue();
								deck.remove(0);
							}
						else if (aIHand1Total > 21)
							{
								System.out.println(name1 + " bust.");
								System.out.println(name1 + " lost $" + aIBet1 + ".");
								aIDollars1 = aIDollars1 - aIBet1;
								aIPlayer1Playing = false;
							}
						else if (aIHand1Total >= 16)
							{
								System.out.println(name1 + " stays.");
								aIPlayer1Playing = false;
							}
					}
				System.out.println();
				boolean aIPlayer2Playing = true;
				while (aIPlayer2Playing)
					{
						System.out.println(name2 + " has " + aIHand2Total + " points.");
						if (aIHand2Total < 16)
							{
								System.out.println(name2 + " hits and gets another card.");
								playerBeingDeltTo = 1;
								assignValueIfAce();
								aIHand2Total = aIHand2Total + deck.get(0).getValue();
								deck.remove(0);
							}
						else if (aIHand2Total > 21)
							{
								System.out.println(name2 + " bust.");
								System.out.println(name2 + " lost $" + aIBet2 + ".");
								aIDollars2 = aIDollars2 - aIBet2;
								aIPlayer2Playing = false;
							}
						else if (aIHand2Total >= 16)
							{
								System.out.println(name2 + " stays.");
								aIPlayer2Playing = false;
							}
					}
				System.out.println();
				boolean playerPlaying = true;
				while (playerPlaying)
					{
						System.out.println("You have a total of " + playerHandTotal + " points");
						if (playerHandTotal > 21)
							{
								System.out.println("You bust.");
								System.out.println("You lost $" + bet + ".");
								dollars = dollars - bet;
								playerPlaying = false;
							}
						else
							{
								System.out.println("(1) Hit");
								System.out.println("(2) Stay");
								int hitOrStay = userInput.nextInt();
								if (hitOrStay == 1)
									{
										if (deck.get(0).getValue() == 1)
											{
												playerBeingDeltTo = 2;
												assignValueIfAce();
											}
										else
											{
												System.out.println("You hit and get the " + deck.get(0).getRank() + " of " + deck.get(0).getSuit() + " worth " + deck.get(0).getValue() + " points.");
												playerHandTotal = playerHandTotal + deck.get(0).getValue();
												deck.remove(0);
											}
									}
								else if (hitOrStay == 2)
									{
										System.out.println("You stay with a total of " + playerHandTotal + ".");
										playerPlaying = false;
									}
							}
					}
				System.out.println();
				boolean dealerPlaying = true;
				while (dealerPlaying)
					{
						System.out.println("The dealer has " + dealerHandTotal + " points.");
						if (dealerHandTotal < 16)
							{
								System.out.print("The dealer hits and gets the");
								for (int i = 0; i <3; i++)
									{
										System.out.print(".");
										try
											{
												Thread.sleep(1500);
											} catch (InterruptedException e)
											{
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
									}
								dealerHandTotal = dealerHandTotal + deck.get(0).getValue();
								System.out.println(deck.get(0).getRank() + " of " + deck.get(0).getSuit() + " worth " + deck.get(0).getValue() + " points.");
								deck.remove(0);
							}
						else if (dealerHandTotal > 21)
							{
								System.out.println("The dealer bust.");
								dealerPlaying = false;
							}
						else if (dealerHandTotal >= 16)
							{
								System.out.println("The dealer stays.");
								dealerPlaying = false;
							}
					}
			}
		public static void determineWinners()
			{
				// compare hand totals to dealer's hand
				if (dealerHandTotal > 21)
					{
						if (aIHand1Total < 21)
							{
								System.out.println(name1 + " wins $" + aIBet1 + ".");
								aIDollars1 = aIDollars1 + aIBet1; 
							}
						if (aIHand2Total < 21)
							{
								System.out.println(name2 + " wins $" + aIBet2 + ".");
								aIDollars2 = aIDollars2 + aIBet2;
							}
						if (playerHandTotal < 21)
							{
								System.out.println("You win $" + bet + ".");
								dollars = dollars + bet;
							}
					}
				else if (dealerHandTotal <= 21)
					{
						if (aIHand1Total <= 21)
							{
								if (aIHand1Total < dealerHandTotal)
									{
										System.out.println(name1 + " had " + aIHand1Total + " points, but the dealer was closer to 21 with " + dealerHandTotal + " points.");
										System.out.println(name1 + " lost $" + aIBet1 + ".");
										aIDollars1 = aIDollars1 - aIBet1;
									}
								else if (aIHand1Total > dealerHandTotal)
									{
										System.out.println(name1 + " had " + aIHand1Total + " points, and the dealer had " + dealerHandTotal + ".");
										System.out.println(name1 + " wins $" + aIBet1 + ".");
										aIDollars1 = aIDollars1 + aIBet1;
									}
								else
									{
										System.out.println(name1 + " had " + aIHand1Total + " points, and the dealer also had " + dealerHandTotal + " points.");
										System.out.println(name1 + " and the dealer tied.");
										System.out.println(name1 + " wins $" + aIBet1 + ".");
										aIDollars1 = aIDollars1 + aIBet1;
									}
							}
						if (aIHand2Total <= 21)
							{
								if (aIHand2Total < dealerHandTotal)
									{
										System.out.println(name2 + " had " + aIHand2Total + " points, but the dealer was closer to 21 with " + dealerHandTotal + " points.");
										System.out.println(name2 + " lost $" + aIBet2 + ".");
										aIDollars2 = aIDollars2 - aIBet2;
									}
								else if (aIHand2Total > dealerHandTotal)
									{
										System.out.println(name2 + " had " + aIHand2Total + " points, and the dealer had " + dealerHandTotal + ".");
										System.out.println(name2 + " wins $" + aIBet2 + ".");
										aIDollars2 = aIDollars2 + aIBet2;
									}
								else
									{
										System.out.println(name2 + " had " + aIHand2Total + " points, and the dealer also had " + dealerHandTotal + " points.");
										System.out.println(name2 + " and the dealer tied.");
										System.out.println(name2 + " wins $" + aIBet2 + ".");
										aIDollars2 = aIDollars2 + aIBet2;
									}
							}
						if (playerHandTotal <= 21)
							{
								if (playerHandTotal < dealerHandTotal)
									{
										System.out.println("You have " + playerHandTotal + " points, but the dealer was closer to 21 with " + dealerHandTotal + " points.");
										System.out.println("You lost $" + bet + ".");
										dollars = dollars - bet;
									}
								else if (playerHandTotal > dealerHandTotal)
									{
										System.out.println("You had " + playerHandTotal + " points, and the dealer had " + dealerHandTotal + ".");
										System.out.println("You win $" + bet +".");
										dollars = dollars + bet;
									}
								else
									{
										System.out.println("You had " + playerHandTotal + " points, and the dealer also had " + dealerHandTotal + " points.");
										System.out.println("You and the dealer tied.");
										System.out.println("You win $" + bet +".");
										dollars = dollars + bet;
									}
							}
					}
			}
		public static void wantToPlayAgain()
			{
				if (dollars == 0)
					{
						System.out.println("You have $0.");
						stillPlayingBlackjack = false;
					}
				else if (deck.size() >= 26)
					{
						System.out.println("You have $" + dollars + ".");
						System.out.println("Do you want to play BlackJack again?");
						System.out.println("(1) Yes");
						System.out.println("(2) No");
						int playBlackjackAgain = userInput.nextInt();
						if (playBlackjackAgain == 2)
							{
								System.out.println("Come back when you want to play Blackjack!");
								stillPlayingBlackjack = false;
							}
						else if (playBlackjackAgain == 1)
							{
								stillPlayingBlackjack = true;
							}
						else
							{
								System.out.println();
								System.out.println("You have $" + dollars + ".");
								System.out.println("Do you want to play BlackJack again?");
								System.out.println("(1) Yes");
								System.out.println("(2) No");
								playBlackjackAgain = userInput.nextInt();
								if (playBlackjackAgain == 2)
									{
										System.out.println("Come back when you want to play Blackjack!");
										stillPlayingBlackjack = false;
									}
								else if (playBlackjackAgain == 1)
									{
										stillPlayingBlackjack = true;
									}
							}
					}
				else
					{
						System.out.println("You have $" + dollars + ".");
						System.out.println("Do you want to play BlackJack again?");
						System.out.println("(1) Yes");
						System.out.println("(2) No");
						int playBlackjackAgain = userInput.nextInt();
						if (playBlackjackAgain == 2)
							{
								System.out.println("Come back when you want to play Blackjack!");
								stillPlayingBlackjack = false;
							}
						else if (playBlackjackAgain == 1)
							{
								for (Card c : deck)
									{
										deck.remove(c);
									}
								fillArrayDeckOfCards();
							}
					}					
			}
	}