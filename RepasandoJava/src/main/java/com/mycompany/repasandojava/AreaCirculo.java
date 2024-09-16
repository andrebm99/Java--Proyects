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
public class AreaCirculo {
    public static void main(String [] args){
        /*
        Problema:
        Escribe un programa en Java que calcule el área de un círculo dado su radio. Utiliza la fórmula del área de un círculo: 
        área=𝜋×𝑟2, donde " r " es el radio del círculo.

        Requisitos del Código:
        Declarar una constante para π.
        Leer el radio del círculo desde la entrada estándar (consola).
        Calcular el área del círculo utilizando la fórmula proporcionada.
        Imprimir el resultado del cálculo.
        */
        // Declarar la constante para PI
        final double PI = 3.14159;
        
        // Crear el objeto Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario ingresar el radio del circulo
        
        System.out.println("Ingrese el radio del circulo: ");
        double radio = scanner.nextDouble();
        
        // Calcular el área del circulo
        
        double area = PI * radio * radio;
        
        // Imprimir el resultado
        
        System.out.println("El area del circulo con radio " + radio + " es " + area);
        
        // Cerrar el objeto scanner
        scanner.close();
    }
    
}
