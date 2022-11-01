package game;

public class Game {
	private Level levelOne;
	private Level levelTwo;
	private Level levelThree;
	private Level[] test = new Level[3];
	private boolean bonus = false;
	
	public Game() {
		levelOne = new Level();
		levelTwo = new Level();
		levelThree = new Level();
		test[0] = levelOne;
		test[1] = levelTwo;
		test[2] = levelThree;
	}
	public Game(int scoreOne, boolean goalOne, int scoreTwo, boolean goalTwo, int scoreThree, boolean goalThree, boolean bonus) {
		levelOne = new Level(goalOne,scoreOne);
		levelTwo = new Level(goalTwo, scoreTwo);
		levelThree = new Level(goalThree, scoreThree);
		test[0] = levelOne;
		test[1] = levelTwo;
		test[2] = levelThree;
		this.bonus = bonus;
	}
	public boolean isBonus() {
		return bonus;
	}
	public void play() {
		bonus = Math.random()<.5;
		for(Level x: test) {
			x.setPoints((int)(Math.random()*1000));
			x.setReached(Math.random()<.5);
		}
		
		
	}
	public int playManyTimes(int num) {
		int out = 0;
		for(int x = 0;x<num;x++) {
			this.play();
			if(this.getScore()>out) {
				out = this.getScore();
			}
		}
		return out;
	}
	public int getScore() {
		int out = 0;
		if(this.levelOne.goalReached()) {
			if(this.levelTwo.goalReached()) {
				if(this.levelThree.goalReached()) {
					out+=this.levelThree.getPoints();
				}
				out+=this.levelTwo.getPoints();
			}
			out+=this.levelOne.getPoints();
		}
		if(bonus) {
			out*=3;
		}
		return out;
	}
	public String toString() {
		String out = "";
		out+="Level One: " + this.levelOne.getPoints() +" "+ this.levelOne.goalReached()
		 + "\nLevel Two: " + this.levelTwo.getPoints() +" "+ this.levelTwo.goalReached()
		 + "\nLevel Three: " + this.levelThree.getPoints() +" "+ this.levelThree.goalReached()
		 + "\nBonus: "+this.isBonus()
		 + "\nScore: "+this.getScore();
		return out;
	}
	

}
