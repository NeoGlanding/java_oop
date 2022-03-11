package com.ihsan;

public class Person {
    private String name;
    private int age;
    private String id;

    public Person() {
        this("Default Name", 0, "2020");
    }

    public void getInformation() {
        System.out.println("His name " + this.name + ", " + this.age + " year/s old" + ", ID " + this.id);
    }

    public String getName() {
        return this.name;
    }

    public Person(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public static void description() {
        System.out.println("Creating a Person");
    }


    public void walk() {
        System.out.println("Person is Walking");
    }

}
