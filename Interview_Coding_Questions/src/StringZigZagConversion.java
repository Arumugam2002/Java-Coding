
import java.util.*;

public class StringZigZagConversion{
    
    
    public String convert(String s, int numRows)
    {
        if(numRows == 1)
        {
            return s;
        }
        
        StringBuilder[] rows = new StringBuilder[numRows];
        
        for(int i=0;i<numRows;i++)
        {
            rows[i] = new StringBuilder();
        }
        
        int row = 0;
        boolean goingDown = false;
        
        for(char c : s.toCharArray())
        {
            rows[row].append(c);
            
            if(row == 0 || row == numRows - 1)
            {
                goingDown =!goingDown;
            }
            
            row += goingDown ? 1 : -1;
        }
        
        StringBuilder result = new StringBuilder();
        
        for(StringBuilder sb : rows)
        {
            result.append(sb);
        }
        
        return result.toString();
    }
    
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the string:- ");
        
        String s = sc.nextLine();
        
        System.out.println("Enter number of rows:- ");
        
        int numRows = sc.nextInt();
        
        StringZigZagConversion obj1 = new StringZigZagConversion();
        
        String result = obj1.convert(s, numRows);
        
        System.out.println("\n Zigzag Conversion result:- " + result);
    }
    
}