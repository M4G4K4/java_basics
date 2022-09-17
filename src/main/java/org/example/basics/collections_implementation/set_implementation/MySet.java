package org.example.basics.collections_implementation.set_implementation;

import java.util.AbstractSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MySet<E> extends AbstractSet<E> implements Set<E>, Cloneable, java.io.Serializable

{
    private transient HashMap<E,Object> map;

    // Dummy value to associate with an Object in the backing Map

    private static final Object PRESENT = new Object();



    public void HashSet() {
        map = new HashMap<>();
    }

    // SOME CODE ,i.e Other methods in Hash Set



    public boolean add(E e) {
        return map.put(e, PRESENT)==null;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    // SOME CODE ,i.e Other methods in Hash Set
}
