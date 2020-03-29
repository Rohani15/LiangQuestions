package liangQuestions;

public class two_18 
{

	public static void main(String[] args) 
	{
		System.out.println("a\tb\tpow(a,b)");
		
		for(int i = 1; i <= 5; i++)
		{
			System.out.println(i + "\t" + (i + 1) + "\t" + Math.pow(i, i + 1));
		}
		
	}

/*	public class Exercise_02_eighteen {

	    public static void main(String[] args) {
	        final int total = 5;

	        System.out.println("a\tb\tpow(a, b)");

	        for (int a = 1, b = 2; a <= total; a++, b++)
	            System.out.format("%d\t%d\t%d\n", a, b, (int)Math.pow(a, b));
	    }

	}
	
	
	//--------------------------------------------------------------------
	 
	 public class Main 
	 {
    public static void main(String[] args) 
    {
        System.out.println("a\tb\tpow(a, b)");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + "\t" + (i + 1) + "\t" + (int) Math.pow(i, i + 1));
        }
    }
}
	
	*/
	
	
}
