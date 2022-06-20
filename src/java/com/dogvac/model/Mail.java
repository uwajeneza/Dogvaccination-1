/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dogvac.model;


import com.dogvac.controler.GeneralDao;
import com.dogvac.intities.Actor;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.activation.*;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;


/**
 *
 * @author mike
 */

@ManagedBean(name = "mail")
public class Mail {
    
    
     private Actor mail = new Actor();
     private GeneralDao<Actor> mailDao = new GeneralDao<>(Actor.class);
       
     private String names;
     private String phone;
     private String Email;
     private String Subject;

    public Mail() {
    }

     
     
    public Mail(String names, String phone, String Email, String Subject) {
        this.names = names;
        this.phone = phone;
        this.Email = Email;
        this.Subject = Subject;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    
     

    
    public String sendMail() {
       
        // Recipient's email ID needs to be mentioned.
        String to = "chellastellagigi@gmail.com";

        // Sender's email ID needs to be mentioned
        String from = getEmail();

        // Assuming you are sending email from through gmails smtp
        String host = "smtp.gmail.com";

        // Get system properties
        Properties properties = System.getProperties();

        // Setup mail server
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");

        // Get the Session object.// and pass username and password
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {

                return new PasswordAuthentication("chellastellagigi@gmail.com", "Chellastellagigi12!");

            }

        });

        // Used to debug SMTP issues
        session.setDebug(true);

        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Set Subject: header field
            message.setSubject("Hi from Dog Vet");
    
            // Now set the actual message
            
            
            message.setText(getNames()+" "+ getPhone()+" "+ getEmail()+" "+getSubject());

            FacesMessage msg =new  FacesMessage("Sent Successful");
            FacesContext.getCurrentInstance().addMessage(null, msg);
            // Send message
            Transport.send(message);
            
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
return "contacts";    }
    
}
