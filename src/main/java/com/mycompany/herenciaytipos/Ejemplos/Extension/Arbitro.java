/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciaytipos.Ejemplos.Extension;

/**
 *
 * @author nenod
 */
public class Arbitro extends SeleccionFutbol {

	   private String tarjetas;

	   public void partidoFutbol() {
	      System.out.println("Supervisar partido");
	   }

	   public void sacarTarjeta() {
	      System.out.println("Saca tarjeta roja a futbolista");
	   }
}