package com.spring.jpa.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Person {

    @Id
    @GeneratedValue
    private long pId;
    private String fname;
    private String lname;
    private int contact;

    public Person(String fname, String lname, int contact) {
        this.fname = fname;
        this.lname = lname;
        this.contact = contact;
    }
}
