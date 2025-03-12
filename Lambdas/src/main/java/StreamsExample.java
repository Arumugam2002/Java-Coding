import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Arumugam", "Yash", "Harsh", "Mahesh");

        List<String> result = names.stream()
                .filter(s -> s.length() >4)
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }

}
