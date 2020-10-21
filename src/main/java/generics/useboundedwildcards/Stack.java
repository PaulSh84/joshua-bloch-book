package generics.useboundedwildcards;

import java.util.Collection;

public abstract class Stack<E> {

//    public Stack();
//
    public abstract void push(E e);
//
    public abstract E pop();
//
    public abstract boolean isEmpty();



    // pushAll method without wildcard type - deficient!

    public void pushAllDeficient(Iterable<E> src) {

        for (E e : src)

            push(e);

    }

    // Wildcard type for a parameter that serves as an E producer

    public void pushAll(Iterable<? extends E> src) {

        for (E e : src)

            push(e);

    }


    // Wildcard type for parameter that serves as an E consumer

    public void popAll(Collection<? super E> dst) {

        while (!isEmpty())

            dst.add(pop());

    }
}
