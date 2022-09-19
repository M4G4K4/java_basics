package org.example.basics.static_var_class;

public class StaticClass {
    private String name;

    public static class Cenas{
        private String age;

        public void doStuff(){
            System.out.println("nested static class");
        }

        public String getAge() {
            return age;
        }

        public Cenas setAge(String age) {
            this.age = age;
            return this;
        }
    }
}
