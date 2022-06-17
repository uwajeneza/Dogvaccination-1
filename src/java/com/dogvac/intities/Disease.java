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
public class Disease {
    @Id

private String diseaseName;
private String diseaseSymptoms;

    public Disease() {
    }

    public Disease(String diseaseName, String diseaseSymptoms) {
        this.diseaseName = diseaseName;
        this.diseaseSymptoms = diseaseSymptoms;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public String getDiseaseSymptoms() {
        return diseaseSymptoms;
    }

    public void setDiseaseSymptoms(String diseaseSymptoms) {
        this.diseaseSymptoms = diseaseSymptoms;
    }


    
    
}
