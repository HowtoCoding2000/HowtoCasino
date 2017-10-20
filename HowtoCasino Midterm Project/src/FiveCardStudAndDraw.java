import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class FiveCardStudAndDraw
	{
		public static void main(String[] args)
			{
				greatTheUser();
				shuffletheDeck();
				deal();
			}
		public static void greatTheUser()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Welcome to the HowtoCasino! What is your name?");
				String name = userInput.nextLine();
				System.out.println("Welcome, " + name + "!");
			}
		public static void introduce5CardPoker()
			{
				System.out.println("5 Card Poker follows standard poker rules.");
				System.out.println("You will be delt 5 cards.");
				System.out.println("If you choose to play stud you are not allowed to exchange cards in your hand for new cards.");
				System.out.println("If you choose to play draw you will be allowed to exchange cards in your hand for new cards from the deck.");
				System.out.println("You will be playing against " + player1 + " and " + player2 + ".");
			}
		static ArrayList<Card>deck = new ArrayList<Card>();
		public static void shuffletheDeck()
			{
				fillArray();
				shuffle();
			}
		public static void fillArray()
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
				deck.add(new Card("Hearts", "Jack", 11));
				deck.add(new Card("Hearts", "Queen", 12));
				deck.add(new Card("Hearts", "King", 13));
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
				deck.add(new Card("Diamonds", "Jack", 11));
				deck.add(new Card("Diamonds", "Queen", 12));
				deck.add(new Card("Diamonds", "King", 13));
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
				deck.add(new Card("Clubs", "Jack", 11));
				deck.add(new Card("Clubs", "Queen", 12));
				deck.add(new Card("Clubs", "King", 13));
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
				deck.add(new Card("Spades", "Jack", 11));
				deck.add(new Card("Spades", "Queen", 12));
				deck.add(new Card("Spades", "King", 13));
			}
		public static void shuffle()
			{
				Collections.shuffle(deck);
			}
		public static void deal()
			{
				
			}
	}
