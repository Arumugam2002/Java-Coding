import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VotingWinnerProgram {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter total number of candidates:- ");
		
		int numberOfCandidates = sc.nextInt();
		
		System.out.println("Enter total number of locations:- ");
		
		int numberOfLocations = sc.nextInt();
		
		char[] candidates = new char[numberOfCandidates];
		
		
		System.out.println("Enter number of Candidates:- ");
		
		for(int i=0;i<numberOfCandidates;i++)
		{
			candidates[i] = sc.next().charAt(0);
		}
		
		Map<Character, Integer> voteCount = new HashMap<>();
		
		int totalVotes = numberOfLocations;
		
		for(int i=0;i<numberOfLocations;i++)
		{
			char vote = sc.next().charAt(0);
			
			for(char c: candidates)
			{
				if(vote == c)
				{

					voteCount.put(vote, voteCount.getOrDefault(vote, 0) + 1);
					break;
				}
			}
			
		}
		
		char winner = ' ';
		
		int maxVotes = 0;
		boolean isTie = false;
		
		
		for(Map.Entry<Character, Integer> entry : voteCount.entrySet())
		{
			if(entry.getValue() > maxVotes)

			{
				maxVotes = entry.getValue();
				winner = entry.getKey();
				isTie = false;
			}
			else if(entry.getValue() == maxVotes)
			{
				isTie = true;
			}
		}
		
		if(!isTie && maxVotes > totalVotes/2)
		{
			System.out.println("The winner is " + winner);
		}
		else {
			System.out.println("No Winner");
		}
	}
	
}
