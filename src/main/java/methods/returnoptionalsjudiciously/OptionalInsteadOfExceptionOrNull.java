package methods.returnoptionalsjudiciously;

import java.util.Collection;
import java.util.Objects;
import java.util.Optional;

public class OptionalInsteadOfExceptionOrNull {

    // Returns maximum value in collection as an Optional<E>

    public static <E extends Comparable<E>>

    Optional<E> max(Collection<E> c) {

        if (c.isEmpty())

            return Optional.empty();



        E result = null;

        for (E e : c)

            if (result == null || e.compareTo(result) > 0)

                result = Objects.requireNonNull(e);



        return Optional.of(result);

    }
}
