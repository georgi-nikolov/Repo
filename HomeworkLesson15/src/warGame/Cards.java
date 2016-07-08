package warGame;

public class Cards {
	private  String value;
	private  String suit;
	private int power;
	
	Cards(String value, String suit){
		
		
			this.suit = suit;
	}
	
	String getSuit(){
		return suit;
	}
	
	void setSuit(String suit){
		if(this.suit == "Clubs" || this.suit == "Diamonds" || this.suit == "Hearts" || this.suit == "Spades")
			this.suit = suit;
	}
	
	void setValue(String value){
		if(this.value == "2" || this.value == "3" || this.value == "4" || this.value == "5" || this.value == "6" || this.value == "7" || this.value == "8"
				   || this.value == "9" || this.value == "10" || this.value == "J" || this.value == "Q" || this.value == "K" || this.value == "A"){
					this.value = value;
				}
	}
	
	String getValue(){
		return value;
	}
	
	int getPower(){
		return power;
	}
	
	void setPower(int power){
		this.power = power;
	}
	
}
