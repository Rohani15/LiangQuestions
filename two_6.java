package liangQuestions;

import java.util.Scanner;

public class two_6 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter number between 0 to 1000");
		int number = findSum(input.nextInt()); 
	}
	
	public static int findSum(int number)
	{
		if (number <= 0)
		{
			System.out.println("value is 0");
		}
		else
		{
			int lessThan10 = number % 10; 
			number /= 10; 
			
			int between10to99 = number % 10;
			number /= 10;
			
			int between100to999 = number % 10;
			number /= 10; 
			
			int sum = between100to999 + between10to99 + lessThan10; 
			System.out.println(sum);
			
		}
		return 0; 
	}
	
	

}
