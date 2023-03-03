package pong5;

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

public class BreakOut extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Block[][] blocks;
	private Paddle paddle;
	private boolean[] keys;		//keeps track of what keys are pressed
	private int lives =3;
	private int count = 0;
	public BreakOut()
	{
		//set up all game variables	
		

		//instantiate a Ball
		blocks = new Block[7][13];
		
		paddle = new Paddle(240,550,60,20,Color.BLACK,6);
		//instantiate a left Paddl
		keys = new boolean[2];
		int ballXSpeed = (int)(Math.random() * 3)+2;
		int ballYSpeed = ((int)(Math.random()*3) +2);
		double xNeg = Math.random();
		if(xNeg>.5) {
			ballXSpeed = -ballXSpeed;
		}
		int r = (int) (Math.random()*256);
		int g =(int) (Math.random()*256);
		int b=  (int) (Math.random()*256);
		ball = new Ball(375,300,5,5,Color.BLACK,ballXSpeed,ballYSpeed);
		int blockx = 27, blocky = 10;
		
		for(int i =0; i<7; i ++) {
			for(int j= 0; j<13; j++) {
				blocks[i][j] = new Block( (blockx +80)* i+13, j*(blocky + 10)+15,70, 10,new Color(r,g,b));
				r=(int) (Math.random()*256);
				g=(int) (Math.random()*256);
				b=(int) (Math.random()*256);
			}
			
		}

		//set up the Canvas
		setBackground(Color.WHITE);
		setVisible(true);

		this.addKeyListener(this);
		new Thread(this).start();
	}
	
	public void update(Graphics window)
	{
		if(lives>0) {
			paint(window);
		}
		else if(count>90) {
			end(window);
		}
		else {
			end(window);
		}
		
	}
	public void reset(){
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
	public  void end(Graphics window) {
		window.setColor(Color.WHITE);
		window.fillRect(0, 0, 1000, 1000);
		window.setColor(Color.BLACK);
		window.drawString("GAME OVER", 0, 10);
	}
	public void paint(Graphics window)
	{
		window.drawString("Lives: " + lives, 0, 10);
		for(Block[] a : blocks) {
			for(Block b : a) {
				if(b.getHitbox()==true)
						b.draw(window);
			}
		}
		ball.moveAndDraw(window);
		paddle.draw(window);
		
		for(Block[] a : blocks) {
			for(Block b: a) {
				if(b.getHitbox()==true) {
					if(
							ball.getX()-b.getX()<81&&ball.getX()-b.getX()>-11
							&&
							Math.abs(ball.getY()-b.getY())<2
							
							) {
						ball.setYSpeed(-ball.getYSpeed());
						b.setHitbox(false);
						b.draw(window, Color.WHITE);
						count ++;
					}
				}
				if(b.getHitbox()==true) {
					if(ball.getX()-b.getX()<80&&ball.getX()-b.getX()>77&&ball.getY()-b.getY()<10&&ball.getY()-b.getY()>-5
							||
							b.getX()-ball.getX()<10&&b.getX()-ball.getX()>7&&ball.getY()-b.getY()<10&&ball.getY()-b.getY()>-5) {
						ball.setXSpeed(-ball.getXSpeed());
						b.setHitbox(false);
						b.draw(window, Color.WHITE);
						count++;
					}	
					
				}
				
				
			}
		}
		
		if(
				ball.getY()<0
				||
				paddle.getY()-ball.getY()<=3
				&&
				ball.getX()-paddle.getX()<=55 && ball.getX()-paddle.getX()>0
				&&
				paddle.getY()-ball.getY()>=-3
				)
		{
			ball.setYSpeed(-ball.getYSpeed());
		}
		if(ball.getY()<-Math.abs(ball.getYSpeed())) {
			ball.setYSpeed(-ball.getYSpeed());
			ball.setY(1);
		}
		if(ball.getX()>740) {
			ball.setXSpeed(-ball.getXSpeed());
		}
		if(ball.getX()<0) {
			ball.setXSpeed(-ball.getXSpeed());
		}
		if(ball.getY()>600) {
			ball.setYSpeed(-ball.getYSpeed());
			lives--;
			window.setColor(Color.WHITE);
			window.fillRect(0, 0, 200, 15);
		}

		if(keys[0] == true&&paddle.getX()>0)
		{
			//move left paddle up and draw it on the window
			paddle.moveLeftAndDraw(window);
		}
		if(keys[1] == true&&paddle.getX()<690)
		{
			//move left paddle down and draw it on the window
			paddle.moveRightAndDraw(window);

		}
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'A' : keys[0]=true; break;
			case 'D' : keys[1]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'A' : keys[0]=false; break;
			case 'D' : keys[1]=false; break;
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