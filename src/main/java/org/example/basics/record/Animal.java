package org.example.basics.record;

public class Animal {
    private String name;
    private String sex;

    public Animal(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public Animal setName(String name) {
        this.name = name;
        return this;
    }

    public String getSex() {
        return sex;
    }

    public Animal setSex(String sex) {
        this.sex = sex;
        return this;
    }
}
