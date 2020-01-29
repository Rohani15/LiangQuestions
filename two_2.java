package liangQuestions;

import java.util.Scanner;

public class two_2 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the radius: ");
		double radius = input.nextDouble(); 
		
		System.out.print("Enter the length: ");
		double length = input.nextDouble(); 

		
		if(radius < 0 || length < 0)
		{
			System.out.println("invalid");
		}
		else
		{
			double area = (int)(radius * radius * Math.PI); 
			double volume = (area * length); 
			System.out.println(area + " is the area " + volume + " volume ");
		}
		
		
		
		
	}

}
