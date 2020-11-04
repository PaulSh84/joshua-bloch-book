package lambdasandstreams.prefercollectiontostreamreturntype;

import java.nio.file.Files;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class StreamVersusIterable {

    public static void main(String[] args) {
        // Won't compile, due to limitations on Java's type inference

        for (ProcessHandle ph : ProcessHandle.allProcesses()::iterator) {

            // Process the process

        }


        // Hideous workaround to iterate over a stream

        for  (ProcessHandle ph : (Iterable<ProcessHandle>)

                ProcessHandle.allProcesses()::iterator);




        for (ProcessHandle p : iterableOf(ProcessHandle.allProcesses())) {

            // Process the process

        }



    }

    // Adapter from  Stream<E> to Iterable<E>

    public static <E> Iterable<E> iterableOf(Stream<E> stream) {

        return stream::iterator;

    }

    // Adapter from Iterable<E> to Stream<E>

    public static <E> Stream<E> streamOf(Iterable<E> iterable) {

        return StreamSupport.stream(iterable.spliterator(), false);

    }

    /**
     * The Collection interface is a subtype of Iterable and has a stream method,
     * so it provides for both iteration and stream access. Therefore, Collection or an appropriate subtype
     * is generally the best return type for a public, sequence-returning method.
     */

}
