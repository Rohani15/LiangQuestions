package liangQuestions;

import java.util.Scanner;

public class three_19 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter three integer: ");
		
		int inta = input.nextInt();
		int intb = input.nextInt();
		int intc = input.nextInt();
		
		boolean valid = ((inta + intb > intc) 
				|| (intc + inta > intb)
				|| (intb + intc > inta)); 
		
		if (valid)
		{
			System.out.println("P = " + (inta + intb + intc));

		}
		else
		{
			System.out.println("Can not compute. Is invalud");
		}

		
	}

}
