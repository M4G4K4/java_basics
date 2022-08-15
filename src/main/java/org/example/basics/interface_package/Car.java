package org.example.basics.interface_package;

public class Car implements Player, Vehicle {
    @Override
    public int run() {
        return 0;
    }

    @Override
    public int walk() {
        return 0;
    }

    @Override
    public String talk() {
        return null;
    }
}
