/*
(Geometry: two rectangles) Write a program that prompts the user to enter the
center x-, y-coordinates, width, and height of two rectangles and determines
whether the second rectangle is inside the first or overlaps with the first, as shown
in Figure 3.9. Test your program to cover all cases.
*/

package liangQuestions;

import java.util.Scanner;

public class three_28 
{

	public static void main(String[] args) 
	{
	    Scanner input = new Scanner(System.in);

	    System.out.print("Enter r1’s center x1: ");
	    double x1 = input.nextDouble();
	   
	    System.out.print("Enter r1’s center y1: ");
	    double y1 = input.nextDouble();
	    
	    System.out.print("Enter r1’s width1: ");
	    double width1 = input.nextDouble();
	    
	    System.out.print("Enter height1: ");
	    double height1 = input.nextDouble();
	    //------------------------------------------------------------------------------

	    System.out.print("Enter r2’s center x2: ");
	    double x2 = input.nextDouble();
	    
	    System.out.print("Enter r2’s y2");
	    double y2 = input.nextDouble();
	    
	    System.out.print("Enter r2’s width2: ");
	    double width2 = input.nextDouble();
	    
	    System.out.print("Enter r2’s heigh2t: ");
	    double height2 = input.nextDouble();
	    
	    
	    //Do the triangles overlap each other. 
	    if (((width1/2) + (width2/2)) > (x1-x2) || (((height1/2) + (height2/2)) > (y1 - y2)))
	    {
	    		System.out.println("The triangle overlaps");
	    }
	    else if ((	(x1 + (width1/2)) == (x2 + (width2/2))	
	    		|| (x2 + (width2/2)) == (x1 + (width1/2))	
	    		|| (y1 + (height1/2)) == (y2 + (height2/2)) 
	    		|| (y2 + (height2/2)) == (y1 + (height1/2))	)) 
	    {
	    		System.out.println("The rectanglles share a border");
	    }
	    else
	    {
	    	System.out.println("The rectabgles are distant");
	    }
	    	
	    
	}
	
	
	// https://www.akifarslan.com.tr/java/java-geometry-two-rectangles/

}


















