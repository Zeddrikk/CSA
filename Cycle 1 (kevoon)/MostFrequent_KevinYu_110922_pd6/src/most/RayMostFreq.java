package most;

public class RayMostFreq {
	
	public static int go(int[] ray) {
		int maxCount=0;
		int max=ray[0];
		for(int x=0;x<ray.length;x++) {
			int count=0;
			for(int y=x+1;y<ray.length;y++) {
				if(ray[x]==ray[y]) {
					count++;
				}
			}
			if(count>maxCount) {
				max=ray[x];
				maxCount=count;
			}
		}
		return max;
	}
}
