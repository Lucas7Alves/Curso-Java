import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {

        List<Integer> list = Arrays.asList(3, 4, 5, 6);
        Stream<Integer> st1 = list.stream();
        System.out.println(Arrays.toString(st1.toArray()));

        Stream<String> st2 = Stream.of("Maria", "Bob", "Alex");
        System.out.println(Arrays.toString(st2.toArray()));

        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(st3.limit(5).toArray()));

    }
}
