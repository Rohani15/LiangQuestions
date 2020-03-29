package liangQuestions;

import java.util.Scanner;

public class two_14 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter weight in pounds & inches in meters");
		double finalBMI = bmi(input.nextDouble(), input.nextDouble()); 
	}
	
	public static double bmi(double weight, double height)
	{
		
		final double kg = 0.45359237;
		final double meters = 0.0254; 
		
		double totalBMI = 0;
		weight = weight * kg; 
		height = height * meters; 
		
		totalBMI = (weight) / (Math.pow(height, 2));  
		System.out.println("total BMI is " + totalBMI);
		return totalBMI; 
	}

}
