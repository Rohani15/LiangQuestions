package liangQuestions;

import java.util.Scanner;

public class two_16 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the side value. ");
		double finalTotal = areaOfAHexagon(input.nextDouble());

	}
	
	public static double areaOfAHexagon(double s) 
	{
		for(double i = 0; i < 10; i++)
		{
			double total = (((3) * (Math.sqrt(3)) * 2) * (Math.pow(s, 2)));
			System.out.println(total);
		}
		return s; 
	}

}
