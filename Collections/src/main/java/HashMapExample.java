import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {

        Map<Integer, String> names  = new HashMap<>();

        names.put(1, "Arumugam");
        names.put(2,"Ramesh");
        names.put(3,"Suresh");
        names.put(5, "Jack");
        names.put(4, "Riya");

        System.out.println(names.containsKey(4));
        System.out.println(names.containsValue("Naman"));
        System.out.println(names.putIfAbsent(10, "Kevin"));
        System.out.println(names.put(4, "Ravi"));
        System.out.println(names.put(6,"Rahul"));
        System.out.println(names.put(6,"Rahul Kumar"));
       // names.remove(5);

        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.isEmpty());
        names.clear();
        System.out.println(names);
        System.out.println(names.isEmpty());



    }
}
