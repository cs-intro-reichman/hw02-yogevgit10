/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1

{
	public static void main(String[] args) 
	{
		int T = Integer.parseInt(args[0]); 
		int boys = 0;
		int girls = 0;
		double sum = 0;
		double random = 0.5;
		int family2= 0;
        int family3= 0;
        int family4ormore= 0;
		for (int i = 1 ; i <= T ; i++)
		{
            while ( boys == 0 || girls == 0)
		{
			random = Math.random();
			if (random < 0.5)
			{
				boys++;
				//System.out.print("b ");
			}
			else 
			{
				girls++;
				//System.out.print("g ");	
			}
			
		}
		if ( (girls + boys) == 2 ) family2 = family2 + 1;
		else if ((girls + boys) == 3 ) family3 = family3 + 1;
		else family4ormore = family4ormore + 1;
		sum = sum + girls + boys;
		girls = 0;
		boys = 0;
		}
		System.out.println("Average: " + (sum / ((double) (T))) + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + family2);
        System.out.println("Number of families with 3 children: " + family3);
		System.out.println("Number of families with 4 or more children: " + family4ormore);
		if (Math.max(Math.max(family2, family3),family4ormore)==family2)
             System.out.println("The most common number of children is 2.");
        else if (Math.max(Math.max(family2, family3),family4ormore)==family3)
		     System.out.println("The most common number of children is 3.");
        else System.out.println("The most common number of children is 4 or more.");
        //System.out.println("You made it... and you now have " + (girls + boys) + " children");



	}
}
