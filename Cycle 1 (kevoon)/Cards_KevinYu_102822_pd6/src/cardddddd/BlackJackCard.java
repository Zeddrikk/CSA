package cardddddd;

public class BlackJackCard extends Card{

	public BlackJackCard(String s, int f) {
		super(s,f);
		
	}
	public int getValue() {
		if(face>10) {
			return 10;
		}
		else if(face>1) {
			return face;
		}
		return 11;
	}
	public String toString() {
		return FACES[face] + " of " + suit + " " + this.getValue();
	}
	//BlackJackCard extends Card

		//add in an instance variable for value

		//create a constructor that receives a suit and a face
		
		//make a getValue() method that returns the worth of the card
			//based on the rules of BlackJack
			//Ace is worth 11 for now
			//Jack, Queen, and King are all worth 10
			//all other cards are face value
			
		//make a toString method
			
}
