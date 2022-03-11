package com.ihsan;

public class Employee extends Person {
    private String workplace;
    private String departement;

    public Employee(String name, int age, String id, String workplace, String departement) {
        super(name, age, id);
        this.departement = departement;
        this.workplace = workplace;
    }

    @Override
    public void getInformation() {
        System.out.println("Name " + super.getName() + ", Working as " + this.departement + " at " + this.workplace);
    }
}
