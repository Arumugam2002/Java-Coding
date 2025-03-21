import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroes {

	
	 public void moveZeroes(int[] nums) {
	        
	        int n = nums.length;

	        int j = -1;

	        for(int i=0;i<n;i++)
	        {
	            if(nums[i] == 0)
	            {
	                j=i;
	                break;
	            }
	        }

	        if(j == -1)
	        {
	            System.out.println(Arrays.toString(nums));
	            return;
	        }

	        for(int i=j+1;i<n;i++)
	        {
	            if(nums[i]!=0)
	            {
	                int temp = nums[i];
	                nums[i] = nums[j];
	                nums[j] = temp;
	                j++;
	            }
	        }

	        System.out.println(Arrays.toString(nums));

	        

	    }

	    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);

	       
	        System.out.println("Enter size of the array:- ");
	        int n = sc.nextInt();
	         int nums[] = new int[n];

	         System.out.println("Enter numbers:- ");

	        for(int i=0;i<nums.length;i++)
	        {
	                nums[i] = sc.nextInt(); 
	        }

	        MoveZeroes s1 = new MoveZeroes();

	        s1.moveZeroes(nums);

	        // int ans[] = nums.moveZeroes(nums);

	        // for(int i=0;i<nums.length;i++)
	        // {
	        //         System.out.println(ans[i] + " "); 
	        // }

	    }
}
