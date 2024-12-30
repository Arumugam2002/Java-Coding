import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<ArrayListObjectExample> names = new ArrayList<ArrayListObjectExample>();

        names.add(new ArrayListObjectExample("Arumugam",1));
        names.add(new ArrayListObjectExample("Rahul", 3));
        names.add(new ArrayListObjectExample("Harsh",5));
        names.add(new ArrayListObjectExample("Prashant", 8));

        for(ArrayListObjectExample name: names)
        {
            System.out.println(name.getName() + " has an id of " + name.getId());
        }

    }
}
