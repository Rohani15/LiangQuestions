/*
(Financial: compare costs) Suppose you shop for rice in two different packages.
You would like to write a program to compare the cost. The program prompts the
user to enter the weight and price of the each package and displays the one with
the better price.
*/

package liangQuestions;

import java.util.Scanner;

public class three_33 
{

	public static void main(String[] args) 
	{
	    Scanner input = new Scanner(System.in);
	    
	    System.out.println("Enter weight of package one");
	    double weight1 = input.nextDouble(); 
	    double price1 = input.nextDouble(); 
	    
	    System.out.println("Enter weight of package two");
	    double weight2 = input.nextDouble(); 
	    double price2 = input.nextDouble(); 

	    if (weight1 / price1 > weight2 / price2)
	    		System.out.println("Package one is heavier");
	    else if (weight2 / price2 > weight1 / price1)
	    		System.out.println("Package 2 is heavier");
	    else
	    		System.out.println("Packages weight the same");

	}

}
