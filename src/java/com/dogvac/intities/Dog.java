/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dogvac.intities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author mike
 */
@Entity
public class Dog {
    @Id
   private String dogId;
   private String dogNames;
   private String dogDob;
   private Date regdog;

    public Dog() {
        setRegdog(new  Date());
    }

    public Dog(String dogId, String dogNames, String dogDob, Date regdog) {
        this.dogId = dogId;
        this.dogNames = dogNames;
        this.dogDob = dogDob;
        this.regdog = regdog;
    }

    public String getDogId() {
        return dogId;
    }

    public void setDogId(String dogId) {
        this.dogId = dogId;
    }

    public String getDogNames() {
        return dogNames;
    }

    public void setDogNames(String dogNames) {
        this.dogNames = dogNames;
    }

    public String getDogDob() {
        return dogDob;
    }

    public void setDogDob(String dogDob) {
        this.dogDob = dogDob;
    }

    public Date getRegdog() {
        return regdog;
    }

    public void setRegdog(Date regdog) {
        this.regdog = regdog;
    }

   
    
}
