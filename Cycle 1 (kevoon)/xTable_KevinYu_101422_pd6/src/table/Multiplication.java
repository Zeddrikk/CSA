package table;

public class Multiplication {
	public static void xTable(int[] a, int[] b) {
		for(int x = 0; x <a.length; x++) {
			for(int y=0; y<b.length;y++) {
				System.out.print(a[x]*b[y] + " ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		int[] a= {4,5,6,7,8,9};
		int[] b= {10,20,30,40};
		xTable(a,b);
		
		
	}

}
