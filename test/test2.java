
import com.dogvac.controler.GeneralDao;
import com.dogvac.intities.Actor;
import com.dogvac.intities.Dog;
import com.dogvac.intities.Vaccination;
import com.dogvac.model.auth;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mike
 */
 @SessionScoped
@ManagedBean(name = "Main")

public class test2 {
  
     
    public static void main(String[] args) {
        
         Actor mn  = new Actor();
        GeneralDao<Actor> mnDao = new GeneralDao<>(Actor.class);
        
        mn.setUserAdress("Kalphamie@gmail.com");
        mn.setUserfirstNames("Kalinganire ");
        mn.setUserSecondNames("Alpha");
        mn.setUserAdress("Gasabo");
        mn.setUserType("vet");
        mn.setUserPassword("123");
        mn.setUserConfrimPassword("123");
         mnDao.create(mn);
         
        
        
        
        
         
    }
    

}

