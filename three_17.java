/*
 * (Game: scissor, rock, paper) Write a program that plays the popular scissor-rock- paper game.
 *  (A scissor can cut a paper, a rock can knock a scissor, and a paper can wrap a rock.) 
 *  The program randomly generates a number 0, 1, or 2 representing scissor, rock, and paper. 
 *  The program prompts the user to enter a number 0, 1, or 2 and displays a message indicating whether the user or the computer wins, loses, or draws.
 */
package liangQuestions;

import java.util.Scanner;

public class three_17 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int computer = (int)(Math.random() * 3); 

		System.out.print("scissor (0), rock (1), paper (2): ");
		int user = input.nextInt(); 
		
		switch (computer)
		{
			case 0: System.out.println("scissor"); break;
			case 1: System.out.println("rock"); break; 
			case 2: System.out.println("paper"); break; 
		}
		
		switch (user)
		{
			case 0: System.out.println("scissor"); break;
			case 1: System.out.println("rock"); break; 
			case 2: System.out.println("paper"); break; 
		}
		
		if (computer == user) 
		{
			System.out.println("Issa draw");
		}
		
		boolean win = (user == 0 && computer == 2
				|| user == 1 && computer == 0
				|| user == 2 && computer == 2 );
		
		if (win)
		{
			System.out.println("win");
		}
		else
		{
			System.out.println("Lost");
		}
		

	}

}
