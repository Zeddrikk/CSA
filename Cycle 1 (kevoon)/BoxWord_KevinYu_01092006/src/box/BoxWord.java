package box;

import static java.lang.System.*;

class BoxWord
{
   private String word;

	public BoxWord()
	{
		word="";
	}

	public BoxWord(String s)
	{
		word = s;
	}

	public void setWord(String w)
	{
		word = w;
	}

	/*public String toString()
	{
		String output=word;
		
		int length = output.length();
		for(int x = 0; x< (length-2);x++) {
			output +="\n";
			output += word.charAt(x+1);
			for(int y = 0; y <(length-2);y++) {
				output += " ";
			}
			output += word.charAt(length-(x+2));
			
		}
		output+="\n";
		for(int x =length; x>0; x--) {
			output+=word.charAt(x-1);
			
			}
		return output;
	}*/
	public String toString() {
		String output = "";
		int length = word.length();
		String reverse ="";
		for(int x = length-1; x>=0;x--) {
			reverse +=word.charAt(x);
			
		}
		boolean bruh=false;
		for(int x = 0; x<length;x++) {
			output += word.charAt(x);
			for(int y= 1 ;y<length;y++) {
				if(x%length >0 && x%length<length-1&&y<length-1) {
					output +=" ";
					bruh = true;
					
				}
				else if(x%length ==0){
						output+=word.charAt(y);
						
						
				}
				else if(x%length == length-1) {
						output+=reverse.charAt(y);
					
				}
				
				
			}
			if(bruh) {
				output+= reverse.charAt(x);
				
				bruh=false;
			}
			
			
			output+="\n";
		}
		
		
		
		
		
		return output;
		
	}
}