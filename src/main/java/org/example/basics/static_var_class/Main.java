package org.example.basics.static_var_class;

public class Main {
    public static void main(String[] args) {
        // Get the variable value without instantiating the object
        System.out.println(StaticVar.apiUrl);

        // Static method
        StaticMethod.doStuff();

        // Static nested class
        StaticClass.Cenas cenas = new StaticClass.Cenas();
        cenas.doStuff();
        cenas.getAge();
    }
}
