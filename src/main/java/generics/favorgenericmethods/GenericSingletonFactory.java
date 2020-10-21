package generics.favorgenericmethods;

import java.util.function.UnaryOperator;

import static generics.favorgenericmethods.Example.identityFunction;

public class GenericSingletonFactory {

    // Sample program to exercise generic singleton

    public static void main(String[] args) {

        String[] strings = { "jute", "hemp", "nylon" };

        UnaryOperator<String> sameString = identityFunction();

        for (String s : strings)

            System.out.println(sameString.apply(s));



        Number[] numbers = { 1, 2.0, 3L };

        UnaryOperator<Number> sameNumber = identityFunction();

        for (Number n : numbers)

            System.out.println(sameNumber.apply(n));

    }
}
