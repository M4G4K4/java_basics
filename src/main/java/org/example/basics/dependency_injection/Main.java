package org.example.basics.dependency_injection;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Chef pizzaChef = new Chef(new Pizza());
        Chef burgerChef = new Chef(new Burger());


        Map<String, String > asd = new HashMap<>();
    }
}
