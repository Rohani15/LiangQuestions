package liangQuestions;

import java.util.Scanner;

public class three_29 
{

	public static void main(String[] args) 
	{
	    Scanner input = new Scanner(System.in);
	    
	    System.out.println("Enter x1");
	    double x1 = input.nextDouble(); 
	    
	    System.out.println("Enter y1");
	    double y1 = input.nextDouble(); 
	    
	    System.out.println("Enter radii 1");
	    double r1 = input.nextDouble(); 
	    
	  //==========================================
	    
	    System.out.println("Enter x2");
	    double x2 = input.nextDouble(); 
	    
	    System.out.println("Enter y2");
	    double y2 = input.nextDouble(); 
	    
	    System.out.println("Enter radii 2");
	    double r2 = input.nextDouble(); 
	    
	    //are the circle inside:
		if (Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5) <= (Math.abs(r1 - r2)))
		{
			System.out.println("c1 is inside of c2");
		}
		else if (Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5) <= (Math.abs(r1 + r2)))
		{
			System.out.println("C2 overlaps c1");
		}
		else
		{
			System.out.println("They do not touch");
		}

	    
	    
	}

}
