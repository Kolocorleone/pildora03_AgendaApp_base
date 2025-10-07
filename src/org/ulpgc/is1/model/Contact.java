package org.ulpgc.is1.model;

public abstract class Contact {
    protected String telephone;
    protected String email;
    protected Address address;

    public Contact(String telephone, String email, String street, int number, int floor, String city) {
        this.telephone = telephone;
        this.email = email;
        this.address = new Address(street, number, floor, city);
    }


    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public abstract String getName();
}