package lambdasandstreams.prefernosideeffectfunctions;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Collectors {


    /**
     *  The terminal operation forEach should only be used to report the result of a computation
     *  performed by a stream, not to perform the computation.
     *
     * The most important collector factories are toList, toSet, toMap, groupingBy, and joining.
     * */

    public static void main(String[] args) {
        List<String> words = Stream.of("one, two, three").collect(toList());

        Map<String, Long> freq = words.stream()
                .collect(groupingBy(String::toLowerCase, counting()));

        System.out.println(freq);
    }
}
