
import com.dogvac.controler.GeneralDao;
import com.dogvac.intities.Actors;
import com.dogvac.model.auth;
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

public class test {
  
private Actors mn  = new Actors();
private GeneralDao<Actors> mnDao = new GeneralDao<>(Actors.class);
private auth au = new auth();



    public String ULogin(){
         
      
        
       Actors actorUsername = mnDao.findBySTRING_PK(mn.getUserEmail());
        Actors actorpass = mnDao.findBySTRING_PK(mn.getUserPassword());
        
        System.out.println(actorUsername+" - "+actorpass);
      
        return "fatching done";
    }
    
    
     public static void main(String[] args) {
         test test =new test();
         
         System.out.println(test.ULogin());
     }
    
}

