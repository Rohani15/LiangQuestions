package liangQuestions;

import java.util.Scanner;

public class three_21 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter year: ");
		int year = input.nextInt();
		
		System.out.print("Enter month 1-12: ");
		int month = input.nextInt();
		
		System.out.print("Enter day of the month 1-31: ");
		int dayOfMonth = input.nextInt();
		
		//m is the month (3: March, 4: April, ..., 12: December). January and February are counted as months 13 and 14 of the previous year.
		if (month == 1)
		{
			month = 13;
			year--; 
		}
		if (month == 2)
		{
			month = 14;
			year--;
		}
		
		// Calculate day of the week
		int dayOfWeek = (dayOfMonth + (26 * (month + 1)) / 10 + (year % 100) 
				+ (year % 100) / 4 + (year / 100) / 4 + 5 * (year / 100)) % 7; 
		
		switch (dayOfWeek)
		{
		case 1: System.out.println("Sunday"); break;
		case 2: System.out.println("Monday"); break; 
		case 3: System.out.println("Tuesday"); break; 
		case 4: System.out.println("Wenesday"); break; 
		case 5: System.out.println("Thursday"); break;
		case 6: System.out.println("Friday"); break; 
		case 7: System.out.println("Saturday"); break;

		}
		
		System.out.println("The day of the week is: " + dayOfWeek);
	}

}
