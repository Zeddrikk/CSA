package lightning;

public class BarnRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HorseBarn barn = new HorseBarn(7);
	     barn.setStall(new Horse("Trigger", 1340),0);
	     barn.setStall(new Horse("Silver",1210),2);
	     barn.setStall(new Horse("Lady", 1575),3);
	     barn.setStall(new Horse("Patches", 1350),5);
	     barn.setStall(new Horse("Duke", 1410),6);
	     System.out.println(barn);

	     // test
	     System.out.println("Index of Trigger should be 0 and is " +
	                        barn.findHorseSpace("Trigger"));
	     System.out.println("Index of Silver should be 2 and is " +
	                        barn.findHorseSpace("Silver"));
	     System.out.println("Index of Coco should be -1 and is " +
	                        barn.findHorseSpace("Coco"));
	     System.out.println();
	     System.out.println("Consolidate");
	     barn.consolidate();
	     System.out.println(barn);
	}

}
