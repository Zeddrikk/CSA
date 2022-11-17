package cards;

public class Card {
    public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR", "FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

    //instance variables
    private String suit;
    private int face;

    //constructors
    public Card(String suit, int face) {
        this.suit = suit;
        this.face = face;
    }

    // modifiers - mutators
    public void setFace(int f) {
        face = f;
    }

    public void setSuit(String newSuit) {
        suit = newSuit;
    }

    //accessors
        //get methods
    public String getSuit() {
        return suit;
    }

    public String getFace() {
        return FACES[face];
    }

    //toString
    public String toString() {
        return getFace() + " of " + getSuit();
    }
}
