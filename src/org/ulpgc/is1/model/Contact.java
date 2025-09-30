package org.ulpgc.is1.model;

public abstract class Contact {
    private String telephone;
    private String email;

    public Contact(String telephone, String email) {
        this.telephone = telephone;
        this.email = email;
    }
    public Address getAddress() {
        return address;
    }
}