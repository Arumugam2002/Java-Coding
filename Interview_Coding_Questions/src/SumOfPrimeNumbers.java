import java.util.Scanner;

public class SumOfPrimeNumbers {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the range of numbers:- ");
		
		int n = sc.nextInt();
		
		int result = primeSum(n);
		
		System.out.println("Sum of Prime Numbers is " + result);
		
	}
	
	public static int primeSum(int n)
	{
		int sum = 0;
		for(int i=2;i<n;i++)
		{
			int flag = 1;
			
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=0;
					break;
				
				}
			}
			
			if(flag == 1)
			{
				sum += i;
			}
		}
		
		return sum;
	}
	
}
