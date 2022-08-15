package org.example.basics.generic;

public class GenericUtility {

    public <T> void doStuff(T thing) {
        System.out.println(thing);
    }

    public <T> T doStuff2(T thing) {
        return (T) new Cat("Cat");
    }

    public <T extends Animal> T doStuff3(final String name) {
        return (T) new Cat("Cat");
    }

    public <T, V> void doStuff4(T thing, V things2) {
        System.out.println(thing + " " + things2);
    }

    public <T> T doStuff5(T thing) {
        return thing;
    }

}
