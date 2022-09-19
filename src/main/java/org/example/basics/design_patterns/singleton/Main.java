package org.example.basics.design_patterns.singleton;

public class Main {
    public static void main(String[] args) {
        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //MySingletonClass object = new MySingletonClass();


        //Get the only object available
        MySingletonClass object = MySingletonClass.getInstance();

        //show the message
        object.showMessage();
    }
}
