/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dogvac.model;

import com.dogvac.controler.GeneralDao;
import com.dogvac.intities.Actor;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.view.facelets.Facelet;
import javax.faces.view.facelets.FaceletContext;
//me
/**
 *
 * @author mike
 */
@SessionScoped
@ManagedBean(name = "Main")
public class MainClass {
private Actor mn  = new Actor();
private GeneralDao<Actor> mnDao = new GeneralDao<>(Actor.class);
private auth au = new auth();
    //===================
private Dog dog = new Dog();
private GeneralDao<Dog> dogDao = new GeneralDao<>(Dog.class);
private Vaccination vac = new Vaccination();
private GeneralDao<Vaccination> vacDao = new GeneralDao<>(Vaccination.class);
private Disease dis = new Disease();
private GeneralDao<Disease> disDao = new GeneralDao<>(Disease.class);
 //====================  

    public Actor getMn() {
        return mn;
    }

    

    public List<Actor> getMnDao() {
        return mnDao.listAll();
    }

    public void setMn(Actor mn) {
        this.mn = mn;
    }
    
    

    public auth getAu() {
        return au;
    }

    public void setAu(auth au) {
        this.au = au;
    }

    public String signupPage(){
    
    return "CreateAcc";
    }

   public String uSerCreate(){
       if(mn.getUserPassword().equals(mn.getUserConfrimPassword())){
          
         mnDao.create(mn);
          FacesMessage message =new  FacesMessage("Creation Successful");
          FacesContext.getCurrentInstance().addMessage(null, message);
          return "signup";
       }else{
            FacesMessage message =new  FacesMessage("Password not much");
            FacesContext.getCurrentInstance().addMessage(null, message);
            return "CreateAcc";
        }
       
    
   
   }
    //===========================================
    //getters by nicole

    public Dog getDog() {
        return dog;
    }

    public List<Dog> getDogDao() {
        return dogDao.listAll();
    }

    public Vaccination getVac() {
        return vac;
    }

    public List<Vaccination> getVacDao() {
        return vacDao.listAll();
    }

    public Disease getDis() {
        return dis;
    }

    public List<Disease> getDisDao() {
        return disDao.listAll();
    }
    //======Save;delete and update
     public String save(){
        try{
     disDao.create(dis);
     
     return "Dog";
        }
        
        catch (Exception e){
            return "Disease";
            
        }
     
     }
      public String create(){
        try{
     vacDao.create(vac);
     
     return "Vaccination";
        }
        
        catch (Exception e){
            return "Dog";
            
        }
     
     }
      public String Save(){
        try{
     dogDao.create(dog);
     
     return "Dog";
        }
        
        catch (Exception e){
            return "Home";
            
        }
     
     }
      
       public String update(){
        try{
     disDao.update(dis);
     
     return "Dog";
        }
        
        catch (Exception e){
            return "Disease";
            
        }
     
     }
      public String Update(){
        try{
     vacDao.update(vac);
     
     return "Vaccination";
        }
        
        catch (Exception e){
            return "Dog";
            
        }
     
     }
      public String UPdate(){
        try{
     dogDao.update(dog);
     
     return "Dog";
        }
        
        catch (Exception e){
            return "Home";
            
        }
     
     }
      public String delete (Dog dog){
          dogDao.delete(dog);
      return "Dog";
      }
       public String del (Vaccination vac){
          vacDao.delete(vac);
      return "Vaccination";
      }
        public String deet(Disease dis){
          disDao.delete(dis);
      return "Disease";
      }
   //=========================== 

    
   public String ULogin(){
        try {
           String enterusernameMail=au.getUserMail();
           
       Actor ab = mnDao.findBySTRING_PK(enterusernameMail);
       
        String actorUsername = ab.getUserEmail();
        
        if ( enterusernameMail.equals(actorUsername)) {
             return "Home"; 
        } else {
            return "Wrong passowrd or Username ";
        }
       } catch (Exception e) {
            FacesMessage message =new  FacesMessage("Create An account");
            FacesContext.getCurrentInstance().addMessage(null, message);
            return "CreateAcc";
       }
    }
    
    
    
   
}
    
    
    

