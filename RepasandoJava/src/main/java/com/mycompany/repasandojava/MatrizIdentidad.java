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
public class MatrizIdentidad {
    public static void main (String [] args){
        /*
        Escribe un programa en Java que verifique si una matriz cuadrada dada es una matriz de identidad. 
        Una matriz de identidad es una matriz cuadrada en la que todos los elementos de la diagonal principal son 1 
        y todos los demás elementos son 0.
        Requisitos del Código:
        Leer el tamaño n de la matriz (número de filas y columnas) desde la entrada estándar (consola).
        Leer los elementos de la matriz desde la entrada estándar.
        Verificar si la matriz es una matriz de identidad.
        Imprimir "Es una matriz de identidad" si cumple las condiciones, de lo contrario, imprimir "No es una matriz de identidad".
        */
        
        Scanner scanner = new Scanner(System.in);
        
        // Leer el tamaño de la matriz
        System.out.println("Ingrese el tamaño de la matriz cuadrada: ");
        int n = scanner.nextInt();
        
        // Crear la Matriz
        
         int[][] matriz = new int[n][n];
         
         // Leer los elementos de la matriz
         
         System.out.println("Ingrese los elementos de la matriz: ");
         
         for (int i = 0; i < n; i++){
             for(int j = 0 ; j < n; j++) {
                 matriz[i][j] = scanner.nextInt();
             }
         }
         
            boolean esIdentidad = true; // Declaracion y asignación inicial
            
            for(int i = 0; i < n ; i++) {
                for(int j = 0; j < n ; j++) { 
                    if( i == j){ // Elemento en la diagonal principal
                        if(matriz[1][j] != 1){
                            esIdentidad = false;
                            break;
                        }
                    } else { // Elemento fuera de la diagonal principal
                         if (matriz[i][j] != 0) {
                            esIdentidad = false;
                            break;
                         }
                    }
                }
                if(!esIdentidad){
                    break;
                }
            }
            // Imprimir el resultado
            if (esIdentidad) {
                System.out.println("Es una matriz de identidad");
            } else {
                System.out.println("No es una matriz de identidad");
            }

            scanner.close();
            
    }
}
