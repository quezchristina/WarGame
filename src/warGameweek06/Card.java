package warGameweek06;

public class Card {
/* Create:
 * -Fields:
 * value & name
 * Methods :
 * 	- getters & setters 
 * - describe (print out info about card) 
 */
 
String cardName;
String symbol;
int value;

public Card(String[] values, String symbol2, int i) {
	value = 0;
	cardName= ""; 
}
public Card(int value, String cardName, String symbol) {
	this.value = value;
	this.cardName = cardName;
	this.symbol = symbol;
}
public String getName() {
	return cardName;
}
public Integer getValue() {
	return value;
}
public String getSymbol() {
	return symbol;
}
public void setcardName (String newCardName) {
	cardName = newCardName;
}
public void setValue(int cardValue) {
	value = cardValue;
}
public void setSymbol(String newCardSymbol) {
	symbol = newCardSymbol;
}
public void describe() {
	System.out.println("Card description: " + cardName + value);
}

}





