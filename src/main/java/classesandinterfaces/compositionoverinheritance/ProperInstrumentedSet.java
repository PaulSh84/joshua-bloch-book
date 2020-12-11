package classesandinterfaces.compositionoverinheritance;

import java.util.*;


// Wrapper class - uses composition in place of inheritance

public class ProperInstrumentedSet<E> extends ForwardingSet<E> {

    private int addCount = 0;



    public ProperInstrumentedSet(Set<E> s) {

        super(s);

    }



    @Override
    public boolean add(E e) {

        addCount++;

        return super.add(e);

    }

    @Override
    public boolean addAll(Collection<? extends E> c) {

        addCount += c.size();

        return super.addAll(c);

    }

    public int getAddCount() {

        return addCount;

    }

}
