import java.util.Scanner;

public class SumBetweenRange {
    public static int sumBetweenRange(int m, int n) {
        return (n * (n + 1) / 2) - ((m - 1) * m / 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers:- ");
        
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(sumBetweenRange(m, n));
        sc.close();
    }
}