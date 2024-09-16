/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repasandojava;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class PrimerProblema01 {
    public static void main (String [] args) {
        /*
        Ejercicio para Desarrollar
            Ahora, intenta desarrollar un programa en Java que calcule el volumen de una esfera dado su radio. 
            Utiliza la fórmula del volumen de una esfera: Volumen = 4/3 * π * r^3
            Requisitos del Código:
            Declarar una constante para π.
            Leer el radio de la esfera desde la entrada estándar (consola).
            Calcular el volumen de la esfera utilizando la fórmula proporcionada.
            Imprimir el resultado del cálculo.
        */
        final double PI = 3.14159;
        
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese el radio de la esfera: ");
        double radio = scanner.nextDouble();
        
        double volumen = (4.0/3.0) * PI * Math.pow(radio,3);
        
        System.out.println("El volumen de la esfera esfera con radio " + radio + " es: " + volumen);
        
        scanner.close();
    }
}
