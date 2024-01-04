/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect
{
	public static void main(String[] args) 
	{
		int N = Integer.parseInt(args[0]);
		int count = 1;
		String result = "1";
		for (int i = 2;i < N / 2 + 1 ; i++ )
		{
			if ( N % i == 0 ) 
				{
				count = count + i;
				result = result + " + " + i;
				}
		

	}
	if ( count == N ) System.out.println( N + " is a perfect number since " + N + " = " + result);
		else System.out.println( N + " is not a perfect number");
}
}
