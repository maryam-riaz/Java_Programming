import java.security.SecureRandom;

public class ShufflingDeckOfCards {
	public static void main(String[] args) {
		DeckOfCards d = new DeckOfCards();
		d.shuffle();
		for (int i =0; i<52; i++){
			System.out.printf("%-20s", d.dealCard());
			if((i+1) % 4 == 0)
			System.out.println();
		}
	}
}

class Card {
	private final String face;
	private final String suit;

	public Card(String face, String suit) {
		this.face = face;
		this.suit = suit;
	}

	public String toString() {
		return face + " of " + suit;
	}
}

class DeckOfCards {
	private Card[] deck;
	private int currentCard = 0;
	private static final int NUMBER_OF_CARDS = 52;

	public DeckOfCards() {
		String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six",
				"Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
		String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
		deck = new Card[NUMBER_OF_CARDS];
		for (int i = 0; i < NUMBER_OF_CARDS; i++) {
			deck[i] = new Card(faces[i % 13], suits[i / 13]);
		}

	}

	//shuffle using Fisher-Yates Algorithm
	public void shuffle() {
		SecureRandom randomNumber = new SecureRandom();
		for (int i = NUMBER_OF_CARDS - 1; i > 0; i--) {
			int another = randomNumber.nextInt(i + 1);
			Card temp = deck[i];
			deck[i] = deck[another];
			deck[another] = temp;
		}
	}

	public Card dealCard() {
		if (currentCard < deck.length)
			return deck[currentCard++];
		else
			return null;
	}
}
