package shiiiift;

public class NumberShifter {
	public static int[] makeLucky7Array(int size) {
		int[] ray = new int[size];
		for(int x = 0;x<size;x++){
			ray[x] = (int)((Math.random()*10)+1);
		}
		return ray;
	}
	public static void shift7(int[] arr) {
		int swap = 0;
		for(int x= 0;x<arr.length;x++) {
			if(arr[x]==7) {
				arr[x]=arr[swap];
				arr[swap]=7;
				swap++;
			}
		}
	}

}
