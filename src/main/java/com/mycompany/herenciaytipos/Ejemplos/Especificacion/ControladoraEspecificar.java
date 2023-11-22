/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herenciaytipos.Ejemplos.Especificacion;

/**
 *
 * @author nenod
 */
public class ControladoraEspecificar {

    public static void main(String[] args) {
    Triangulo tri = new Triangulo(9,6 );
    Cuadrado cua = new Cuadrado(5);
    Rectangulo rec = new Rectangulo(5,4);
    Trapecio trap = new Trapecio(5,6,6);
    Circulo cir = new Circulo(5);
    Ovalo oval = new Ovalo(5,4);
    Pentagono pent = new Pentagono(35,10);
    Hexagono hex = new Hexagono(30,10);
    Paralelogramo par = new Paralelogramo(10,5);
    Rombo rom = new Rombo(10,20);
    
    tri.area();
        System.out.println(tri.area());
    cua.area();
        System.out.println(cua.area());
    rec.area();
        System.out.println(rec.area());
    trap.area();
        System.out.println(trap.area());
    cir.area();
        System.out.println(cir.area());
    oval.area();
        System.out.println(oval.area());
    pent.area();
        System.out.println(pent.area());
    hex.area();
        System.out.println(hex.area());
    par.area();
        System.out.println(par.area());
    rom.area();
        System.out.println(rom.area());
    }
}
