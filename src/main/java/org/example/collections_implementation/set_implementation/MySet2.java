package org.example.collections_implementation.set_implementation;

import java.util.HashMap;
import java.util.Iterator;

public class MySet2<E> {
    private transient HashMap<E, Object> map;

    // Dummy value to associate with an Object in the backing Map
    private static final Object PRESENT = new Object();

    public boolean add(E e) {
        return map.put(e, PRESENT) == null;
    }

    // Since PRESENT is a constant, for all keys we have same value in backup HashMap called map.

    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }
}