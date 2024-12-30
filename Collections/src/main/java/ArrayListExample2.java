import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListExample2 {


    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(List.of(250,320,100,466,132,50,31,65));

        System.out.println(numbers.retainAll(List.of(300,100,50)));
        System.out.println(numbers.containsAll(List.of(250,65)));
        System.out.println(numbers.removeAll(List.of(466,132)));

        numbers.sort(Comparator.naturalOrder());
        System.out.println(numbers);
        numbers.sort(Comparator.reverseOrder());
        System.out.println(numbers);





    }
}
