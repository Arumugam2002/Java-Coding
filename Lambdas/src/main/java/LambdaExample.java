import java.util.ArrayList;
import java.util.List;

public class LambdaExample {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Arumugam");
        names.add("Suresh");
        names.add("Ramesh");
        names.add("Rajesh");
        names.add("Lokesh");

        names.forEach((n) -> System.out.println(n));
    }
}
