package warGameweek06;

public class App {

	public static void main(String[] args) {
//Instantiate a deck
Deck stack = new Deck();



 // 2 players
Player playerName1 = new Player();
playerName1.setplayerName("Rosie");

Player playerName2 = new Player();
playerName2.setplayerName("Freddy");

// traditional for loop iterate 52 times calling the draw method
for (int i = 0; i < 52; i++) {
	if(i % 2 == 0) {
		playerName1.draw(stack);
	} else {
		playerName2.draw(stack);
	}
}
// traditional for loop iterate 26 times & call flip method
for (int i = 0; i< 26; i++) {
	Card player1CardName = playerName1.flip();
	Card player2CardName = playerName2.flip(); 
	if (player1CardName.getValue() > player2CardName.getValue()) {
		playerName1.incrementScore();
	} else if (player2CardName.getValue() > player1CardName.getValue()) {
		playerName2.incrementScore();
	}
}
//display score
System.out.println(playerName1.getplayerName() + " current score: " + playerName1.getScore());
System.out.println(playerName2.getplayerName() + "  current score: " + playerName2.getScore());


//WINNER IS:
	if (playerName1.getScore() > playerName2.getScore()) {
		System.out.println(playerName1.getplayerName() + " wins ");
	} else if (playerName2.getScore() > playerName1.getScore()) {
		System.out.println(playerName2.getplayerName() + " wins ");
	} else if (playerName1.getScore() == playerName2.getScore()) {
		System.out.println("Draw");
	}

	}
}
