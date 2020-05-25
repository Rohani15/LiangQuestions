package liangQuestions;

import java.util.Scanner;

public class three_5 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter today's day: ");
		int today = input.nextInt();
		
		System.out.println("Enter day elasped: ");
		int daysElapsed = input.nextInt();
		
		int futureDay = (today + daysElapsed) % 7; //to get a remainder and make it vary from 0 to 7

		switch(today)
		{
		case 1: System.out.println("S"); break;
		case 2: System.out.println("M"); break;
		case 3: System.out.println("Tu"); break;
		case 4: System.out.println("W"); break;
		case 5: System.out.println("Th"); break;
		case 6: System.out.println("F"); break;
		case 7: System.out.println("S"); ;

		}
		
		switch(futureDay)
		{
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7: 
		}

	}

}
