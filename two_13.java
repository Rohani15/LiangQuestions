package liangQuestions;

import java.util.Scanner;

public class two_13 
{

	public static void main(String[] args) 
	{	
		Scanner input = new Scanner(System.in);	// Create a new Scanner object.
		System.out.print("Enter the monthly saving amount: ");
		
		double totalValue = financialLoop(input.nextDouble());
		System.out.println(totalValue);
	}
	
	public static double financialLoop(double monthlyAmount)
	{
		final double monthlyInterestRate = 0.00417;	// Initialize constant value
		
		double currentAmount = 0; //you have to initialize current amount to 0 so it can 
		
		for(double i = 0; i < 6; i++) //this loops for the 6 months
		{
			currentAmount = (100 + currentAmount) * (1 + monthlyInterestRate);
			System.out.println(currentAmount);
		}
		
		return 0;
			
	}
	

}
