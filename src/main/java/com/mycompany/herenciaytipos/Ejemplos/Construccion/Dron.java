/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciaytipos.Ejemplos.Construccion;

import com.mycompany.herenciaytipos.Ejemplos.Construccion.Avion;

/**
 *
 * @author nenod
 */
public class Dron extends Avion{
    
    private boolean camara=true;
    private int numeroDeAspas;
    
    public void Grabar() { 	
    }
    
    public void TakePhoto() {
    	
    }
    
    public boolean getCamara() {
    	return camara;
    }
    public int getNumeroDeAspas() {
    	return numeroDeAspas;
    }
    
}