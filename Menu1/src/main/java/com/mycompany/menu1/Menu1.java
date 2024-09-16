/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.menu1;

import java.util.Scanner;

/**
 *Implementar un programa que maneje un arreglo de 6 enteros
 * y tenga un menú de 3 opciones
 * Cargar
 * mostrar
 * salir
*/

public class Menu1 {
    private String nombre;
    private String ApellidoP;
    private String ApellidoM;
    private String nombreC;

    public Menu1(String nombre, String ApellidoP, String ApellidoM) {
        this.nombre = nombre;
        this.ApellidoP = ApellidoP;
        this.ApellidoM = ApellidoM;
    }
    
    public void nombreCompleto(){
        nombreC = ApellidoP+ " " +ApellidoM+ ", " +nombre;
    }
    public String mostrar(){
        return nombreC;
    }
    
}
