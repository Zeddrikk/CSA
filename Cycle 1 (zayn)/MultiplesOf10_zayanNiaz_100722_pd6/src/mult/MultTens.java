package mult;

public class MultTens
{
    public static String go(  int x )
    {
        String out = "";
        if(x<=0) {
            return "CVHS";
        }
        for(int y =0; y<=x; y++) {
            int temp = y*10;
            out = out+temp;

        }
        return out;
    }
}