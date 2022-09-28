package hexToBinary;

public class HexToBinary {

    public static String getBinary(char hex) {
        if (hex == 'a' || hex == 'A') {
            return "A is 1010 in binary!";
        } else if (hex == 'b' || hex == 'B') {
            return "B is 1011 in binary!";
        } else if (hex == 'c' || hex == 'C') {
            return "C is 1100 in binary!";
        } else if (hex == 'd' || hex == 'D') {
            return "D is 1101 in binary!";
        } else if (hex == 'e' || hex == 'E') {
            return "E is 1110 in binary!";
        } else if (hex == 'f' || hex == 'F') {
            return "F is 1111 in binary!";
        } else {
            return hex + " is ERROR in binary!";
        }
    }
}