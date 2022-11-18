package whatisthismelody;
import static java.lang.System.*;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayStats {
	private int[] array;
	public ArrayStats(String list)
	{
		this.setArray(list);
	}
	public void setArray(String list)
	{
	//put stuff in the array
		array = new int[list.length()/2+1];
		
		//put stuff in the array
			Scanner c = new Scanner(list);
			for(int x=0;x<list.length()/2+1;x++) {
				array[x]=c.nextInt();
			}
	
		
		
	}
	public int getNumGroupsOfSize(int size)
	{
		int sizeCount = 0;
		if(size==1) {
			sizeCount++;
		}
		int count=1;
		for(int x = 1; x < array.length;x++) {
			
			if(array[x]==array[x-1]) {
				count++;
			}
			else {
				count=1;
			}
			if(count==size) {
				sizeCount++;
			}
			
			
		}
		return sizeCount;
		
		
	}
	public String toString()
	{
	return Arrays.toString(array);
	}
}
