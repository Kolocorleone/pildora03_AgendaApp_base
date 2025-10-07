package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private final String name;
    private List<Contact> contactList;

    public Group(String name) {
        this.name = name;
        this.contactList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addContact(Contact contact) {
        if(!contactList.contains(contact)) {
            contactList.add(contact);
        }
    }
    public void removeContact(Contact contact) {
        contactList.remove(contact);
    }
    public int contactCount() {
        return contactList.size();
    }

    public List<Contact> getContacts() {
        return contactList;
    }


}