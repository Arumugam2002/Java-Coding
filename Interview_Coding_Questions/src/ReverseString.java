public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello Arumugam";
        char[] chars = new char[str.length()];
        
        // Copy string to char array manually
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        
        // Reverse each word
        int start = 0;
        String result = "";
        
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ' || i == chars.length - 1) {
                int end = (chars[i] == ' ') ? i - 1 : i;
                
                // Reverse characters from start to end
                while (end >= start) {
                    result = result + chars[end];
                    end--;
                }
                
                if (i != chars.length - 1) {
                    result = result + " ";
                }
                
                start = i + 1;
            }
        }
        
        System.out.println(result);
    }
}