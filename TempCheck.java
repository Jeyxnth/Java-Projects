import java.util.Scanner;
public class TempCheck
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Temperature in Degree Celsius");
		int Temp = sc.nextInt();
		
		if(Temp>30)
			System.out.println("It's Hot!");
		else if (Temp>=20 && Temp <=30)
			System.out.println("It's Warm");
		else if (Temp>= 10 && Temp<=20)
			System.out.println("It's cool");
		else
			System.out.println("It's Cold");
		sc.close();
	}
}
