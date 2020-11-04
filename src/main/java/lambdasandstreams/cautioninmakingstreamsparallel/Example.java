package lambdasandstreams.cautioninmakingstreamsparallel;

import sun.security.util.math.intpoly.IntegerPolynomial;

import java.math.BigInteger;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static java.math.BigInteger.ONE;

public class Example {

    // Stream-based program to generate the first 20 Mersenne primes

    public static void main(String[] args) {

        primes().map(p -> TWO.pow(p.intValueExact()).subtract(ONE))

                .filter(mersenne -> mersenne.isProbablePrime(50))

                .limit(20)

                .forEach(System.out::println);

    }



    static Stream<BigInteger> primes() {

        return Stream.iterate(TWO, BigInteger::nextProbablePrime);

    }

    // Prime-counting stream pipeline - parallel version

    static long pi(long n) {

        return LongStream.rangeClosed(2, n)

                .parallel()

                .mapToObj(BigInteger::valueOf)

                .filter(i -> i.isProbablePrime(50))

                .count();

    }
}
