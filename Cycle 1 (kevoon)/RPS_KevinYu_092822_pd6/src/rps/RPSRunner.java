package rps;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  
import java.util.Scanner;
import static java.lang.System.*;
public class RPSRunner
{
public static void main(String args[])
{
boolean end = false;
Scanner keyboard = new Scanner(System.in);
String response;
//add in a do while loop after you get the basics up and running
String player = "";
RockPaperScissors game = new RockPaperScissors();
while(!end) {
	out.print("Rock, Paper, Scissors? [R,P,S] :: ");
	response = keyboard.next();
	//read in the player value
	game.setPChoice(response);
	System.out.println(game);
	System.out.println(game.determineWinner());
	
	System.out.print("Do you want to play again? ");
	response = keyboard.next();
	if(response.equals("N")) {
		end = true;
	}
	else {
		
	}
	
}

}
}



