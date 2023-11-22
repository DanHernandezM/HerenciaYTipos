/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciaytipos.Ejemplos.Especificacion;

/**
 *
 * @author nenod
 */
class Ovalo extends FiguraGeometrica {
 float radio1;
 float radio2;
 float pi=3.1416f;
  public Ovalo (float radio1,float radio2){
        this.radio1=radio1;
        this.radio2=radio2;
    }
    @Override
    public float area(){
        return pi*radio1*radio2;
    }    
}