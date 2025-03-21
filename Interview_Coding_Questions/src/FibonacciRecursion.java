
public class FibonacciRecursion {

	public static int fib(int n)
	{
		if(n == 0 || n == 1)
		{
			return n;
		}
		
		int fib1 = fib(n-1);
		int fib2 = fib(n-2);
		
		int fib3 = fib1 + fib2;
		
		return fib3;
	}
	
	public static void main(String[] args)
	{
		int n = 30;
		
		for(int i=0;i<n;i++)
		{
			System.out.println(fib(i) + " ");
		}
		
	}
	
}
