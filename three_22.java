/*
(Geometry: point in a circle?) Write a program that prompts the user to enter a point (x, y) 
and checks whether the point is within the circle centered at (0, 0) with radius 10. For example, (4, 5) 
is inside the circle and (9, 9) is outside the circle, as shown in Figure 3.7a.
(Hint: A point is in the circle if its distance to (0, 0) is less than or equal to 10.
The formula for computing the distance is 2(x2 - x1)2 + (y2 - y1)2. Test your program to cover all cases.) Two sample runs are shown below
*/
package liangQuestions;

import java.util.Scanner;

public class three_22 
{
	public static void main(String[] args) 
	{
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter X");
	double x = input.nextDouble();

	System.out.print("Enter Y"); 
	double y = input.nextDouble();

	// Check is the point is within the circle. BOOLEAN == T/F
	// if this is less than/equal to ten it is positive, if not it is negative. 
	boolean point = (Math.pow((Math.pow(x, 2) + Math.pow(y, 2)), .5)) <= 10;
	
	// Display results
	System.out.println("Point (" + x + ", "+ y + ") is " + 
		((point) ? "in " : "not in ") + "the circle"); 
	

	}

}
