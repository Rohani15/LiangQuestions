/*
 * (Financial application: calculate tips) Write a program that reads the subtotal and the gratuity rate, then computes the gratuity and total. 
 * For example, if the user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5 as gratuity and $11.5 as total. 
 */

package liangQuestions;

import java.util.Scanner;

public class two_5 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter grat and subtotal");
		double finalTotal = gratTotal(input.nextDouble(), input.nextDouble()); 

	}
	
	public static double gratTotal(double grat, double total)
	{
		if (grat > 0 && total > 0)
		{
			double gratPer = (grat / 100.00); 
			double totalGrat = (total + gratPer); 
			System.out.println("The subtotal b4 grat is  " + total + " the grat is " + gratPer + " and total grat is " + totalGrat);
		}
		return 0; 
	}

}
