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
public class Vaccination {
    @Id
    private String vaccId;
    private String vaccNames;

    public Vaccination() {
    }

    public Vaccination(String vaccId, String vaccNames) {
        this.vaccId = vaccId;
        this.vaccNames = vaccNames;
    }

    public String getVaccId() {
        return vaccId;
    }

    public void setVaccId(String vaccId) {
        this.vaccId = vaccId;
    }

    public String getVaccNames() {
        return vaccNames;
    }

    public void setVaccNames(String vaccNames) {
        this.vaccNames = vaccNames;
    }
    
    
    
    
    
    
    
}
