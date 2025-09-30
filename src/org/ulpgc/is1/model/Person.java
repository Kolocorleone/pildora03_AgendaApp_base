package org.ulpgc.is1.model;

public class Person extends Contact {
    private String firstName;
    private String lastName;

    public Person(String telephone, String email, String firstName, String lastName) {
        super(telephone, email);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
