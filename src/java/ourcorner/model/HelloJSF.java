/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ourcorner.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Fadhel
 */
@ManagedBean
@RequestScoped
public class HelloJSF {
    private String uNAme = "";

   
    public HelloJSF() {
        System.out.println("membuat instanceHelloJSF");
    }

    public String getuNAme() {
        return uNAme.trim();
    }

    public void setuNAme(String uNAme) {
        this.uNAme = uNAme.trim();
    }
    public String sayHi(){
        return "menyapa";
        
    }
    
    
}