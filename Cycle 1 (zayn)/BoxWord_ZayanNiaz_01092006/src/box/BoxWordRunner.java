package box;
import static java.lang.System.*;

public class BoxWordRunner
{
   public static void main( String args[] )
   {
	   BoxWord boxword = new BoxWord("SQUARE");
	   System.out.println(boxword);
	   boxword.setWord("BOX");
	   System.out.println(boxword);
	   boxword.setWord("A");
	   System.out.println(boxword);
	   boxword.setWord("IT");
	   System.out.println(boxword);
	   boxword.setWord("TOAD");
	   System.out.println(boxword);
	  
	   
	   
	}
}
