import java.util.Scanner;

public class TwoCharacterSetContainingSameCharacterWithShuffleWithArray {

    public static boolean isRotation(String[] s1, String[] s2)
    {
        if(s1.length!= s2.length)
        {
            return false;
        }

        String[] doubledS1 = new String[s1.length*2];

        for(int i=0;i<s1.length;i++)
        {
            doubledS1[i] = s1[i];
            doubledS1[i + s1.length] = s1[i];
        }

        for(int i=0;i<doubledS1.length;i++)
        {
            boolean match = true;

            for(int j=0;j<s2.length;j++)
            {
                if(!doubledS1[i+j].equals(s2[j]))
                {
                    match = false;
                    break;
                }
            }

            if(match)
            {
                return true;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array1:- ");

        int n = sc.nextInt();

        String[] s1 = new String[n];

        System.out.println("Enter the elements of array1:- ");

        for(int i=0;i<n;i++)
        {
            s1[i] = sc.next();
        }

        String[] s2 = new String[n];

        System.out.println("Enter the elements of array2:- ");

        for(int i=0;i<n;i++)
        {
            s2[i] = sc.next();
        }

        boolean result = isRotation(s1,s2);
        System.out.println(result);

    }
}
