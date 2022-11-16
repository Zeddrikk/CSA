package fibbbbbbbbbbbbb;

public class Fibonacci
{
	//instance variable
	private int[] fib;
	//constructors
	public Fibonacci(int size) {
		this.setSize(size);
	}

	//set method
	public void setSize(int size) {
		fib = new int[size];
		fib[0] =1;
		if(fib.length>1)
			fib[1] =1;
		for(int x = 2; x<fib.length;x++) {
			fib[x]=fib[x-1]+fib[x-2];
		}
	}

	//get method
	public int getValue(int num) {
		if(num>fib.length) {
			return -1;
		}
		return fib[num-1];
	}

	//toString
	public String toString() {
		return fib.toString();
	}
}