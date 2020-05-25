package liangQuestions;

import java.util.Scanner;

public class three_6 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Enter weight in pounds");
		double pound = input.nextDouble(); 
		
		System.out.println("Enter height in inches");
		double height = input.nextDouble(); 

//=============================================================================
		
		double kgp = 0.45359237; 
		double mInch = 0.02547; 
		
		double weightKG = pound * kgp; 
		double heightM2 = height * mInch; 
		double BMI = weightKG / Math.pow(heightM2, 2); 
		
		if(BMI < 18.5)
		{
			System.out.println("Underweight");
		}
		else if(BMI < 25)
		{
			System.out.println("Normal");
		}
		else if(BMI < 30)
		{
			System.out.println("Overweight");
		}
		else
		{
			System.out.println("Obese");
		}
		

	}

}
