package warGameweek06;

import java.util.ArrayList;

public class Player {
ArrayList<Card> hand = new ArrayList<Card>();
String playerName;
int playerScore;

 Player(){
	playerScore = 0;
}
//Set name 
public void setplayerName (String playerName) {
	this.playerName = playerName;
}
public String getplayerName () {
	return playerName;
}
//describe 
public void describe() { 
	System.out.println(this.playerName + "has a total amount of cards:" + hand);
	for (Card card : hand) {
		card.describe();
	}
	}
public Card flip() {
	return hand.remove(0);
}
//draw 
public void draw (Deck decks) {
	hand.add(decks.draw());
}
//increment score 
public void incrementScore() {
	playerScore++;
}
public int getScore() {
	return playerScore;
}
}
