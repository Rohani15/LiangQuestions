/*
 * (Find the number of years) Write a program that prompts 
 * the user to enter the minutes (e.g., 1 billion), 
 * and displays the number of years and days for the minutes.
 *  For simplicity, assume a year has 365 days. 
 */


package liangQuestions;

import java.util.Scanner;

public class two_7 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter minutes");
		int minutes = minsToYrsToDays(input.nextInt()); 
	}
	
	public static int minsToYrsToDays(int minutes)
	{
		if (minutes > 0)
		{
			int years = (minutes / 525600);
			int days = (minutes % 525600) / 1140; 
			System.out.println(years + " years " + days + " days ");
		}
		return 0; 
	}


}
