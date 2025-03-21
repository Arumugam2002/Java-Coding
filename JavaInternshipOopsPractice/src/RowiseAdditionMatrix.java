import java.util.Scanner;

public class RowiseAdditionMatrix {

	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		
		
		int arr[][] = new int[3][3];
		
		int b[] = new int[3];
		
		System.out.println("Enter matrix:- ");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		
		
		System.out.println("The matrix is:- ");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int i=0;i<3;i++)
		{
			int sum = 0;
			int colsum = 0;
			for(int j=0;j<3;j++)
			{
				sum += arr[i][j];
				
				colsum += arr[j][i];
				
				
			}
			
			b[i] = colsum;
			
			System.out.println("Sum of Row is " + (i+1) + " " + sum);
		}
		
	for(int i=0;i<3;i++)
	{
		System.out.println(b[i] + " ");
	}
		
		
	}
	
	
	
}
