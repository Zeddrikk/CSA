package food;

import java.io.File;
import java.util.Scanner;

public class FoodRunner {
    public static void main(String[] args) throws Exception {
        Scanner file = new Scanner(new File("C:\\Users\\zayan\\Documents\\food.dat"));
        int runCount = file.nextInt();
        Food[] hocusPocus = new Food[runCount];

        for (int i = 0; i < runCount; i++){
            hocusPocus[i] = new Food(file.next(), file.nextDouble());
        }

        for (int x = 0; x < runCount; x++){
            for (int m = x + 1; m < runCount; m++){
                System.out.println(hocusPocus[x] + " is " + hocusPocus[x].compareThis(hocusPocus[m]) + " " + hocusPocus[m]);
            }
        }
    }
}
