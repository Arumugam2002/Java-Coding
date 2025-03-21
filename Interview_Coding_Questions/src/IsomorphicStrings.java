import java.util.HashMap;
import java.util.Scanner;

public class IsomorphicStrings {

	public  boolean isIsomorphic(String s, String t)
	{
		if(s.length() != t.length())
		{
			return false;
		}
		
		HashMap<Character, Character> map1 = new HashMap<>();
		HashMap<Character, Character> map2 = new HashMap<>();
		
		for(int i=0;i<s.length();i++)
		{
			char word1 = s.charAt(i);
			char word2 = t.charAt(i);
			
			if(map1.containsKey(word1))
			{
				if(map1.get(word1)!= word2)
				{
					return false;
				}
			}
			
			else {
				map1.put(word1, word2);
			}
			
			if(map2.containsKey(word2))
			{
				if(map2.get(word2) != word1)
				{
					return false;
				}
			}
			
			else {
				map2.put(word2, word1);
			}
		}
		
		return true;
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String str1, str2;
		
		System.out.println("Enter String 1:- ");
		
		str1 = sc.nextLine();
		
		System.out.println("Enter String 2:- ");
		
		str2 = sc.nextLine();
		
		IsomorphicStrings isomorphic1 = new IsomorphicStrings();
		
		
		
		boolean result = isomorphic1.isIsomorphic(str1, str2);
		
		System.out.println("Result:- "  + result);
		
		
	}
	
	
}
