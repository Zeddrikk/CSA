package charnum;

public class TriangleFive 
{ 
  private char letter; 
  private int amount; 
public TriangleFive() 
{ 
} 
public TriangleFive(char c, int amt) 
{ 
	letter = c;
	amount = amt;
	
} 
public void setLetter(char c) 
{ 
	letter = c;
} 
public void setAmount(int amt) 
{ 
	amount = amt;
} 
public String toString() 
{ 
String output=""; 
int ascii = letter;
for (int row = 0; row<amount; row++) {
	ascii = letter;
	for(int letterAdd = 0; letterAdd<amount-row;letterAdd++) {
		
		for(int number = 0; number<amount-letterAdd; number ++) {
			output+=(char)(ascii);
		}
		ascii++;
		if(ascii==91) {
			ascii =65;
		}
		output+=" ";
}
	output+="\n";
	
}



return output; 
} 
}