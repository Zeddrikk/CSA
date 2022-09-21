package temp;
import java.util.Scanner;
public class Temperature {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int scale = 0;
		double temp =0, C=0,F=0,K=0,R=0;
		System.out.println("Input the temperature:");
		temp = kb.nextDouble();
		System.out.println("Input scale:"
				+ 		 "\n1.Celsius"
				+ 		 "\n2.Kelvin"
				+ 		 "\n3.Fahrenheit"
				+ 		 "\n4.Rankine");
		scale = kb.nextInt();
		if(scale!=1){
			if(scale==2) {
				C = temp-273.15;
			}
			else if(scale==3) {
				C = (temp-32) * (5.0/9.0);
			}
			else if(scale ==4) {
				C = (temp-491.67) * (5.0/9.0);
			}
			else {
				System.out.println("No scale");
			}
			
		
		}
		else if(scale==1) {
			C = temp;
		}
		F = C * (9.0/5.0) + 32;
		K = C +273.15;
		R = C * (9.0/5.0) + 491.67;
		System.out.println("Celsius: "+C
				+ 		 "\nFahrenheit: "+F
				+		 "\nKelvin: "+K
				+		 "\nRankine: "+R);
		
		
	}

}
