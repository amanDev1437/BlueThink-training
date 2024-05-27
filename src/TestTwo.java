import java.util.Arrays;
import java.util.stream.Stream;

public class TestTwo{
    public static void main(String[] args) {

        Integer[] arr = {10,10,20,20,30};

        Stream<Integer> stream = Arrays.stream(arr);
        Stream<Integer> stream1 = Arrays.stream(arr);
        Stream<Integer> stream2 = Arrays.stream(arr);
        Stream<Integer> stream3 = Arrays.stream(arr);

        System.out.println("filter");
        stream.filter(p->p>12).forEach(System.out::println);

        System.out.println("map");
        stream1.map(p-> p*2).forEach(System.out::println);

        System.out.println("Distinct");
        long distinct = stream3.distinct().count();

        System.out.println(distinct);

        System.out.println("reduce");
        System.out.println(stream2.reduce(1, (p1, p2) -> p1 +p2));

    }
}