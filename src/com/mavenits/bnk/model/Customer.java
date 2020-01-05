package com.mavenits.bnk.model;

import java.time.LocalDate;

public class Customer {

    private String firstName;

    private String lastName;

    private String dob;

    private String postcode;

    private LocalDate createDated;

    private double balance;

    private long id;


    public Customer() {
        this.balance = 100.00;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public LocalDate getCreateDated() {
        return createDated;
    }

    public void setCreateDated(LocalDate createDated) {
        this.createDated = createDated;
    }
}
