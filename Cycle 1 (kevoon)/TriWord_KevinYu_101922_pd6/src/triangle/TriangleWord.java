package triangle;
import java.lang.Math;

class TriangleWord
{
   private String word;

	public TriangleWord()
	{
	}

	public TriangleWord(String w)
	{
		word = w;
		
	}

	public void setWord(String w)
	{
		word = w;
	}

	public String toString()
	{
		String result="";
		

		
		
		//total rows
		for(int y = 0; y<word.length();y++) {
			
			//beginning spaces
			for(int x=1; x<word.length()-y;x++) {
				result +=" ";
			}
			
			//barrier character
			result+=word.charAt(y);
			
			
			//middle spaces
			if(y<word.length()-1) {
				for(int x=2*(y-1)+1; x>0;x--) {
					result+=" ";
						
					}
				}
			//bottom row
			if(y==word.length()-1) {
				for(int x =word.length()-2;x>-(word.length()-1);x--) {
					result+=word.charAt(Math.abs(x));
				}
				
			}
			//final character
			if(y>0) {
				result+=word.charAt(y);
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			//new line
			result+="\n";
	
			
		}
		
		
		
		
		
		
		
		

		return result;
	}
}