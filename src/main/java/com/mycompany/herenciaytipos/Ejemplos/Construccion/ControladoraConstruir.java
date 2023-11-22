/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciaytipos.Ejemplos.Construccion;

/**
 *
 * @author nenod
 */
public class ControladoraConstruir {
    public static void main(String []args) {
  Avion avion= new Avion();
		avion.Volar();
		avion.Descender();

		Dron dron =new Dron();
		dron.Volar();
		dron.Descender();

		Planeadores planeadores = new Planeadores();
		planeadores.Volar();
		planeadores.Correr();
		planeadores.Descender();

		Cohete cohete = new Cohete();
		cohete.Despegar();
		cohete.Volar();

		Papalote papalote= new Papalote();
		papalote.Alzar();
		papalote.Volar();
		papalote.Descender();

		UAV uav = new UAV();
		uav.Volar();
		uav.CapturarImagenes();
		uav.Descender();

		Helicoptero helicoptero = new Helicoptero();
		helicoptero.Volar();
		helicoptero.Descender();
		helicoptero.Rotar360grados();

		Dirigible dirigible = new Dirigible();
		dirigible.Volar();
		dirigible.Navegar();
		dirigible.Descender();

		Superman superman = new Superman();
		superman.Volar();
		superman.Descender();
		superman.Correr();

		Pajaro pajaro = new Pajaro();
		pajaro.Volar();
		pajaro.Descender();
		pajaro.Cazar();

		AvionDePapel avionPaper = new AvionDePapel();
		avionPaper.Volar();
		avionPaper.Descender();
		avionPaper.Caer();

		}
}
