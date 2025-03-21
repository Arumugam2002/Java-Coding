import java.util.Scanner;

public class SortCharactersArray {

	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the total number of characters:- ");
		
		int size = sc.nextInt();
		
		char[] charArray = new char[size];
		
		System.out.println("Enter characters:- ");
		
		for(int i=0;i<size;i++)
		{
			charArray[i] = sc.next().charAt(0);
		}
		
		for(int i=0;i<size - 1;i++)
		{
			for(int j=0;j<size - i - 1;j++)
			{
				if(charArray[j] > charArray[j+1])
				{
					char temp = charArray[j];
					charArray[j] = charArray[j+1];
					charArray[j+1] = temp;
				}
			}
		}
		
		System.out.println("Sorted Characters are :- ");
		for(char c: charArray)
		{
			System.out.print(c + " ");
		}
	}
}
