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

/**
 *
 * @author mike
 */
@ManagedBean(name = "admin")
public class Admin {
    
    
     Actors admin = new Actors();
    GeneralDao<Actors> adminDao = new GeneralDao<>(Actors.class);

    public Actors getActorstest() {
        return admin;
    }

    public List<Actors> getActorstestDao() {
        return adminDao.listAll();
    }
    
    
    public String saveSU(){
     
        adminDao.create(admin);
        
        
    
    return "RegDog";
    }
    
    
}
