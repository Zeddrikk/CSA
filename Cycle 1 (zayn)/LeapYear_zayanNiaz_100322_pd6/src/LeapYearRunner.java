import static java.lang.System.*;
import java.util.Scanner;

public class LeapYearRunner {
    public static void main( String[] args) {
        LeapYear.exampleLeapYear(1253);
        LeapYear.exampleLeapYear(209);
        LeapYear.exampleLeapYear(2131);
        LeapYear.exampleLeapYear(400);
        LeapYear.exampleLeapYear(4000);
        LeapYear.exampleLeapYear(1500);
        LeapYear.exampleLeapYear(1600);
        out.println();

        Scanner keyboard = new Scanner(System.in);

        out.print("Enter a year :: ");
        int year = keyboard.nextInt();
        if( LeapYear.isLeapYear(year) )
            out.println(year + " is a Leap Year." );
        if( !LeapYear.isLeapYear(year) )
            out.println(year + " is NOT a Leap Year." );
    }
}