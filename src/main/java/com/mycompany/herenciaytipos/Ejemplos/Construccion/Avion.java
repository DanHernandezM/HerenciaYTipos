/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciaytipos.Ejemplos.Construccion;

/**
 *
 * @author nenod
 */
public class Avion {
    int alas;
    int ruedas;
    int altura;
    boolean cola;
    
    public void Volar(){
	        System.out.println("Esta volando");
	    }
    public void Descender(){
        System.out.println("Esta decendiendo");
    }
    
    public void setAlas(int alas){
         this.alas=alas;
    }
    
    public int getAlas(){
        return alas;
    }
    
    public int getRuedas(){
        return ruedas;
    }
    
    public int getAltura(){
        return altura;
    }
    
    public boolean getCola(){
        return cola;
    }   
}    
