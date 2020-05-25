package liangQuestions;

import java.util.Scanner;

public class three_8 
{

	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in); 
	    System.out.print("Enter three integers: ");

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        
        int temp = 0; //temp = temporarily
        
        if(a > b) //if a is greater than b, swap a with b
        {
        		temp = a;
        		a = b;
        		b = temp; 
        }
        if(b > c)
        {
        		b = temp;
        		b = c;
        		c = temp; 
        }
        if(a > b) //if a is greater than b, swap a with b
        {
        		temp = a;
        		a = b;
        		b = temp; 
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
	}

}
