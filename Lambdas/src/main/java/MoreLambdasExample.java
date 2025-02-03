import java.util.function.Predicate;

public class MoreLambdasExample {

    public static void main(String[] args) {

        StringExample s1 = (s) -> s + '?';
        System.out.println(s1.performString("Are you Fine"));

        String str1 = "Arumugam S";
        String str2 = "Pandaram";

        StringCompare comp = (word1, word2) -> {
            if(word1.length() > word2.length()) {
                return word1;
            }
                return word2;
        };

        String longWord = comp.compareString(str1,str2);
        System.out.println(longWord);

        Predicate<Integer> lessThan100 = i -> (i<100);
//        boolean result = lessThan100.test(20);
//        System.out.println(result);

        Predicate<Integer> greaterThan50 = i->(i>50);
        boolean result = greaterThan50.and(lessThan100).test(80);
        System.out.println(result);

        boolean resul1 = lessThan100.negate().test(200);
        System.out.println(resul1);


    }
}

@FunctionalInterface
interface StringExample{

    String performString(String s1);

}

@FunctionalInterface
interface StringCompare{
    String compareString(String s1, String s2);

}
