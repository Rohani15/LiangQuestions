package liangQuestions;

import java.util.Scanner;

public class two_4 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number in pounds: ");
		double total = poundsToKg(input.nextDouble()); 
	}

	public static double poundsToKg (double pounds)
	{
		if(pounds < 0)
		{
			return -1;
		}
		else
		{
			double kg = (pounds / (double) 2.2046);
			System.out.println(pounds + " pounds is " + kg + " Kilograms");
			//String formatting = String.format("%.25", kg); 
			System.out.printf("%.2f", kg);
		}
		return 0; 
	}
}
