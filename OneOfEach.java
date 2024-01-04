
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class  OneOfEach
{
	public static void main(String[] args) 
	{
		int boys = 0;
		int girls = 0;
		double random = 0.5;
		while ( boys == 0 || girls == 0)
		{
			random = Math.random();
			if (random < 0.5)
			{
				boys++;
				System.out.print("b ");
			}
			else 
			{
				girls++;
				System.out.print("g ");
			}
		}
		System.out.println("");
        System.out.println("You made it... and you now have " + (girls + boys) + " children");
        
	}
}

