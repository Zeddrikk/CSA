package pong5;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
 
import javax.swing.JFrame;
import java.awt.Component;

public class BreakOutRunner extends JFrame
{
	private static final int WIDTH = 750;
	private static final int HEIGHT = 600;

	public BreakOutRunner()
	{
		super("BREAKOUT");
		setSize(WIDTH,HEIGHT);

		BreakOut padTest = new BreakOut();
		((Component)padTest).setFocusable(true);
		getContentPane().add(padTest);

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main( String args[] )
	{
		BreakOutRunner run = new BreakOutRunner();
	}
}