public class FindUniqueElement {
    public static int findUnique(int[] arr) {
        int unique = 0;
        
        for (int num : arr) {
            unique ^= num; // XOR operation
        }
        
        return unique;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 3, 2}; // Given input
        System.out.println("Unique Element: " + findUnique(arr)); // Output: 5
    }
}