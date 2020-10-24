package lambdasandstreams.preferlambdastoanonymousclasses;

import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparingInt;

public class Example {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("one", "two", "three");
        words.sort(comparingInt(String::length));
    }
}
