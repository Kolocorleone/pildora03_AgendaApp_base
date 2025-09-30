package org.ulpgc.is1.model;

public class Company extends Contact {
    private String name;
    private String description;

    public Company(String telephone, String email, String name, String description) {
        super(telephone, email);
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }
}
