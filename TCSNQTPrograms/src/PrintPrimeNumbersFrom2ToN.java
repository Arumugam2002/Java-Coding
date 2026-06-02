import java.util.Scanner;

public class PrintPrimeNumbersFrom2ToN {
    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Function to find the sum of prime numbers
    public static int sumOfPrimes(int N) {
        int sum = 0;
        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();
        System.out.println("Sum of Prime Numbers: " + sumOfPrimes(N));
        sc.close();
    }
}
