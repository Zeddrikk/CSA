package temperature;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Temperature {
    public static void main(String[] args) throws IOException {
        double inputTemp, inputType, celsius, kelvin, fahrenheit, rankine;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Type in the input temperature.");
        inputTemp = Double.parseDouble(br.readLine());

        System.out.println("Type in the temperature scale; 1 for Celsius, 2 for Kelvin, 3 for Fahrenheit, or 4 for Rankine:");
        inputType = Double.parseDouble(br.readLine());

        if (inputType == 1) {
            celsius = inputTemp;
            kelvin = celsius + 273.15;
            fahrenheit = 1.8 * celsius + 32;
            rankine = 1.8 * kelvin;

            System.out.println("Temperature in kelvin: " + kelvin + " degrees kelvin");
            System.out.println("Temperature in fahrenheit: " + fahrenheit + " degrees fahrenheit");
            System.out.println("Temperature in rankine: " + rankine + " degrees rankine");

        } if (inputType == 2) {
            kelvin = inputTemp;
            celsius = kelvin - 273.15;
            fahrenheit = 1.8 * celsius + 32;
            rankine = 1.8 * kelvin;

            System.out.println("Temperature in celsius: " + celsius + " degrees celsius");
            System.out.println("Temperature in fahrenheit: " + fahrenheit + " degrees fahrenheit");
            System.out.println("Temperature in rankine: " + rankine + " degrees rankine");

        } if (inputType == 3) {
            fahrenheit = inputTemp;
            celsius = (fahrenheit - 32) * 1.8;
            kelvin = celsius + 273.15;
            rankine = 1.8 * kelvin;

            System.out.println("Temperature in celsius: " + celsius + " degrees celsius");
            System.out.println("Temperature in kelvin: " + kelvin + " degrees kelvin");
            System.out.println("Temperature in rankine: " + rankine + " degrees rankine");

        } if (inputType == 4) {
            rankine = inputTemp;
            kelvin = (5.0/9.0) * rankine;
            celsius = kelvin - 273.15;
            fahrenheit = 1.8 * celsius + 32;

            System.out.println("Temperature in celsius: " + celsius + " degrees celsius");
            System.out.println("Temperature in kelvin: " + kelvin + " degrees kelvin");
            System.out.println("Temperature in fahrenheit: " + fahrenheit + " degrees fahrenheit");
        }
    }
}
