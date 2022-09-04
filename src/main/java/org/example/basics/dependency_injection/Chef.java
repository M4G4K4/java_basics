package org.example.basics.dependency_injection;

public class Chef {
    private Food food;


    public Chef(Food food){
        this.food = food;
    }



    public void prepareFood(){
        // Do something with food object
    }
}
