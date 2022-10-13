package guess;

import java.util.Scanner;
public class GuessingGame
{
private int upperBound;
public GuessingGame()
{
}
public void playGame(int upper)
{
	upperBound = upper;
	int num = (int)(Math.random() *upper)+1; 
	int guess = 0;
	int count =0 ;
	Scanner keyboard = new Scanner(System.in);
	
	while(guess != num) {
		System.out.println("Enter a number between 1 and " + upperBound);
		guess = keyboard.nextInt();
		if(guess<1|| guess > upperBound) {
			System.out.println("Number out of Range!");
			count--;
		}
		count++;
		
		
	}
	int percent = (int)((((double)count-1) / (double)upper) * 100 );
	System.out.println("It took " + count  + " guesses to guess " + num + " ."
			+"\nYou guessed wrong " + percent + " percent of the time.");
	
	

	

}
public String toString()
{
String output="";
return output;
}
}