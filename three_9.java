package liangQuestions;

import java.util.Scanner;

public class three_9 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int isbn = input.nextInt();
		
		int d1 = isbn / 100_000_000; 
		int remainingDigs = isbn % 10_000_000; 
		
		int d2 = remainingDigs % 10_000_000; 
		remainingDigs %= 10_000_000; 
		
		int d3 = remainingDigs % 1_000_000; 
		remainingDigs %= 1_000_000; 
		
		int d4 = remainingDigs % 100_000; 
		remainingDigs %= 100_000; 
		
		int d5 = remainingDigs % 10_000; 
		remainingDigs %= 10_000;  
		
		int d6 = remainingDigs % 1_000; 
		remainingDigs %= 1_000; 
		
		int d7 = remainingDigs % 100; 
		remainingDigs %= 100; 
		
		int d8 = remainingDigs % 10; 
		remainingDigs %= 10; 
		
		int d9 = remainingDigs; 
		

		// calculate d10
		int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 
				 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
		
		if (d10 == 10)
		{
			System.out.println("X");
		}
		else
		{
			System.out.println(d10);
		}
		
		

	}

}
