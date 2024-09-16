/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresa;

/**
 *
 * @author andre
 */

public class Cliente extends Empresa{
    
    private int cantidadProductosComprados;
    private double totalComprado; 
    
    public Cliente(String ruc, String RazonSocial, String RazonComercial, String Estado, int cantidadProductosComprados, double totalComprado) {
        super(ruc, RazonSocial, RazonComercial, Estado);
        this.cantidadProductosComprados = cantidadProductosComprados;
        this.totalComprado = totalComprado;
    }
    
    public void mostrar(){
        System.out.println("RUC: " + getRuc());
        System.out.println("Razon Social: " + getRazonSocial());
        System.out.println("RazonComercial: " + getRuc());
        System.out.println("Estado: " + getEstado());
        System.out.println("Cantidad de Productos Comprados: " + cantidadProductosComprados);
        System.out.println("Total Comprado: " + totalComprado);
        
    }

    public boolean validadRuc() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}