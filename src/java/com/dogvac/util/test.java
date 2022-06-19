/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dogvac.util;

import com.dogvac.controler.GeneralDao;
import com.dogvac.intities.Actor;
import com.dogvac.model.auth;



/**
 *
 * @author mike
 */
public class test {
    
    public static void main(String[] args) {
        
         Actor mn  = new Actor();
        GeneralDao<Actor> mnDao = new GeneralDao<>(Actor.class);
        
        mn.setUserEmail("Kalphamike@gmail.com");
        mn.setUserfirstNames("Kalinganire ");
        mn.setUserSecondNames("Alpha");
        mn.setUserAdress("Gasabo");
        mn.setUserType("vet");
        mn.setUserPassword("123");
        mn.setUserConfrimPassword("123");
         mnDao.create(mn);
        
        
        
        
    }
    
}
