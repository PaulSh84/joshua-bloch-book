package concurrency.documentthreadsafety;

public class ThreadSafety {

    /* Levels of thread safety */

    /*
     Immutable
        Instances of this class appear constant. No external synchronization is necessary.
              Examples include String, Long, and BigInteger.
     */

    /*
    Unconditionally thread-safe
        Instances of this class are mutable, but the class has sufficient internal synchronization
        that its instances can be used concurrently without the need for any external synchronization.
        Examples include AtomicLong and ConcurrentHashMap.
     */

    /*Conditionally thread-safe
        Like unconditionally thread-safe, except that some methods require external synchronization for safe concurrent use.
        Examples include the collections returned by the Collections.synchronized wrappers, whose iterators require external synchronization.
     */

    /* Not thread-safe
        Instances of this class are mutable. To use them concurrently,
        clients must surround each method invocation (or invocation sequence) with external synchronization of the clients’ choosing.
        Examples include the general-purpose collection implementations, such as ArrayList and HashMap.
     */

    /* Thread-hostile
        This class is unsafe for concurrent use
        even if every method invocation is surrounded by external synchronization
     */




}
