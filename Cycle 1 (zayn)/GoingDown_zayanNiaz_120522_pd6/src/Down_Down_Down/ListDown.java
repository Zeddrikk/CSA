package Down_Down_Down;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
public class ListDown
{
//go() will return true if all numbers in numArray
//are in decreasing order [31,12,6,2,1]
public static boolean go( List<Integer> numArray)
{
	/*ArrayList<Integer> reverse = new ArrayList<Integer> (numArray);
	reverse.sort(Comparator.reverseOrder());
	return reverse.equals(numArray);*/
	for(int x =1 ;x<numArray.size();x++) {
		if(numArray.get(x)<numArray.get(x-1)) {
			
		}
		else {
			return false;
		}
	}
	return true;
}
}