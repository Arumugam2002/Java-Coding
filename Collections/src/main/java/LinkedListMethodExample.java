import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMethodExample {

    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>(List.of(564,124,247,130,58,412,300));
        numbers.add(58);

        System.out.println(numbers.contains(124));

        System.out.println(numbers.indexOf(130));
        System.out.println(numbers.lastIndexOf(58));
//        numbers.remove();
//        numbers.removeFirst();
//        numbers.pop();
//        numbers.poll();
        numbers.pollFirst();

        numbers.addFirst(25);
        numbers.offerFirst(54);
        numbers.push(65);

        numbers.addLast(26);
        numbers.offerLast(85);
        numbers.offer(23);

        System.out.println(numbers.containsAll(List.of(124,247)));

        numbers.sort(Comparator.naturalOrder());
        System.out.println(numbers);
        numbers.sort(Comparator.reverseOrder());
        System.out.println(numbers);


        System.out.println("Numbers in linkedlist are:- ");
        for(int n: numbers)
        {
            System.out.print(n + " ");
        }

    }
}
