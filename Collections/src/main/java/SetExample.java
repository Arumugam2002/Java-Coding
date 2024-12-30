import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        Set<String> names = new HashSet<>(List.of("Yamini", "Vedika", "Yashika"));

        names.add("Arumugam");
        names.add("Suresh");
        names.add("Ramesh");
        names.add("Arun");
        //names.add("Arun");

        names.add("Kamal");

        names.remove("Ramesh");

        System.out.println(names.contains("Arumugam"));
        System.out.println(names.size());
         names.clear();
        System.out.println(names.isEmpty());

//        for(String name: names)
//        {
//            System.out.print(name + " ");
//        }

    }
}
