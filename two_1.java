package liangQuestions;

import java.util.Scanner;

public class two_1 
{

	public static void main(String[] args) 
	{
		celsiusToFar(43);
		
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a degree in Celsius: ");
	double c = input.nextDouble(); 
	
	double f = (9.0 / 5) * c + 32; 
	System.out.println(c + " c " + f + " f "); 
	
	}
//==================================================================
	public static double celsiusToFar(double c1)
	{
		//Scanner input = new Scanner(System.in);
		//System.out.print("Enter a degree in Celsius: ");
		//double c1 = input.nextDouble(); 
		
		if (c1 < 0)
		{
			return -1; 
		}
		double f = (9.0 / 5) * c1 + 32; 
		System.out.println(f + " F " + " c " + c1);
		return c1; 
	}
	
	

}
