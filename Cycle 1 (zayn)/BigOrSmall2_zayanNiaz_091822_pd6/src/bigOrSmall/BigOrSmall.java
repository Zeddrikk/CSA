package bigOrSmall;

public class BigOrSmall {
    public static String check(int a, int b) {
        String answer = null;

        if (a > b) {
            answer = "yes";
        } if (a < b) {
            answer = "no";
        } if (a == b) {
            answer = "cvhs";
        }
        
        return answer;
    }
}
