package flowers;
import java.util.Arrays;
import java.util.ArrayList;
public class FlowerGarden
{
//create an arraylist instance variable
ArrayList<String> garden;
//write a constructor 
public FlowerGarden(ArrayList<String> s) {
	garden = new ArrayList<String>(s);
}
public FlowerGarden() {
	garden = new ArrayList<String>();
}
//write add flower
public void addFlower(String flower) {
	int pos = this.findFlower(flower);
	if(pos!=-1) {
		int count = this.getCount(flower);
		count++;
		if(count<10) {
			garden.set(pos, "0"+count+" "+flower);
		}
	}
	else {
		garden.add("01 " + flower);
	}
}
//write get count
public int getCount(String f) {
	int pos = this.findFlower(f);
	int count = 0;
	if(pos!=-1) {
		String[] x = garden.get(pos).split(" ");
		count = Integer.parseInt(x[0]);
	}
	
	return count;
}
//write get flower name
public String getFlowerName(int pos) {
	if(this.inRange(pos)) {
		String[] x = garden.get(pos).split(" ");
		return x[1];
	}
	return "out of range";
}
//write in range
public boolean inRange(int pos) {
	return garden.size()>pos;
}

//write find flower
public int findFlower(String flower) {
	int pos = -1;
	for(String f :garden) {
		pos++;
		String[] x = f.split(" ");
		if(flower.equals(x[1])) {
			return pos;
		}
	}
	return -1;
}

//write max flower
public int maxFlower() {
	int max =1;
	for(String f:garden) {
		int temp = this.getCount(f);
		if(temp>max) {
			max =temp;
		}
	}
	return max;
}

//write a toString
public String toString() {
	return garden.toString();
}
}