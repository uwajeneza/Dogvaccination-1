/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dogvac.model;

import com.dogvac.controler.GeneralDao;
import com.dogvac.intities.Actors;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author mike
 */
@SessionScoped
@ManagedBean(name = "Main")
public class MainClass {
    Actors mn  = new Actors();
    GeneralDao<Actors> mnDao = new GeneralDao<>(Actors.class);
    
    private String username;
    private String password;
    

    public Actors getMn() {
        return mn;
    }

    public GeneralDao<Actors> getMnDao() {
        return mnDao;
    }

    public String login(){
       
        if (username.equals("mike") && password.equals("123")) {
             return "saved"; 
        } else {
            return " Wrong passowrd or Username ";
        }
    }
    
    
    
    
    
    
}
