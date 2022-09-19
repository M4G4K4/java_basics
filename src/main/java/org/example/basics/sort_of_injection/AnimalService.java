package org.example.basics.sort_of_injection;

public class AnimalService {
    private static PersonService personService;

    public void runCenas(){
        personService.doStuff();
    }
}
