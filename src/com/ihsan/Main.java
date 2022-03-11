package com.ihsan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person ihsan = new Person("Ihsan", 18, "3203948392");
        Person dono = new Person();
        Person andika = new Employee("Jojo", 20, "389389903", "Embreo", "Engineer");

        ihsan.getInformation();
        dono.getInformation();
        andika.getInformation();
    }
}
