import java.util.Scanner;
import java.util.ArrayList;
public class Replace
{
	public static ArrayList<Integer> IndexPos (String s,String sub)
	{
		ArrayList<Integer> positions = new  ArrayList<>();
		int index = s.indexOf(sub);
		while(index != -1)
		{
			positions.add(index);
			index = s.indexOf(sub, index + 1);
		}
		return positions;
	}
	public static String ManualReplace ( String s, String sub, String rep)
	{
		StringBuilder result = new StringBuilder();
		int i =0;
		
		while (i<s.length())
		{
			if ( i <= s.length()-sub.length() && s.substring(i,i+sub.length()).equals(sub))
			{
				result.append(rep);
				i+=sub.length();
			}
			else
			{
				result.append(s.charAt(i));
				i++;
			}
		}
		return result.toString();
	}
	public static boolean Compare (String Manualresult, String BuiltInResult)
	{
		return Manualresult.equals(BuiltInResult);
	}
	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter main string");
		String mainText = input.nextLine();
		System.out.println("Enter Substring to find");
		String toFind = input.nextLine();
		System.out.println("Enter Replacement string");
		String replacement = input.nextLine();
		
		ArrayList<Integer> positions = IndexPos(mainText,toFind);
		System.out.println("The index positions: " + positions);
		
		String Manualresult = ManualReplace(mainText,toFind,replacement);
		System.out.println("Manual replacement result: " + Manualresult);
		
		String builtInResult = mainText.replace(toFind, replacement);
        System.out.println("Built-in replacement result: " + builtInResult);

        boolean isSame = Compare(Manualresult, builtInResult);
        System.out.println("Do both methods produce the same result? " + isSame);
		
	}
}