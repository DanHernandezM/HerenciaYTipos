/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciaytipos.Ejemplos.Especificacion;

/**
 *
 * @author nenod
 */
class Pentagono extends FiguraGeometrica {
float perimetro;
    float apotema;
    
    public Pentagono(float perimetro, float apotema){
        this.perimetro=perimetro;
        this.apotema=apotema;
    }
    
    @Override
    public float area(){
        return (perimetro * apotema)/2;
    }
    
}
