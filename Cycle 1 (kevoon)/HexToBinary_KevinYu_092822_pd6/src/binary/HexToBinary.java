package binary;

public class HexToBinary
{
public static String getBinary( char hex )
{
	String bin = "ERROR";
	switch (hex) {
	case 'A':
	case 'a':
		bin = "1010";
		break;
	case 'B':
	case 'b':
		bin = "1010";
		break;
	case 'C':
	case 'c':
		bin = "1010";
		break;
	case 'D':
	case 'd':
		bin = "1010";
		break;
	case 'E':
	case 'e':
		bin = "1010";
		break;
	case 'F':
	case 'f':
		bin = "1010";
		break;
	
		
	}
		
return hex + "is " + bin +" in binary!";
}
}