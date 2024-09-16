/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guerrero;

/**
 *
 * @author andre
 */
public class Namekiano extends Guerrero{
    private int cantidadFusiones;

    public Namekiano() {
        super(); 
        this.cantidadFusiones = 0;
    }

    public void fusionar() {
        this.cantidadFusiones++;
        this.entrenar(0, 8000); 
    }

    @Override
    public String mostrarDatos() {
        String datos = super.mostrarDatos(); 
        datos += "\nCantidad de fusiones: " + cantidadFusiones;
        return datos;
    }
    
}
