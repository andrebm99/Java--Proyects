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
public class Hipotenusa {
    public static void main(String [] args){
        
        /*
        Escribe un programa en Java que calcule la hipotenusa de un triángulo rectángulo dados los dos catetos. 
        Utiliza el teorema de Pitágoras:
        hipotenusa = raiz cuadrada de cateto1 ^ 2 + cateto2 ^2
        Pasos:
        Leer los dos catetos del triángulo desde la entrada estándar (consola).
        Calcular el cuadrado de cada cateto.
        Sumar los cuadrados de los catetos.
        Calcular la raíz cuadrada de la suma utilizando Math.sqrt().
        Imprimir el resultado del cálculo.
        */
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el primer cateto :");
        double cateto1 = scanner.nextDouble();
        
        System.out.println("Ingrese el segundo cateto: ");
        double cateto2 = scanner.nextDouble();
        
        // Calcular el cuadrado de cada cateto
        double cateto1Cuadrado =Math.pow(cateto1,2);
        double cateto2Cuadrado =Math.pow(cateto2,2);
        
        // Sumar los cuadrados de los catetos
        
        double sumaCuadrados = cateto1Cuadrado + cateto2Cuadrado;
        
        // Calcular la raiz de la suma de los cuadrados
        
        double Hipotenusa = Math.sqrt(sumaCuadrados);
        
        // Imprimir el resultado
        
        System.out.println("La hipotenusa del triangulo con los catetos " + cateto1 + " y " + cateto2 + " es: " + Hipotenusa );
        scanner.close();
    }
}
