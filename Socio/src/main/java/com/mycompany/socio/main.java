/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.socio;

/**
 *
 * @author andre
 */

import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {
        int n,i;
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de socios"));
        for(i=1; i<=n; i++){
            Socio soc = new Socio();
            soc.setCodigo(JOptionPane.showInputDialog("Ingrese su codigo de socio"));
            soc.setApellNombre(JOptionPane.showInputDialog("Ingrese sus nombres y apellidos"));
            soc.setTipoSocio(JOptionPane.showInputDialog("Ingrese el tipo de socio que pertenece"));
            soc.setCuotaM(Double.parseDouble(JOptionPane.showInputDialog("Ingrese su cuota mensual")));
            soc.setMora(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la mora")));
            System.out.println("El importe a pagar es " + soc.ImPagar());
        }
    }
}
