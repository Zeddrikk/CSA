package lightning;

public class Horse {
	private int weight;
	private String name;
	public Horse(String name, int weight) {
		this.weight = weight;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getWeight() {
		return weight;
	}
	public String toString()
	   {
	      return "name: " + this.name + " weight: " + this.weight;
	   }

}
