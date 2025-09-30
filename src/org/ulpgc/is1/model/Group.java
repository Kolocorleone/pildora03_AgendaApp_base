package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private final String name;
    private List<Contact> contacts;

    public Group(String name) {
        this.name = name;
        this.contacts = new ArrayList<>();
    }

    public void addContacts(Contact contact) {
        contacts.add(contact);
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public String getName() {
        return name;
    }
}