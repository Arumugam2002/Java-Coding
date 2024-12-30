import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        /*String[] names = new String[3];

        names[0] = "Arumugam";
        names[1] = "Rahul";
        names[2] = "Kevin";

        for(String name: names)
        {
            System.out.println(name);
        }

        */

        ArrayList<String> names = new ArrayList<String>();

        names.add("Arumugam");
        names.add("Suresh");
        names.add("Ramesh");
        names.set(0,"Rahul");
        names.remove(2);


        for(String name: names)
        {
            System.out.println(name);

        }
    }
}
