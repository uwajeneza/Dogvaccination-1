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
 * SU mean Standard User
 */
@ManagedBean(name = "StandUsers")

public class StandUsers {
    
    Actors su = new Actors();
    GeneralDao<Actors> suDao = new GeneralDao<>(Actors.class);

    public Actors getActorstest() {
        return su;
    }

    public List<Actors> getActorstestDao() {
        return suDao.listAll();
    }
    
    
    public String saveSU(){
     
        suDao.create(su);
        
        
    
    return "Home";
    }
    
          
    
    
}
