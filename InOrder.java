/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder
{
	public static void main(String[] args) 
	{
		int i0 = 0;
        int i1 = 0;
		while (i1>=i0)
		{
			i1 = (int) (10 * Math.random());
			if (i1 >= i0) 
			{
				System.out.print(i1 + " ");
			    i0 = i1;	
				
		    }
	    }
	}
}
