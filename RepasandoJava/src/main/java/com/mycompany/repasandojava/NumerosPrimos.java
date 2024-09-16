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
public class NumerosPrimos {
    public static void main(String [] args){
        /*
        Descripción:
        Escribe un programa en Java que determine si un número dado por el usuario es un número primo o no. Un número primo es un número mayor que 1 que no tiene divisores positivos más que 1 y él mismo.
        Requisitos del Código:
        Leer un número entero desde la entrada estándar (consola).
        Verificar si el número es primo.
        Imprimir un mensaje indicando si el número es primo o no.
        */
        Scanner scanner = new Scanner (System.in);
        
        // Leer el número del usuario
        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();
        
        // Verificar si el número es primo
        
        boolean esPrimo = true;
        
        if (numero <= 1){
            esPrimo = false;
        }else{
            for(int i = 2; i <= Math.sqrt(numero); i++){
                if(numero % i == 0){
                    esPrimo = false;
                    break;
                }
            }
        }
        
        // Imprimir el resultado
        
        if(esPrimo){
            System.out.println("El numero " + numero + " es Primo." );
        }else{
            System.out.println("El numero " + numero + " no es Primo");
        }
        scanner.close();
        
    }
}
