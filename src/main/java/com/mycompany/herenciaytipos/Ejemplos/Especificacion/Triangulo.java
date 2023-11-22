/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciaytipos.Ejemplos.Especificacion;

/**
 *
 * @author nenod
 */
class Triangulo extends FiguraGeometrica {
 float base;
    float altura;
    
    public Triangulo(int base, int altura){
        this.base=(float)base;
        this.altura=(float)altura;
    }
 @Override
    public float area(){
        area = (base*altura)/2;
    return area;
        
    }   
}
