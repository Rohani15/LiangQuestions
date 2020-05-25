package liangQuestions;

import java.util.Scanner;

public class three_1 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a, b, c: ");
		double total = quadratic(input.nextDouble(), input.nextDouble(), input.nextDouble()); 

	}
	
	public static double quadratic(double a, double b, double c)
	{
		double d = (Math.pow(b, 2) - ((4) * (a) * (c))); 
		if (d > 0)
		{
			double root1 = (-b + Math.pow(d, 0.5)) / (2 * a);  
			double root2 = (-b - Math.pow(d, 0.5)) / (2 * a);  
			System.out.println("Has 2 real roots" +  root1  +  root2);
		}
		else if (d == 0)
		{
			double root1 = (-b + Math.pow(d, 0.5)) / (2 * a);  
			System.out.println("Has 1 real roots" +  root1);

		}
		else
		{
			System.out.println("the equation has no real roots");
		}
		return 0; 
	}
	

}
