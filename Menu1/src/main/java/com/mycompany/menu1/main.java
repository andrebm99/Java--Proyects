/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menu1;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre, ApellidoP, ApellidoM;
        System.out.println("Nombre");
        nombre = teclado.next();
        System.out.println("Apellido Paterno");
        ApellidoP = teclado.next();
        System.out.println("Apellido Materno");
        ApellidoM = teclado.next();
        Menu1 medico = new Menu1(nombre, ApellidoP, ApellidoM);
        medico.nombreCompleto();
        System.out.println(medico.mostrar());
    }
    
}
