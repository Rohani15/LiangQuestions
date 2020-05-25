/*
(Random month) Write a program that randomly generates an integer between 1
and 12 and displays the English month name January, February, …, December for
the number 1, 2, …, 12, accordingly.
*/
package liangQuestions;

public class three_4 
{

	public static void main(String[] args) 
	{
		
		String months[] = {"jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sept", "oct", "nov"}; 
		int i = 1;
		for (String month : months) // for each loop
		{
			System.out.println(i++ + " is Month: " + month);
		}
		
		//SWITCH STATEMENT SOLUTION-----------------------------------
		
		//Generate an integer from 1 - 12: 
		int monthh = (int)((Math.random() * 12) + 1);
		// display the Month name: 
		switch(monthh)
		{
		case 1: 
			System.out.println("Jan");
			break;
		case 2: 
			System.out.println("feb");
			break;
		case 3: 
			System.out.println("mar");
			break;
		case 4: 
			System.out.println("apr");
			break;
		case 5: 
			System.out.println("may");
			break;
		case 6: 
			System.out.println("jun");
			break;
		case 7: 
			System.out.println("jul");
			break;
		case 8: 
			System.out.println("aug");
			break;
		case 9: 
			System.out.println("sep");
			break;
		case 10: 
			System.out.println("oct");
			break;
		case 11: 
			System.out.println("nov");
			break;
		case 12: 
			System.out.println("dec");
			break;
		}
				
	}

}
