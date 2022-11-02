package game;

public class GameRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game random = new Game();
		Game caseOne = new Game(200, true, 100, true, 500, true, true);
		Game caseTwo  = new Game(200, true, 100, true, 500, false, false);
		Game caseThree = new Game(200, true, 100, false, 500, true, true);
		Game caseFour = new Game(200, false, 100, true, 500, true, false);
		System.out.println("Test Cases");
		System.out.println("Case One:");
		System.out.println(caseOne);
		System.out.println("Case Two:");
		System.out.println(caseTwo);
		System.out.println("Case Three:");
		System.out.println(caseThree);
		System.out.println("Case Four:");
		System.out.println(caseFour);
		System.out.println("\n\n\n");
		System.out.println("Random Case:");
		random.play();
		System.out.println(random);
		System.out.println("Random Play Many Times:");
		System.out.println(random.playManyTimes((5)));

		
	}

}
