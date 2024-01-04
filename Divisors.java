/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class  Divisors
{
	public static void main(String[] args) 
	{
		int number = Integer.parseInt(args[0]);
		if (number ==0) System.out.println("all the integers divides the number 0");
		else 
			{
			for (int i = 1; i < ((  number  / 2 ) + 1); i++ )
		{
			if (number % i == 0) System.out.println(i);
			
		}
        System.out.println(number);
        


	}
}
}
