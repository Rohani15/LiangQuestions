package liangQuestions;

import java.util.Scanner;

public class three_23 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter X");
		double x = input.nextDouble();

		System.out.print("Enter Y"); 
		double y = input.nextDouble();
		

		// Check whether the point is within the rectangle
		// centered at (0, 0) with width 10 and height 5
		boolean withinRectangle = (Math.pow(Math.pow(x, 2), 0.5) <= 10 / 2 ) ||
										  (Math.pow(Math.pow(y, 2), 0.5) <= 5.0 / 2);

		// Display results
		System.out.println("Point (" + x + ", " + y + ") is " +
			((withinRectangle) ? "in " : "not in ") + "the rectangle");		
	}

}
