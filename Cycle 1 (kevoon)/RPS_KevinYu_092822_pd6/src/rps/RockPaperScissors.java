package rps;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  
import java.util.Scanner;
import static java.lang.System.*;
public class RockPaperScissors
{
private String playChoice;
private String compChoice= "";
public void setPChoice(String c) {
	playChoice = c;
	int comp = (int)(Math.random() * 3);
	if(comp == 0) 
		compChoice = "R";
	if(comp ==1)
		compChoice = "P";
	if(comp==2)
		compChoice = "S";
}
public String determineWinner()
{
	
	String winner="";
if(compChoice.equals(playChoice)) {
	winner = "!Draw Game!";
}
else if(compChoice.equals("P") && playChoice.equals("R")) {
	winner = "!Computer wins <<Paper Covers Rock>>!";
	
}
else if(compChoice.equals("P") && playChoice.equals("S")) {
	winner = "!Player wins <<Scissors Cuts Paper>>!";
	
}
else if(compChoice.equals("S") && playChoice.equals("R")) {
	winner = "!Plauer wins <<Rock Breaks Scissors>>!";
	
}
else if(compChoice.equals("S") && playChoice.equals("P")) {
	winner = "!Computer wins <<Scissors Cuts Paper>>!";
	
}
else if(compChoice.equals("R") && playChoice.equals("S")) {
	winner = "!Computer wins <<Rock Breaks Scissors>>!";
	
}
else if(compChoice.equals("R") && playChoice.equals("P")) {
	winner = "!Player wins <<Paper Covers Rock>>!";
	
}

return winner;
}
public String toString()
{
String output="player had " + playChoice+
		 "\ncomputer had " + compChoice;
return output;
}
}
