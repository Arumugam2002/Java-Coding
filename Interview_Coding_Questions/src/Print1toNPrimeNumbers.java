import java.util.Scanner;

public class Print1toNPrimeNumbers {


	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int counter;
		
		System.out.println("Enter range of numbers:- ");
		
		int n = sc.nextInt();
		
		System.out.print("The numbers between 1 to " + n + " are ");
		
		for(int j=2;j<=n;j++)
		{
			counter = 0;
			
			for(int i=1;i<=j;i++)
			{
				if(j%i==0)
				{
					counter++;
				}
			}
			
			if(counter == 2)
			{
				System.out.print(j+ " ");
			}
		}
	}
	
}
