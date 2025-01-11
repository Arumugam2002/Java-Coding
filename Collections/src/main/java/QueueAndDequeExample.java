import java.util.ArrayDeque;
import java.util.Deque;

public class QueueAndDequeExample {

    public static void main(String[] args) {

        Deque<String> cards = new ArrayDeque<>();

        cards.add("King");
        cards.add("Jack");
        cards.addFirst("One");
        cards.addLast("Ten");

        cards.removeFirst();
        cards.removeLast();


        System.out.println(cards);
        System.out.println(cards.getFirst());
        System.out.println(cards.getLast());

        System.out.println(cards.contains("King"));
//        System.out.println(cards.peekFirst());
//        System.out.println(cards.peekLast());

    }
}
