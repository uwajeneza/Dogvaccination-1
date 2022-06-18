/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dogvac.intities;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author mike
 */
@Entity
public class Actors {
    @Id
    private String userEmail;
    private String userfirstNames;
    private String userSecondNames;
    private String userAdress;
    private String userPassword;
    private String userType;
    
    public Actors() {
    }

    public Actors(String userEmail, String userfirstNames, String userSecondNames, String userAdress, String userPassword, String userType) {
        this.userEmail = userEmail;
        this.userfirstNames = userfirstNames;
        this.userSecondNames = userSecondNames;
        this.userAdress = userAdress;
        this.userPassword = userPassword;
        this.userType = userType;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserfirstNames() {
        return userfirstNames;
    }

    public void setUserfirstNames(String userfirstNames) {
        this.userfirstNames = userfirstNames;
    }

    public String getUserSecondNames() {
        return userSecondNames;
    }

    public void setUserSecondNames(String userSecondNames) {
        this.userSecondNames = userSecondNames;
    }

    public String getUserAdress() {
        return userAdress;
    }

    public void setUserAdress(String userAdress) {
        this.userAdress = userAdress;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
    
    
    
    
    
    
}
