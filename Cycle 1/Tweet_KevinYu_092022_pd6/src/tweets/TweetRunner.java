//(c) A+ Computer Science
// www.apluscompsci.com

//bare bones class example
package tweets;
import java.util.Scanner;

public class TweetRunner
{
   public static void main(String args[])
	{
	   String str = "";
	   int rtwts = 0;
	   int lks = 0;
	   
		// input scheme
	   Scanner kb = new Scanner(System.in);
	   System.out.println("Enter the message:");
	   str = kb.nextLine();
	   System.out.println("Enter the number of retweets: ");
	   rtwts = kb.nextInt();
	   System.out.println("Enter the number of likes: ");
	   lks = kb.nextInt();
	   
        //test user inputs: str=â€œCVHSâ€, rtwts=0, and lks=0
	   /*str="CVHS";
	   rtwts=0;
	   lks=0;
	   */
		Tweet sample = new Tweet( str, rtwts, lks );
		sample.addLikes( 3 );
		sample.addRetweets( 28 );
		System.out.println( sample.notLiked() );    
		System.out.println( sample.kindaLiked() );            
		sample.addLikes( 35 );                
		System.out.println( sample.kindaLiked() );
		System.out.println( sample.isTrending() );        
		sample.addLikes( 13 );
		sample.addRetweets( 47 );
		System.out.println( sample.notLiked() );
		System.out.println( sample.kindaLiked() );        
		System.out.println( sample.isTrending() );
		System.out.println( sample );
		
		

			  
		//add more test code; see the Lab Doc
	}
}





/*
Scanner kb = new Scanner( System.in );

System.out.print("Enter an integer: ");
int a = kb.nextInt();         
System.out.println("int read in was " + a);
System.out.println();

System.out.print("Enter a double: ");
double d = kb.nextDouble();  // reads a double from keyboard
System.out.println("double read in was " +d);  
System.out.println();     

System.out.print("Enter a word: ");
String s = kb.next();       
System.out.println("String read in was " + s);
System.out.println();

*/