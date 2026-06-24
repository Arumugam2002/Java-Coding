import java.util.*;
public class ReverseNumberWIthSignedInteger {
	public int reverse(int num)
    {
        long rev = 0;
        
        long rem = 0;
        
        while(num!=0)
        {
            rem = num % 10;
            
            rev = (rev * 10) + rem;
            
            num = num/10;
            
            
            
           
        }
        
        if(rev>Integer.MAX_VALUE || rev <Integer.MIN_VALUE)
            {
                return 0;
            }
        
         return(int) rev;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number:- ");
        
        int num = sc.nextInt();
        
        ReverseNumberWIthSignedInteger sol1 = new ReverseNumberWIthSignedInteger();
        
        int result = sol1.reverse(num);
        
        System.out.println(result);
        
        
        
    }
}
