/*
(Financials: currency exchange) Write a program that prompts the user to enter
the exchange rate from currency in U.S. dollars to Chinese RMB. Prompt the user
to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert from
Chinese RMB and U.S. dollars. Prompt the user to enter the amount in U.S. dollars
or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively.
*/

package liangQuestions;

import java.util.Scanner;

public class three_31 
{

	public static void main(String[] args) 
	{
	    Scanner input = new Scanner(System.in);
	    
	    System.out.println("Enter the exchange rate from Dollars to RMB: "); //RMB is chinese Yuan 
	    double exchangeRate = input.nextDouble();
	    	    
	    System.out.println("Enter 0 to convert dollars(USD) to RMB and 1 vice versa");
	    double zeroOrOne = input.nextDouble();
	    
	    System.out.println("Enter money amount");
	    double money = input.nextDouble();
	    
	    if ( zeroOrOne == 0)
	    {
	    		System.out.println("The Conversion between USD to RMB is: " + (exchangeRate * money));
	    }
	    else if (zeroOrOne == 1)
	    {
    		System.out.println("The Conversion between RMB to USD is: " + (exchangeRate / money));
	    }
	    else
	    {
	    		System.out.println("Invalid");
	    }
	    
	    
	    
	}

}
