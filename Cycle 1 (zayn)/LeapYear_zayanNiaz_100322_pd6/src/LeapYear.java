import static java.lang.System.out;

public class LeapYear {
    public static boolean isLeapYear( int year ) {
        if( year % 4==0 ) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
    public static void exampleLeapYear(int exampleYear) {
        if(LeapYear.isLeapYear(exampleYear) )
            out.println(exampleYear + " is a Leap Year." );
        if(!LeapYear.isLeapYear(exampleYear) )
            out.println(exampleYear + " is NOT a Leap Year." );
    }
}