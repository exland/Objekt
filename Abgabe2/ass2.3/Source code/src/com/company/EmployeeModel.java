package com.company;

import java.time.LocalDate;

public class EmployeeModel {

    public String getFirstName_() {
        return FirstName_;
    }

    public void setFirstName_(String firstName_) {
        FirstName_ = firstName_;
    }

    public String getLastName_() {
        return LastName_;
    }

    public void setLastName_(String lastName_) {
        LastName_ = lastName_;
    }

    public int getID_number_() {
        return ID_number_;
    }

    public void setID_number_(int ID_number_) {
        this.ID_number_ = ID_number_;
    }

    public String getGender_() {
        return gender_;
    }

    public void setGender_(String gender_) {
        this.gender_ = gender_;
    }

    public LocalDate getDateOfBirth_() {
        return dateOfBirth_;
    }

    public void setDateOfBirth_(LocalDate dateOfBirth_) {
        this.dateOfBirth_ = dateOfBirth_;
    }

    public String getEmail_() {
        return email_;
    }

    public void setEmail_(String email_) {
        this.email_ = email_;
    }

    public long getPhoneNumber_() {
        return PhoneNumber_;
    }

    public void setPhoneNumber_(long phoneNumber_) {
        PhoneNumber_ = phoneNumber_;
    }

    public String getAddress_() {
        return Address_;
    }

    public void setAddress_(String address_) {
        Address_ = address_;
    }

    private String FirstName_;
    private String LastName_;
    private int  ID_number_;
    private String gender_;
    private LocalDate dateOfBirth_;
    private String email_;
    private long PhoneNumber_;
    private String Address_;

    public EmployeeModel(String name, String Last_name, int id, String gender, LocalDate date, String email,long  Phone, String address)
    {
    FirstName_ = name;
    LastName_ = Last_name;
    ID_number_ =  id;
    gender_ = gender;
    dateOfBirth_ = date;
    email_ = email;
    PhoneNumber_ = Phone;
    Address_ = address;
    }
}
