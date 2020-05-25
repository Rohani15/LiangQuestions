/*
(Use the &&, || and ^ operators) Write a program that prompts the user to enter
an integer and determines whether it is divisible by 5 and 6, whether it is divisible
by 5 or 6, and whether it is divisible by 5 or 6, but not both. Here is a sample run
of this program:
*/

package liangQuestions;

import java.util.Scanner;

public class three_26 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an intege:r ");
		double integer = input.nextDouble();
		
		System.out.println("Is 10 divisible by 6 and false?: " + (integer % 5 == 0 && integer % 6 == 0));  
		
		System.out.println("Is 10 divisible by 5 or 6? true: " + (integer % 5 == 0 || integer % 6 == 0));
		
		System.out.println("Is 10 divisible by 5 or 6? true but not both?: " + (integer % 5 == 0 ^ integer % 6 == 0));


	}

}
