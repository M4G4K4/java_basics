package org.example.basics.record;

import java.util.Objects;

public class Person {
    private final String name;
    private final int personId;

    public Person(String name, int personId) {
        this.name = name;
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public int getPersonId() {
        return personId;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personId=" + personId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null){
            return false;
        }
        if(getClass() != o.getClass()){
            return false;
        }
        Person person = (Person) o;
        return Objects.equals(personId, person.personId) && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPersonId());
    }
}
