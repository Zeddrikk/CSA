package pong5;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}
	public Ball(int x, int y) {
		super(x,y);
		xSpeed = 3;
		ySpeed =1;
		
	}
	public Ball(int x, int y, int w, int h) {
		super(x,y,w,h);
		xSpeed = 3;
		ySpeed =1;
	}
	public Ball(int x, int y, int w, int h, Color c) {
		super(x,y,w,h,c);
		xSpeed = 3;
		ySpeed =1;
	}
	public Ball(int x, int y, int w, int h,Color c,int sX, int sY) {
		super(x,y,w,h,c);
		xSpeed = sX;
		ySpeed =sY;
	}
	//add the other Ball constructors
	
	   
   //add the set methods
   public void setYSpeed(int sY) {
	   ySpeed = sY;
   }
   public void setXSpeed(int sX) {
	   xSpeed = sX;
   }
   public int getYSpeed() {
	   return ySpeed;
   }
   public int getXSpeed() {
	   return xSpeed;
   }

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	   super.draw(window, Color.WHITE);

      setX(getX()+xSpeed);
		//setY
      setY(getY() + ySpeed);
      super.draw(window);
		//draw the ball at its new location
      
      
   }
   
	public boolean equals(Object obj)
	{
		return super.equals(obj);
	}   

   //add the get methods

   //add a toString() method
	public String toString() {
		return super.toString() + " " + xSpeed + " " +ySpeed;
	}
}