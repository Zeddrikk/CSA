package dayOfTheWeek;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayOfTheWeek {
    public static void main(String[] args) throws IOException {
        int dateNum, firstDay, remainder, finalDay;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Input what day of the week is on the first of the month using numbers (1 = monday, 2 = tuesday, etc): ");
        firstDay = Integer.parseInt(br.readLine());

        System.out.println("Now input the numerical date you want to find the day of the week (max 28): ");
        dateNum = Integer.parseInt(br.readLine());

        if (dateNum > 28) {
            System.out.println("That's not a within the limits! Try again.");
        }

        remainder = dateNum % 7;
        finalDay = remainder - 1 + firstDay;



        if (finalDay == 1) {
            System.out.print("The selected day is: ");
            System.out.println("Sunday");
        } else if (finalDay == 2) {
            System.out.print("The selected day is: ");
            System.out.println("Monday");
        } else if (finalDay == 3) {
            System.out.print("The selected day is: ");
            System.out.println("Tuesday");
        } else if (finalDay == 4) {
            System.out.print("The selected day is: ");
            System.out.println("Wednesday");
        } else if (finalDay == 5) {
            System.out.print("The selected day is: ");
            System.out.println("Thursday");
        } else if (finalDay == 6) {
            System.out.print("The selected day is: ");
            System.out.println("Friday");
        } else if (finalDay == 7) {
            System.out.print("The selected day is: ");
            System.out.println("Saturday");
        } else {
            System.out.println("Something went wrong. Try again!");
        }

    }
}