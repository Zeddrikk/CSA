package pong4;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;		//keeps track of what keys are pressed
	private int leftScore = 0;
	private int rightScore = 0;
	public Pong()
	{
		//set up all game variables	
		


		//instantiate a Ball
		
		int ballXSpeed = (int)(Math.random() * 4)+2;
		int ballYSpeed = (int)(Math.random()*4) +2;
		double xNeg = Math.random();
		double yNeg = Math.random();
		if(xNeg>.5) {
			ballXSpeed = -ballXSpeed;
		}
		if(yNeg >.5) {
			ballYSpeed = -ballYSpeed;
		}
		
		
		ball = new Ball(390,290,10,10,Color.BLACK,ballXSpeed,ballYSpeed);
		
		//instantiate a left Paddle
		leftPaddle = new Paddle(10,240,20,60,5);
		
		
		
		//instantiate a right Paddle
		rightPaddle = new Paddle(770,240,20,60,5);
		
		


		keys = new boolean[5];


		//set up the Canvas
		setBackground(Color.WHITE);
		setVisible(true);

		this.addKeyListener(this);
		new Thread(this).start();
	}
	
	public void update(Graphics window)
	{
		paint(window);
	}
	public void reset(){
		leftPaddle.setY(240);
		rightPaddle.setY(240);
		int ballXSpeed = (int)(Math.random() * 3)+2;
		int ballYSpeed = (int)(Math.random()*3) +2;
		double xNeg = Math.random();
		double yNeg = Math.random();
		if(xNeg>.5) {
			ballXSpeed = -ballXSpeed;
		}
		if(yNeg >.5) {
			ballYSpeed = -ballYSpeed;
		}
		ball.setY(300);
		ball.setX(400);
		
		ball.setYSpeed(ballYSpeed);
		ball.setXSpeed(ballXSpeed);
		
	}

	public void paint(Graphics window)
	{
		ball.moveAndDraw(window);
		leftPaddle.draw(window);
		rightPaddle.draw(window);
		window.drawString("Left: " + leftScore + " | Right: " + rightScore, 350, 10);
		
		if(!(ball.getY()>=10&&ball.getY()<=550))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}
		if(
				(ball.getX()-leftPaddle.getX())<=20
				&&(ball.getX()-leftPaddle.getX())>=0
				&&(ball.getY()-leftPaddle.getY())<=60
				&&(ball.getY()-leftPaddle.getY())>=-10
				||(rightPaddle.getX()-ball.getX())<=10
				&&(rightPaddle.getX()-ball.getX())>=0
				&&(ball.getY()-rightPaddle.getY())<=60
				&&(ball.getY()-rightPaddle.getY())>=-10){
			ball.setXSpeed(-ball.getXSpeed());
		}
		if(ball.getX()<0) {
			rightScore++;
			window.setColor(Color.white);
			window.fillRect(0, 0, 800, 600);
			window.drawString("Left: " + leftScore + " | Right: " + rightScore, 350, 10);
			reset();
			
		}
		if(ball.getX()>800) {
			leftScore++;
			window.setColor(Color.white);
			window.fillRect(0, 0, 800, 600);
			window.drawString("Left: " + leftScore + " | Right: " + rightScore, 350, 10);
			reset();
			
		}
		
		
		if(keys[0] == true&&leftPaddle.getY()>0)
		{
			//move left paddle up and draw it on the window
			leftPaddle.moveUpAndDraw(window);
		}
		if(keys[1] == true&&leftPaddle.getY()<505)
		{
			//move left paddle down and draw it on the window
			leftPaddle.moveDownAndDraw(window);

		}
		if(keys[2] == true&&rightPaddle.getY()>0)
		{
			rightPaddle.moveUpAndDraw(window);
		}
		if(keys[3] == true&&rightPaddle.getY()<505)
		{
			rightPaddle.moveDownAndDraw(window);
		}
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e)
	{
		//no code needed here
	}
	
 public void run()
 {
 	try
 	{
 		while(true)
 		{
 		   Thread.currentThread().sleep(8);
          repaint();
       }
    }catch(Exception e)
    {
    }
	}		
}