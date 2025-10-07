package org.ulpgc.is1.model;

import java.time.LocalDateTime;

public class Member {
    private Contact contact;
    private LocalDateTime date;

    public Member(Contact contact) {
        this.contact = contact;
        this.date = LocalDateTime.now(); // se guarda la fecha actual al crear el miembro
    }

    public Contact getContact() {
        return contact;
    }

    public LocalDateTime getDate() {
        return date;
    }
}
