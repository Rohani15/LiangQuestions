/*
(Geometry: points in triangle?) Suppose a right triangle is placed in a plane as
shown below. The right-angle point is placed at (0, 0), and the other two points
are placed at (200, 0), and (0, 100). Write a program that prompts the user to enter
a point with x- and y-coordinates and determines whether the point is inside the
triangle. Here are the sample runs:
*/

package liangQuestions;

import java.util.Scanner;

public class three_27 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter X");
		double x = input.nextDouble();
		
		System.out.print("Enter Y");
		double y = input.nextDouble();
		
		double slope, b, y1;
		
		//find the equation to the hypotenuse 
		slope = (double)(0-100)/(double)(200-0);
		b = 100 + slope * 100; 
		y1 = slope * x + b; 
		
		System.out.println(slope + " " + b + " " + y1);
		
		if ( y <= y1)  // point is in the triangle if yp <= yx
		{
			System.out.println("The point is in the triangle");
		}
		else
		{
			System.out.println("Point is in the triangle ");
		}

		/*
					          A(10,30)
					            / \
					           /   \
					          /     \
					         /   P   \      P'
					        /         \
					B (0,0) ----------- C(20,0) 
					
		1) Calculate area of the given triangle, i.e., area of the triangle ABC in the above diagram. 
		
		Area A = [ x1(y2 - y3) + x2(y3 - y1) + x3(y1-y2)]/2 Calculating 
		
		2) Calculate area of the triangle PAB. We can use the same formula for this. Let this area be A1.
		3) Calculate area of the triangle PBC. Let this area be A2.
		4) Calculate area of the triangle PAC. Let this area be A3.
		5) If P lies inside the triangle, then A1 + A2 + A3 must be equal to A.
		 */
		
		
		
		

	}

}
