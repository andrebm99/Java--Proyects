/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cole;

/**
 *
 * @author andre
 */

import javax.swing.JOptionPane;

public class main{
    public static void main(String[] args){
        int n,i; 
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de alumnos"));
        for ( i = 1; i <= n; i++){
            Cole cole = new Cole();
            cole.setCod(JOptionPane.showInputDialog("Ingrese codigo del alumno"));
            cole.setApellNombres(JOptionPane.showInputDialog("Ingrese los apellidos y nombres del estudiante"));
            cole.setAñoEstudio(JOptionPane.showInputDialog("Ingrese su año de estudios")); 
            cole.setExParcial(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del examen parcial")));
            cole.setExFinal(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota de su examen final")));
            System.out.println("El promedio final es: " + cole.Promedio());
        }        
    }
}
