package liangQuestions;

import java.util.Scanner;

public class two_3 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the feet: ");
		double feetInput = convetFeetToMeters(input.nextDouble()); 
		

	}
	
	public static double convetFeetToMeters(double feet)
	{
		
		//int feet = input.nextInt();
		if (feet < 0)
		{
			//int feet = input.nextInt();
			return -1; 
		}
		else
		{
			double meters = (int)(feet * .305); 
			System.out.println(feet + " f" + meters + "m");
		}
		
		return 0;
	}

}
