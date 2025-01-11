import java.util.Scanner;

public class TwoStringContainingSameCharacterWithShuffle {

    public static boolean isRotation(String s1, String s2) {
        if(s1.length() != s2.length())
        {
            return false;
        }

        String concatenatedString = s1 + s1;
        return concatenatedString.contains(s2);


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String:- ");
        String s1 = sc.nextLine();

        System.out.println("Enter Second String:- ");
        String s2 = sc.nextLine();

        boolean output = isRotation(s1,s2);

        System.out.println(output);
    }
}
