package Gradebook0;

public class Grade
{
  private double value;

  public Grade( double v )
  {
	  value =v;
  }
  
  public double getNumericGrade()
  {
  	return value;
  }
  
  public String getLetterGrade()
  {
  	if(value>=90) 
  		return "A";
  	if(value>=80)
  		return "B";
  	if(value>=70)
  		return "C";
  	if(value>=60)
  		return "D";
  	return "F";
  	
  	
  }

  public String toString()
  {
  	return value + " " + this.getLetterGrade();
  }
}

