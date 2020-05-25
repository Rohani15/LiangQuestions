package liangQuestions;

import java.util.Scanner;

public class three_12 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter three integer: ");
		int number = input.nextInt();

		int firstNumber = number / 100; // if input is 121, this line equals 1.2
		int lastNumber = number % 10; //if number is 12, equals 1.2
		if (lastNumber == firstNumber) //if 1.2 == 1.2
		{
			System.out.println("is a Palindrome number"); //output
		}
		else
		{
			System.out.println("is NOT a Palindrome number");
		}
		


	}

}
