/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciaytipos.Ejemplos.Extension;

/**
 *
 * @author nenod
 */
public class Masajista extends SeleccionFutbol {

	   private String titulacion;
	   private int experiencia;
		
	   public void entrenamiento() {
	      System.out.println("Da asistencia en el entrenamiento (Clase Masajista)");
	   }

	   public void darMasaje() {
	      System.out.println("Da un Masaje");
	   }
}