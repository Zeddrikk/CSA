package prime;
import java.io.File;
import java.util.Scanner;

public class PrimesRunner {
    public static void main(String[] args) throws Exception {
        Scanner file = new Scanner(new File("C:\\Users\\zayan\\Downloads\\primes.txt"));
        int runCount = 19;
        for(int r=1; r<= runCount; r++) {
            Prime abc = new Prime(file.nextInt());
            System.out.println(abc.toString());
        }
    }
}