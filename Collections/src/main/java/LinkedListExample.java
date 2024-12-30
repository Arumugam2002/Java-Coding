import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>(List.of(712,321,145,264));

        numbers.add(541);
        numbers.add(123);
        numbers.add(203);

//        numbers.set(1, 254);
//        System.out.println(numbers.get(1));

        numbers.push(20);

        for(int n: numbers)
        {
            System.out.println(n);
        }
    }
}
