package org.example.basics.interface_package;

public class Naruto implements Player{
    @Override
    public int run() {
        return 2;
    }

    @Override
    public int walk() {
        return 1;
    }

    @Override
    public String talk() {
        System.out.println("ARRRRR");
        return "ARRRRR";
    }
}
