package coneFrustumTSA2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConeFrustumRunner {

    public static void main(String[] args) throws IOException {
        ConeFrustum testCone = new ConeFrustum(6, 45, 4);
        System.out.println("This is the total surface area of a cone frustum with R = 6, z = 45 degrees, and h = 4: " + testCone.area());
        System.out.print("Now for you to calculate it! ");

        double radius, angle, height;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Type in the big radius of the cone:");
        radius = Double.parseDouble(br.readLine());

        System.out.println("Type in the angle of elevation (in degrees - the program will convert it to radians) of the lateral side:");
        angle = Double.parseDouble(br.readLine());

        System.out.println("Type in the height between the two bases of the cone:");
        height = Double.parseDouble(br.readLine());

        System.out.println("Calculating...");
        ConeFrustum userCone = new ConeFrustum(radius, angle, height);

        System.out.println("The total surface area of your cone frustum is " + userCone.area());
    }

}
