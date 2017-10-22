import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Blackjack
	{ 
		static Scanner userInput = new Scanner(System.in);
		static String name = "";
		static ArrayList <Card> deck = new ArrayList<Card>();
		static ArrayList <String> nameArray = new ArrayList <String>();
		static int aIDollars1 = (int)(Math.random())*250 + 751;
		static int aIDollars2 = (int)(Math.random())*250 + 751;
		static int dollars = 1000;
		static int aIBet1 = 0;
		static int aIBet2 = 0;
		static int bet = 0;
		static int aIHand1Total = 0;
		static int aIHand2Total = 0;
		static int dealerHandTotal = 0;
		static int playerHandTotal = 0;
		static String name1 = "";
		static String name2 = "";
		static boolean stillPlayingBlackjack = true;
		//dealer = 0
		//aIPlayer1 = 1
		//aIPlayer2 = 2
		//player = 3
		static int playerBeingDeltTo = 0;
		public static void main(String[] args)
			{
				blackjack();
			}
		public static void blackjack()
			{
				generateRandomNames();
				greetUser();
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
				System.out.println("Loading...");
				System.out.println("Did you know that it is possible to use an entire half of the deck in a single round and not have a single player bust?");
				System.out.println("Loading...");
				System.out.println();
				System.out.println("You will be playing against the dealer, " + name1 + ", and " + name2 + ".");
			}
		public static void greetUser()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Welcome to the HowtoCasino! What is your name?");
				name = userInput.nextLine();
				System.out.println("Welcome, " + name + "!");
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
				while (bet > dollars)
					{
						System.out.println("Enter a bet that is less or equal to $" + dollars + ".");
						bet = userInput.nextInt();
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
						dealerHandTotal = dealerHandTotal + deck.get(0).getValue();
						deck.remove(0);
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
								System.out.println("You get an " + deck.get(0).getRank() + " of " + deck.get(0).getSuit() + ".");
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
										System.out.println("You hit and get the " + deck.get(0).getValue());
										playerHandTotal = playerHandTotal + deck.get(0).getValue();
										deck.remove(0);
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
								System.out.println("The dealer hits and gets another card.");
								dealerHandTotal = dealerHandTotal + deck.get(0).getValue();
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
						System.out.println("Do you want to play BlackJack again?");
						System.out.println("(1) Yes");
						System.out.println("(2) No");
						int playBlackjackAgain = userInput.nextInt();
						if (playBlackjackAgain == 2)
							{
								System.out.println("Come back when you want to play Blackjack!");
								stillPlayingBlackjack = false;
							}
					}
				else
					{
						System.out.println("Do you want to play BlackJack again?");
						System.out.println("(1) Yes");
						System.out.println("(2) No");
						int playBlackjackAgain = userInput.nextInt();
						if (playBlackjackAgain == 2)
							{
								System.out.println("Come back when you want to play Blackjack!");
								stillPlayingBlackjack = false;
							}
						else
							{
								for (int i = deck.size(); i > 0 ; i++)
									{
										deck.remove(0);
									}
								fillArrayDeckOfCards();
							}
					}
			}
	}
