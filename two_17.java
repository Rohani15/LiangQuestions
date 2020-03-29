package liangQuestions;

import java.util.Scanner;

public class two_17 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the temp between -58F and 41F and Enter wind speed (>=2) in miles/hour");
		double newChillTemp = chillTemp(input.nextDouble(), input.nextDouble());
	}
	
	public static double chillTemp(double t, double v)
	{
		double windChillIndex = (35.74 + ((0.6215 * t) - (35.75 * Math.pow(v, 0.16)) )
				+ (0.4275 * t * Math.pow(v, 0.16)));
		
		System.out.println(windChillIndex);
		return windChillIndex; 
	}

}
