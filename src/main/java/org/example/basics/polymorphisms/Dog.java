package org.example.basics.polymorphisms;

public class Dog extends Animal{
    private String bread;

    public Dog(String name, String color, String bread) {
        super(name, color);
        this.bread = bread;
    }

    /**
     * Polymorphism is one method overriding a method in parent class ,
     * Making the same thing in a different way
     *
     * Since this function with this signature exists in the parent class
     * it will overriden in the child class
     */
    public void eat(){
        System.out.println("hum");
    }

    public String getBread() {
        return bread;
    }

    public Dog setBread(String bread) {
        this.bread = bread;
        return this;
    }
}
