/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciaytipos.Ejemplos.Especificacion;

/**
 *
 * @author nenod
 */
class Rectangulo extends FiguraGeometrica {
 float base;
 float altura;
    
    public Rectangulo (float base,float altura){
        this.base=base;
        this.altura=altura;
    }
    @Override
    public float area(){
        return base*altura;
    }   
}
