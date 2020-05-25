/*
 * (Game: heads or tails) Write a program that lets the user guess whether the flip of a coin results in heads or tails. 
 * The program randomly generates an integer 0 or 1, which represents head or tail. 
 * The program prompts the user to enter a guess and reports whether the guess is correct or incorrect.
 */

package liangQuestions;

import java.util.Scanner;

public class three_14 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		int guessNumber = (int)(Math.random() * 2); 

		System.out.print("Guess a number: ");
		int number = input.nextInt();
		
		if (guessNumber == number)
		{
			System.out.println("Correct");
		}
		else
		{
			System.out.println("Incorrect");
		}
		
		//---------------------------------------------------------------------
		//Another simpler way to write this if/else statement
		
		System.out.println(((guessNumber == number) ? "correct" : "Incorrect")); 
		
		System.out.println(2.3 % 10);
		
		

	}

}
