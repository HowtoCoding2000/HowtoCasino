import java.util.Scanner;
public class SlotMachine
	{
		public static void main(String[] args)
			{
				Scanner userInput = new Scanner(System.in);
				int dollars = 100;
				System.out.println("Welcome to Slots.");
				System.out.println("You have $" + dollars + ".");
				System.out.println("We offer 3 slot machines for you to choose from.");
				System.out.println("(1) Jungle Jackpot");
				System.out.println("(2) Aces Adventure");
				System.out.println("(3) Triple Threat");
				int machine = userInput.nextInt();
				if (machine == 1)
					{
						System.out.println("You've chosen Jungle Jackpot.");
						System.out.println("'G'day mate. Step right up and face the wild jungle in Jungle Jackpot,'says a recorded voice from the machine's speaker.");
						System.out.println("This slot machine has seven pictures with different winnings for each three in a row.");
						System.out.println("How much would you like to bet on this spin?");
						int bet = userInput.nextInt();
						System.out.println("'You just bet $" + bet + "mate,' says the speaker. 'Let's get started!'");
						System.out.println("(1) Pull the lever to spin.");
						int spin = userInput.nextInt();
						if (spin == 1)
							{
								System.out.println("Spinning...");
								int picture = (int)(Math.random()*7) + 1;
								int picture2 = (int)(Math.random()*7) + 1;
								int picture3 = (int)(Math.random()*7) + 1;
								if (picture == picture2 & picture == picture3)
									{
										String pictures = "0";
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
										String pictures2 = "0";
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
														pictures2 = "Tiger King";
														break;
													}
											case 6:
													{
														pictures2 = "Amazon Queen";
														break;
													}
											default:
													{
														pictures2 = "Monkey Joker";
													}
										}
										String pictures3 = "0";
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
														pictures3 = "Tiger King";
														break;
													}
											case 6:
													{
														pictures3 = "Amazon Queen";
														break;
													}
											default:
													{
														pictures3 = "Monkey Joker";
													}
										}
										System.out.println(pictures + pictures2 + pictures3);
									}
							}
						else
							{
								System.out.println("Spinning");
								int picture = (int)(Math.random()*7) + 1;
								int picture2 = (int)(Math.random()*7) + 1;
								int picture3 = (int)(Math.random()*7) + 1;
								if (picture == picture2 & picture == picture3)
									{
										String pictures = "0";
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
														pictures = "Tiger King";
														break;
													}
											case 6:
													{
														pictures = "Amazon Queen";
														break;
													}
											default:
													{
														pictures = "Monkey Joker";
													}				
										}
										String pictures2 = "0";
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
														pictures2 = "heart";
														break;
													}
											case 5:
													{
														pictures2 = "Tiger King";
														break;
													}
											case 6:
													{
														pictures2 = "Amazon Queen";
														break;
													}
											default:
													{
														pictures2 = "Monkey Joker";
													}
										}
										String pictures3 = "0";
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
														pictures3 = "Tiger King";
														break;
													}
											case 6:
													{
														pictures3 = "Amazon Queen";
														break;
													}
											default:
													{
														pictures3 = "Monkey Joker";
													}
										}
										System.out.println(pictures + pictures2 + pictures3);
									}
							}
						
					}
			}
	}
