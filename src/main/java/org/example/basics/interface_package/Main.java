package org.example.basics.interface_package;

public class Main {
    public static void main(String[] args) {

        final String name = Player.name;

        Sonic sonic = new Sonic();
        sonic.talk();


        Player naruto = new Naruto();
        naruto.talk();
    }
}
