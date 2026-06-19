import java.util.Scanner;

public class SecondSmallestInArray {

	public static int secondSmallest(int arr[])
	{
		int n = arr.length;
		
		if(n<2)
		{
			return -1;
		}
		
		int smallest = Integer.MAX_VALUE;
		int second_smallest = Integer.MAX_VALUE;
		
		for(int i=0;i<n;i++)
		{
			if(arr[i] < smallest)
			{
				second_smallest = smallest;
				smallest = arr[i];
			}
			
			else if(arr[i] < second_smallest &&arr[i] != smallest)
			{
				second_smallest = arr[i];
			}
			
		}
		
		return second_smallest;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the range of numbers");
		
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the numbers:- ");
		
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int secondSmallestNumber = secondSmallest(arr);
		
		System.out.println("The second smallest number of this array is " + secondSmallestNumber);
		
	}
	
}
