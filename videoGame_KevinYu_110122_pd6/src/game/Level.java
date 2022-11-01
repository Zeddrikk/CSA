package game;

public class Level {
	private boolean reached = false;
	private int points = 0;
	public Level() {
		
	}
	public Level(boolean r, int p) {
		reached = r;
		points = p;
	}
	public int getPoints() {
		return points;
	}
	public boolean goalReached() {
		return reached;
	}
	public void setPoints(int p) {
		points = p;
	}
	public void setReached(boolean r) {
		reached = r;
	}

}
