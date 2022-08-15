package org.example.basics.immutable;

public class Main {
    public static void main(String[] args) {

        /** String immutability
         * Strings in java are immutable because when a string is declared in created in memory a place to store the string ,
         * but if the variable is changed the initial value stays there and the value of the string is saved in a new place in memory .
         *
         * This happens because when 2 variables have the same string value the 2 variables point to the same place in
         * memory and changing one variable value can not change to the other variable.
         */

        String name = "Pedro";
        String anotherName = "Pedro";

        String name2 = new String("Pedro");

        System.out.println(name == anotherName);

        System.out.println(name.hashCode());
        System.out.println(anotherName.hashCode());

        System.out.println(" ##### ");

        System.out.println(name == name2);
        System.out.println(name2.hashCode());
    }
}
