package org.example.basics.interface_package;

public class Sonic implements Player {

    @Override
    public int run() {
        return 10;
    }

    @Override
    public int walk() {
        return 5;
    }

    @Override
    public String talk() {
        System.out.printf("Heeelo");
        return "Heeelo";
    }
}
