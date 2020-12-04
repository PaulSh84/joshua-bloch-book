package exceptions.throwexceptionsappropriatetoabstractions;

public class ExceptionsOnDifferentLevels {

    /* higher layers should catch lower-level exceptions and, in their place,
        throw exceptions that can be explained in terms of the higher-level abstraction.
     */

    /* if it isn’t feasible to prevent or to handle exceptions from lower layers, use exception translation,
        unless the lower-level method happens to guarantee that all of its exceptions are appropriate to the higher level
     */

    /* Chaining provides the best of both worlds: it allows you to throw an appropriate higher-level exception,
        while capturing the underlying cause for failure analysis
     */
}
