package org.ulpgc.is1.model;

public class Company extends Contact {
    private String name;

    public Company(String name, String telephone, String email, String street, int number, int floor, String city) {
        super(telephone, email, street, number, floor, city);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
