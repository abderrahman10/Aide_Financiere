package com.pfe.InscriptionAideFinanciere.core;

public class UserInscription {

    String firstName;
    String  lastName;
    String  email;
    Long phone;
    String  token;

    String  civility;
    String status;
    String dcrName;
    String dcrDepartement;

    public UserInscription(String firstName, String lastName, String email, Long phone, String token, String civility, String status, String dcrName, String dcrDepartement) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.token = token;
        this.civility = civility;
        this.status = status;
        this.dcrName = dcrName;
        this.dcrDepartement = dcrDepartement;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getCivility() {
        return civility;
    }

    public void setCivility(String civility) {
        this.civility = civility;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDcrName() {
        return dcrName;
    }

    public void setDcrName(String dcrName) {
        this.dcrName = dcrName;
    }

    public String getDcrDepartement() {
        return dcrDepartement;
    }

    public void setDcrDepartement(String dcrDepartement) {
        this.dcrDepartement = dcrDepartement;
    }
}
