/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciaytipos.Ejemplos.Especificacion;

/**
 *
 * @author nenod
 */
class Rombo extends FiguraGeometrica {
float diagonalMenor;
float diagonalMayor;
    public Rombo (float diagonalMenor, float diagonalMayor){
        this.diagonalMenor=diagonalMenor;
        this.diagonalMayor=diagonalMayor;
    }
    @Override
    public float area(){
        return (diagonalMenor*diagonalMayor)/2;
    }    
}