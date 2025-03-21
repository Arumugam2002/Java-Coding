import java.util.Scanner;

public class ArrayIndexProgram {

	public static void main(String[] args)
	{
		int index1, index2, temp;
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[20];
		
		System.out.println("Enter numbers :- ");
		
		for(int i=0;i<20;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter index 1: ");
		
		index1 = sc.nextInt();
		
		System.out.println("Enter index 2: ");
		
		index2 = sc.nextInt();
		
		for(int i=index1;i<=index2;i++)
		{
			for(int j=index1;j<index2 - (i - index1);j++)
			{
				if(arr[j] > arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println("Displayed array are :- ");
		
		for(int i=0;i<20;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	
	
}
