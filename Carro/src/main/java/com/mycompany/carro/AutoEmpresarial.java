/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carro;

/**
 *
 * @author andre
 */

import javax.swing.JOptionPane;

public class AutoEmpresarial extends carro{
    
    private double costo;
 private int cantidad;

    public AutoEmpresarial() {
        costo =0;
        cantidad =0;
    }

    public void GenerarMantenimiento(){
        realizarMantenimiento();
        costo +=500;
        cantidad++;
    }
    public void info(){
        String mensaje = mostrarDatos();
        if (cantidad>0) {
        mensaje +="\nCantidad:"+cantidad;
        mensaje +="\nCosto:"+costo;
        }        
        imprimir(mensaje, "información", JOptionPane.INFORMATION_MESSAGE);
    }
}
