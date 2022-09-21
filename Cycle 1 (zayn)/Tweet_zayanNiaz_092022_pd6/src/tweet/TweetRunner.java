package tweet;
import java.util.Scanner;

public class TweetRunner {
    public static void main(String args[]) {
        String str;
        int rtwts, lks;
        Scanner myObj = new Scanner(System.in);

        System.out.println("Input your tweet's message: ");
        str = myObj.nextLine();
        System.out.println("Input the number of retweets your tweet has: ");
        rtwts = myObj.nextInt();
        System.out.println("Input the number of likes your tweet has: ");
        lks = myObj.nextInt();

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
        
        myObj.close();
    }
}