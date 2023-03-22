package com.bankxapp.main.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String name;
    private String EmailId;
    private long ContactNo;

    public Accounts getAccounts() {
        return accounts;
    }
    public void setAccounts(Accounts accounts) {
        this.accounts = accounts;
    }
    private Accounts accounts ;

    public long getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmailId() {
        return EmailId;
    }
    public void setEmailId(String emailId) {
        EmailId = emailId;
    }
    public long getContactNo() {
        return ContactNo;
    }
    public void setContactNo(long contactNo) {
        ContactNo = contactNo;
    }


}
