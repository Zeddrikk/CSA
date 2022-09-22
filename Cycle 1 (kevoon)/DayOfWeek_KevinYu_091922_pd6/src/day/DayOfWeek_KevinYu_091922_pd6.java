package day;
import java.util.*;
public class DayOfWeek_KevinYu_091922_pd6 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int day, start = 0;
		System.out.println("Enter a day(1-28): ");
		day = kb.nextInt();
		while(day>28 || day<1){
			System.out.println("Try again...");
			day = kb.nextInt();
		}
		System.out.println("Starting Date: "
				+ "\n1.Monday"
				+ "\n2.Tuesday"
				+ "\n3.Wednesday"
				+ "\n4.Thursday"
				+ "\n5.Friday"
				+ "\n6.Saturday"
				+ "\n7.Sunday");
		start = kb.nextInt();
		day = (day+start-1)%7;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 0:
			System.out.println("Sunday");
			break;
			
		}
		
		
					
		
		
		
		
	}

}
