/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciaytipos.Ejemplos.Especializacion;

/**
 *
 * @author nenod
 */
public class ControladoraEspecializar {
public static void main (String args[]){
    
    Medico med = new Medico();
    Cirujano cir = new Cirujano();
    Cardiologo car = new Cardiologo();
    Neurologo neu = new Neurologo();
    Dermatologo der = new Dermatologo();
    Oftalmologo oft = new Oftalmologo();
    Urologo ur = new Urologo();
    Ginecologo gin = new Ginecologo();
    Nutriologo nut = new Nutriologo();
   Pediatra ped = new Pediatra();
   Psiquiatra psi = new Psiquiatra();
   
   med.consultaMedica();
   cir.operacion();
   car.consultaCardiologica();
   neu.examenNeurologico();
   der.consultaDermatologica();
   oft.examenDeVista();
   ur.examenDeProstata();
   gin.examenGinecologico();
   nut.planDeDieta();
   ped.atenderNiños();
   psi.consultaPsiquiatrica();
}
}
}
