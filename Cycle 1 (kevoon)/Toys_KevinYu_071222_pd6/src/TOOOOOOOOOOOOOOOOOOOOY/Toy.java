package TOOOOOOOOOOOOOOOOOOOOY;


public class Toy {
	private int count;
	private String name;
	public Toy() {
		count =0;
		name = "";
	}
	public Toy(int c, String n) {
		count = c;
		name = n;
	}
	public Toy(int c) {
		count = c;
		name = "";
	}
	public Toy(String n) {
		name = n;
		count = 1;
	}
	public void setCount(int c) {
		count = c;
	}
	public int getCount() {
		return count;
	}
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return name + " " + count;
	}
	
}
