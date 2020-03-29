/*Write a program that prompts the user to enter v in meters/second (m/s) and the acceleration a in meters/second 
squared (m/s2), and displays the minimum run- way length. Here is a sample run:
*/
package liangQuestions;

import java.util.Scanner;

public class two_12 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter the speed of the acceleration");
		double result = runawayLength(input.nextDouble(), input.nextDouble()); 
		System.out.println(result);
	}
	

	public static double runawayLength(double v, double a )
	{
		if(v > 0 && a > 0)
		{
			double length = (Math.pow(v, 2)) / ((2 * a));
			System.out.println("The minimum runway length for this airplane is " + length);
		}
		return 0;

	}

} 


