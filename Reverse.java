/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class  Reverse
{
	public static void main(String[] args) 
	{
		String word = args[0];
        for (int i = word.length() - 1 ; i >= 0 ; i--)
        {
			System.out.print(word.charAt(i));
        }
		System.out.println("");
        System.out.print("The middle character is " + word.charAt((word.length()-1)/2));
	}
}
