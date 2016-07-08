package warGame;

public class Player {

	private String name;
	private Cards[] startingCards = new Cards[26];
	private Cards[] cardsWon = new Cards[52];
	
	String getName(){
		return this.name;
	}
	
	void setName(String name){
		if(!name.isEmpty())
			this.name = name;
	}
	
	Cards[] getStartingCards(){
		return startingCards;
	}
	
	void setStartingCards(Cards[] startingCards, int cardPosition, Cards card){
		if(cardPosition>-1 && cardPosition<26)
			startingCards[cardPosition] = card;
	}
	
	Cards[] getCardsWon(){
		return cardsWon;
	}
	
	void setCardsWon(Cards[] cardsWon, int counter, Cards card){
		cardsWon[counter] = card;
	}
}
