/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dogvac.model;

/**
 *
 * @author mike
 */
public class auth {
    
     private String userMail;
     private String password;

    public auth() {
    }

    public auth(String userMail, String password) {
        this.userMail = userMail;
        this.password = password;
    }

     
     
    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   
     
    
}
