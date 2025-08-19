import java.util.Scanner;
public class StrCmp
{
	public static int StringLength(String str)
	{
		int count = 0;
		try
		{
			while(true)
			{
				str.charAt(count);
				count++;
			}
		}
		catch (IndexOutOfBoundsException e)
		{}
		return count;
	}
	public static String[] wordsplit(String text)
	{
		int length = stringLength(text);
		
		int spacecount = 0;
		for (int i = 0; i<length;i++)
		{
			if ( text.charAt(i) == " ")
				spacecount++;
		}
		
		int wordcount = spacecount+1;
		
		int[] SpaceIndices = new int[spacecount];
		int index = 0;
		for (int i = 0; i<length;i++)
		{
			if(text.charAt(i) == " ")
			{
				SpaceIndices[index]=i;
				index++;
			}
		}
		
		string[] words = new String[wordcount]
		int start;
		for ( int i = 0;i<length;i++)
		{
			int end;
			if (i == spacecount)
				end = length;
			else
				end = SpaceIndices[i];
		}
		StringBuilder word = new StringBuilder();
		for ( int j = start; j < end ; j++)
		{
			word.append(text.charAt(j));
		}
		words[i] = word.toString();
		start = end+1
	}
	return words;
}
 public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1 == null || arr2 == null) return false;
        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        String[] customSplit = wordsplit(input);

        System.out.println("\nCustom split result:");
        for (String word : customSplit) {
            System.out.println(word);
        }

        boolean areEqual = compareStringArrays(customSplit, builtInSplit);
        System.out.println("\nAre the two split results equal? " + areEqual);

        sc.close();
    }
}