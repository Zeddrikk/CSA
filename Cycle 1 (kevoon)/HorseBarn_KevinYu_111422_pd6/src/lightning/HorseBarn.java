package lightning;

public class HorseBarn {
	private Horse[] spaces;
	public HorseBarn(int stalls) {
		spaces = new Horse[stalls];
	}
	public void setStall(Horse h, int stall) {
		spaces[stall]=h;
	}
	
	public int findHorseSpace(String name) {
		for(int x = 0; x<spaces.length; x++) {
			if(name.equals(spaces[x])) {
				return x;
			}
		}
		return -1;
	}
	public void consolidate() {
		int empty=0;
		for(int x = 0; x<spaces.length;x++) {
			while(null!=spaces[empty]) {
				empty++;
			}
			if(x>empty) {
				System.out.println("Empty:" +empty);
				System.out.println("X:"+x);
				spaces[empty] = spaces[x];
				spaces[x]=null;
			}
		}
		
	}
	 public String toString()
	   {
	     String result = "";
	     Horse h = null;
	     for (int i = 0; i < spaces.length; i++) {
	       h = spaces[i];
	       result = result + "space " + i + " has ";
	       if (h == null) result = result + " null \n";
	       else result = result + h.toString() + "\n";
	     }
	     return result;
	   }
	

}
