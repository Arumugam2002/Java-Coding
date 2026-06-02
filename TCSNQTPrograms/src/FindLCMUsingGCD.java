import java.util.Scanner;

public class FindLCMUsingGCD {

	public static long calculateGCD(long num1, long num2)
	{
		while(num2!=0)
		{
			long temp = num2;
		
			num2 = num1 % num2;
			num1 = temp;
			
		}
		
		return num1;
	}
	
	public static long calculateLCM(long num1, long num2)
	{
		long result = (num1/calculateGCD(num1, num2)) * num2;
		
		return result;
		
		
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number 1:- ");
		
		long num1 = sc.nextLong();
		
		System.out.println("Enter number 2:- ");
		long num2 = sc.nextLong();
		
		long result = calculateLCM(num1, num2);
		
		System.out.println( "The value of lcm is " + result);
	}
	
	
}
