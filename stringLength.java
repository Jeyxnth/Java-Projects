import java.util.Scanner;
public class stringLength
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a string");
		String input = sc.nextLine();
		
		int count = 0;
		try{
			while(true)
			{
				input.charAt(count);
				count++;
			}
		}
		catch(IndexOutOfBoundsException e)
		{}
		System.out.println("The length of the given string is " + count);
	}
} 