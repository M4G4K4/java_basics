package org.example.basics.design_patterns.singleton;

public class MySingletonClass {

    // create an object of SingleObject
    private static MySingletonClass instance = new MySingletonClass();

    //make the constructor private so that this class cannot be
    //instantiated
    private MySingletonClass(){}

    //Get the only object available
    public static MySingletonClass getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
