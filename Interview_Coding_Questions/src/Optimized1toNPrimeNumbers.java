import java.util.Scanner;

public class Optimized1toNPrimeNumbers {

	public boolean isPrime(int num)
	{
		if(num<=1)
		{
			return false; //If negative number and 0, 1 are there return false
		}
		
		if(num == 2)
		{
			return true; // 2 is a prime number so it will always be true
		}
		
		if(num % 2 == 0)
		{
			return false; //Any number divisible by 2 will not be prime number so it will return false
		}
		
		for(int i=3;i*i<=num; i+=2)
		{
			if(num % i == 0)
			{
				return false; // If a number has multiple then it will be false
			}
		}
		
		return true;
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value for range:- ");
		
		int num = sc.nextInt();
		
		Optimized1toNPrimeNumbers sol1 = new Optimized1toNPrimeNumbers();
		
		for(int i = 2; i<= num;i++)
		{
			boolean result = sol1.isPrime(i);
			
			if(result)
			{
				System.out.print(i + " ");
			}
		}
	}
}
