import java.util.ArrayList;
import java.util.Collections;
public class DeckofCards
	{
		static ArrayList<Card>deck = new ArrayList<Card>();
		public static void main(String[] args)
			{
				fillArray();
				shuffle();
				printDeck();
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
		public static void printDeck()
			{
				for(Card c:deck)
					{
						System.out.println(c.getRank()+ " of " + c.getSuit());
					}
			}
	}
