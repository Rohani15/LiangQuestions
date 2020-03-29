package liangQuestions;

import java.util.Scanner;

public class two_15 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter x1 and x2 & Enter y1 and y2");
		double total = distanceTotal(input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble());

	}
	
	public static double distanceTotal(double x1, double x2, double y1, double y2)
	{
		double distance = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
		System.out.println("The total is " + distance);
		return distance; 
	}

}
