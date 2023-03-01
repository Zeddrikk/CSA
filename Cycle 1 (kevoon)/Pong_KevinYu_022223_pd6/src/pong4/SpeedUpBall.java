//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package pong4;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class SpeedUpBall extends Ball
{

   //instance variables

   public SpeedUpBall()
   {
	   super();

   }

   public SpeedUpBall(int x, int y)
   {


   }


   public SpeedUpBall(int x, int y, int xSpd, int ySpd)
   {


   }

   public SpeedUpBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
   {


   }


   public SpeedUpBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {

	   super(x,y,wid,ht,col,xSpd,ySpd);


   }

   public void setXSpeed( int xSpd )
   {
	   if(getYSpeed()>0) {
		   setYSpeed(getYSpeed()+1);
	   }
	   if(getYSpeed()<0) {
		   setYSpeed(getYSpeed()-1);
	   }
	   if(xSpd <0) {
		   super.setXSpeed(xSpd -1);
	   }
	   if(xSpd >0) {
		   super.setXSpeed(xSpd +1);
	   }
	   

   }

   
}

