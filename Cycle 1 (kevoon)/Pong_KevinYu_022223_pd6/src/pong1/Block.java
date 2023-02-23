package pong1;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;
	public Block(int x, int y) {
		width = 10;
		width = 10;
	}
	public Block(int x, int y, int w, int h)
	{
		xPos = x;
		yPos = y;
		width = w;
		height = h;
		color = color.BLACK;
	}
	public Block() {
		xPos = 100;
		yPos = 150;
		width = 10;
		height = 10;
		color = Color.BLACK;
	}
	
	public Block(int x, int y, int w, int h, Color c) {
		xPos = x;
		yPos = y;
		width = w;
		height = h;
		color = c;
		
	}

	//add other Block constructors - x , y , width, height, color	
	
	
   //add the other set methods
	public void setWidth(int w) {
		width = w;
	}
	public void setX(int x) {
		xPos = x;
	}
	public void setY(int y) {
		yPos =y;
	}
	public void setHeight(int h) {
		height = h;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public int getX() {
		return xPos;
	}
	public int getY() {
		return yPos;
	}
   public void setColor(Color col)
   {
	   color = col;
   }
   public Color getColor() {
	   return color;
   }

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   
   }
   
	public boolean equals(Object obj)
	{
		if(width!=((Block)obj).getWidth())
			return false;
		if(color != ((Block)obj).getColor())
			return false;
		if(height!=((Block)obj).getHeight())
			return false;
		return true;
	}   

   //add the other get methods
    

   //add a toString() method  - x , y , width, height, color
	public String toString() {
		return xPos + ", " + yPos+ ", " + width + ", " + height + ", " + color;
	}
}
