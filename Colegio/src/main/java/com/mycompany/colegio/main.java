/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colegio;

/**
 *
 * @author andre
 */

import javax.swing.JOptionPane;

public class main {
    public static void main (String [] args){
        int n,i;
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de alumnos"));
                
        for(i = 1; i <= n ; i++){
            Alumno alum = new Alumno();
           alum.setCod(JOptionPane.showInputDialog("Ingrese codigo del alumno"));
           alum.setApellNombre(JOptionPane.showInputDialog("Ingrese los apellidos y nombres"));
           alum.setañoEstudio(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de estudios")));
           alum.setexParcial(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el examen parcial")));
           alum.setexFinal(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el examen final")));
           alum.setpromPractica(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el promedio de practicas")));
            System.out.println(alum);
        }
    }
}
