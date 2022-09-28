package hexToBinary;

import static java.lang.System.*;
import java.util.Scanner;

public class HexToBinaryRunner {
    public static void main(String[] args) {
        HexToBinary prog = new HexToBinary();

        Scanner keyboard = new Scanner(in);

        out.println("Some example cases:");
        HexToBinary ex1 = new HexToBinary();
        out.println(ex1.getBinary('A'));
        HexToBinary ex2 = new HexToBinary();
        out.println(ex2.getBinary('B'));
        HexToBinary ex3 = new HexToBinary();
        out.println(ex3.getBinary('C'));
        HexToBinary ex4 = new HexToBinary();
        out.println(ex4.getBinary('D'));
        HexToBinary ex5 = new HexToBinary();
        out.println(ex5.getBinary('E'));
        HexToBinary ex6 = new HexToBinary();
        out.println(ex6.getBinary('F'));
        HexToBinary ex7 = new HexToBinary();
        out.println(ex7.getBinary('X'));
        out.println();
        
        out.print("Now for you to choose a letter! Enter a letter :: ");
        char letter = keyboard.next().charAt(0);
        out.println( prog.getBinary(letter));
    }
}