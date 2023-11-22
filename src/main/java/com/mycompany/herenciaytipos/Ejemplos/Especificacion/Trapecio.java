/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciaytipos.Ejemplos.Especificacion;

/**
 *
 * @author nenod
 */
class Trapecio extends FiguraGeometrica {
float baseMenor;
float baseMayor;
float altura;
    public Trapecio (float baseMenor, float baseMayor, float altura){
        this.baseMenor=baseMenor;
        this.baseMayor=baseMayor;
    }
    @Override
    public float area(){
        return (baseMenor+baseMayor)*altura/2;
    }    
}