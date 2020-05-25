/*
 * (Random point) Write a program that displays a random coordinate in a rectangle. 
 * The rectangle is centered at (0, 0) with width 100 and height 200.
 */
package liangQuestions;

public class three_16 
{

	public static void main(String[] args) 
	{
		int width = (int)((Math.random() * (100)) - 50);
		int height = (int)((Math.random() * (200)) - 100); 
		
		System.out.println(width + " " + height);


	}

}
