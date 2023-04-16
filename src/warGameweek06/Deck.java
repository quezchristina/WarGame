package warGameweek06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
// Create list of cards
	List<Card> cards = new ArrayList<Card>();
	List<Deck> decks = new ArrayList<>();
	public Deck () {
		 String [] symbols= {"Diamonds","Hearts","Spades"," Clubs"};
		String [] values = { "2", "3","4","5","6","7","8","9","10",
				"Jack","Queen","King","Ace"};
		decks = new ArrayList<>();
		for (String symbol : symbols) {
			for (int i = 0; i < values.length; i++) {
				Card card = new Card (values,symbol,i );
				this.cards.add(card);
			}
		}
		}
	public void shuffle () {
		Collections.shuffle(decks);
	}
	public void describe() {
		for (Deck card: this.decks) {
			card.describe();
		}
	}
	public Card draw() {
		return cards.remove(0);
	}
	}

