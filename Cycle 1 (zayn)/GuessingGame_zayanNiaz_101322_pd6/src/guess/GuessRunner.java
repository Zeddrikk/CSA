package guess;

import java.util.Scanner;
public class GuessRunner
{
public static void main(String args[])
{
	Scanner keyboard = new Scanner(System.in);
	String response;
	boolean play=true;
	int stop=0;
	GuessingGame game = new GuessingGame();
while(play){
	System.out.println("Guessing Game - how many numbers? ");
	stop=keyboard.nextInt();
	game.playGame(stop);
	System.out.println("\n"
			+ "\n"
			+ "\n"
			+ "\n"
			+ "Do you want to play again? ");
	response = keyboard.next();
	if(response.equals("y")) {
		
	}
	else {
		play = false;
	}
}
}
}
