/*
 * (Science: calculating energy) Write a program that 
 * calculates the energy needed to heat water from an initial 
 * temperature to a final temperature. Your program should prompt 
 * the user to enter the amount of water in kilograms and the initial 
 * and final temperatures of the water. The formula to compute the 
 * energy isQ = M * (finalTemperature – initialTemperature) * 4184where 
 * M is the weight of water in kilograms, temperatures  
 * are in degrees Celsius, and energy Q is measured in joules.
 */

package liangQuestions;

import java.util.Scanner;

public class two_10 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter a val for kilograms, initial temp, and final temp");
		double finalAnswer = findEnergy(input.nextDouble(),input.nextDouble(),input.nextDouble());
		

	}
	
	public static double findEnergy(double kilograms, double iTemp, double fTemp)
	{
		//kilograms = 0; 
		if (kilograms < 0 && iTemp < 0 && fTemp < 00)
		{
			System.out.println("no negative numbers"); 
		}
		else
		{
			double Q = (kilograms * (fTemp - iTemp) * 4184); 
			System.out.println("The energy needed is " + Q);
		}
		return 0; 
	}

}
