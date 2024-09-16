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
public class SumaNumerosPares {
    public static void main(String [] args){
        
        /*
        
        Escribe un programa en Java que solicite al usuario ingresar un número entero positivo "n".
        El programa deberá calcular la suma de todos los números pares desde 1 hasta "n" (incluyendo "n" si es par) 
        y mostrar el resultado.
        
        Requisitos del Código:
        Leer un número entero positivo n esde la entrada estándar (consola).
        Calcular la suma de todos los números pares desde 1 hasta "n".
        Imprimir el resultado de la suma.
        
        */
        
        Scanner scanner = new Scanner (System.in);
        
        // Leer el numero entero positivo "n" desde el usuario
        System.out.print("Ingrese un numero entero positivo: ");
        int n = scanner.nextInt();
        
        // Calcular la suma de los numeros pares
        int sumaPares = 0;
        
        // Iterar desde 1 hasta n y sumar los números pares
        for (int i = 2; i <= n; i+=2 ){
            sumaPares += i;
        }
        
        // Imprimir el resultado
        
        System.out.println("La suma de los números pares hasta " + n + " es: " + sumaPares);
        
        scanner.close();
    }
}
