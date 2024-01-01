/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard 
{
	public static void main(String[] args) 
	{
		int n = Integer.parseInt(args[0]);
		for (int i = 0 ; i <= n-1 ; i++ )
		{
			if (i % 2 ==1 ) System.out.print(" ");
			for (int j = 0 ; j <= n-1 ; j++)
			{
				if (j == (n-1)) System.out.print("*");
				else System.out.print("* "); 
			}
		    System.out.println("");
		}
	}
}

