package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contact> contactList;
    private List<Group> groupList;

    public Agenda() {
        this.contactList = new ArrayList<>();
        this.groupList = new ArrayList<>();
    }

    public void addPerson(String firstName, String lastName, String phone, String email,
                          String street, int number, int floor, String city) {
        contactList.add(new Person(firstName, lastName, phone, email, street, number, floor, city));
    }

    public void addCompany(String name, String phone, String email,
                           String street, int number, int floor, String city) {
        contactList.add(new Company(name, phone, email, street, number, floor, city));
    }

    public void addGroup(String name) {
        groupList.add(new Group(name));
    }

    public Contact getContact(int index) { return contactList.get(index); }
    public Group getGroup(int index) { return groupList.get(index); }

    public void removeContact(Contact contact) { contactList.remove(contact); }

    public int contactCount() { return contactList.size(); }
    public int groupCount() { return groupList.size(); }

    public List<Contact> getContactList() { return contactList; }
    public List<Group> getGroupList() { return groupList; }
}