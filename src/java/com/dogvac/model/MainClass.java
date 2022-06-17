/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dogvac.model;

import com.dogvac.controler.GeneralDao;
import com.dogvac.intities.Actors;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author mike
 */
@SessionScoped
@ManagedBean(name = "Main")
public class MainClass {
private Actors mn  = new Actors();
private GeneralDao<Actors> mnDao = new GeneralDao<>(Actors.class);
private auth au = new auth();

    public Actors getMn() {
        return mn;
    }

    public List<Actors> getMnDao() {
        return mnDao.listAll();
    }

    public void setMn(Actors mn) {
        this.mn = mn;
    }
    
    

    public auth getAu() {
        return au;
    }

    public void setAu(auth au) {
        this.au = au;
    }

    

   
    

    
    public String login(){
        String enterusername=au.getUsername();
        System.out.println(enterusername);
        String enterpassword=au.getPassword();
        System.out.println(enterpassword);
        
        Actors ab = mnDao.findByINT_PK(enterusername);
        String actorPassword =ab.getUserPassword();
        String actorUsername = ab.getUserfirstNames();
        System.out.println(actorUsername+" - "+actorPassword);
       
        if ( enterpassword.equals(actorPassword )) {
             return "main"; 
        } else {
            return "Wrong passowrd or Username ";
        }
    }
    
    
    
    
    
    
}
