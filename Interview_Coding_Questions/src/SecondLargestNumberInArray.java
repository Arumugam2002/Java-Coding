import java.util.Scanner;

public class SecondLargestNumberInArray {

	public static int secondLargest(int[] arr)
	{
		int n = arr.length;
		
		if(n<2)
		{
			return -1;
		}
		
		int large = Integer.MIN_VALUE;
		int second_large = Integer.MIN_VALUE;
		
		
		
		for(int i=0;i<n;i++)
		{
			if(arr[i] > large)
			{
				second_large = large;
				large = arr[i];
			}
			
			else if(arr[i] > second_large && arr[i]!= large)
			{
				second_large = arr[i];
			}
		}
		
		return second_large;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		
		System.out.println("Enter numbers:- ");
		
		for(int i=0;i<5;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int secondLargest = secondLargest(arr);
		
		System.out.println("Second Largest number in array is " + secondLargest);
	}
	
	
}
