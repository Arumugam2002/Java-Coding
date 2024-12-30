import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class ListExample {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(450,123,412,321,101,200,450,321));

        //numbers.clear();
        //System.out.println(numbers.isEmpty());

      //  System.out.println(numbers.size());
        System.out.println(numbers.contains(450));
        System.out.println(numbers.containsAll(List.of(412,200)));
        System.out.println(numbers.indexOf(123));
        System.out.println(numbers.indexOf(120));
        System.out.println(numbers.lastIndexOf(450));


         //System.out.println(numbers.removeAll(List.of(321,101)));

       numbers.sort(Comparator.naturalOrder());

        for(int n: numbers)
        {
            System.out.print(n + " ");
        }
       numbers.sort(Comparator.reverseOrder());
        System.out.println();
        for(int n: numbers)
        {
            System.out.print(n + " ");
      }


    }
}
