import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringCharacterOccuringOnce {
    public static void main(String[] args) {
        String input1 = "swadesh";
        String input2 = "aabbcc";

        processString(input1);
        processString(input2);
    }

    public static void processString(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        Map<Character, Integer> indexMap = new LinkedHashMap<>();

        // Count frequency and store the index of first occurrence
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
            indexMap.putIfAbsent(ch, i);
        }

        // Find the first non-repeating character
        String firstNonRepeating = "None";
        for (Map.Entry<Character, Integer> entry : indexMap.entrySet()) {
            if (freqMap.get(entry.getKey()) == 1) {
                firstNonRepeating = String.valueOf(entry.getKey());
                break;
            }
        }

        // Find the most frequent character
        char mostFrequent = s.charAt(0);
        int maxFreq = 0;
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        // If all characters are unique, return the first character
        if (maxFreq == 1) {
            mostFrequent = s.charAt(0);
        }

        // Print the result
        System.out.println(firstNonRepeating + " " + mostFrequent);
    }
}
