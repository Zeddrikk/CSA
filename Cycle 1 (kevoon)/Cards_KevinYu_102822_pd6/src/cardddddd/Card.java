package cardddddd;

public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	//instance variables
		String suit;
		int face;

  	//constructors
	public Card(String s, int f) {
		suit = s;
		face = f;
	}


	// modifiers - mutators
	public void setSuit(String s) {
		suit =s;
	}
	public void setFace(int f) {
		face = f;
		
	}
	


  	//accessors
	public String getSuit() {
		return suit;
	}
	public int getFace() {
		return face;
	}

  	//toString
	public String toString() {
		return FACES[face] + " of " + suit;
	}

 }