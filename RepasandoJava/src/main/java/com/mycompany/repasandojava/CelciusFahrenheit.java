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
public class CelciusFahrenheit {
    public static void main(String [] args){
        
        /*
        Escribe un programa en Java que convierta una temperatura de grados Celsius a grados Fahrenheit. 
        La fórmula para convertir de Celsius a Fahrenheit es:
        Fahrenheit = Celcius * 9/5 + 32
        Requisitos del Código:
            Leer la temperatura en grados Celsius desde la entrada estándar (consola).
            Calcular la temperatura en grados Fahrenheit utilizando la fórmula proporcionada.
            Imprimir el resultado del cálculo.
        */
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Ingrese la temperatura en grados Celcius: ");
        double celcius = scanner.nextDouble();
        
        double Fahrenheit = celcius * 9/5 + 32;
        
        System.out.println("La conversion a grados Fahrenheit de " + celcius + "grados celcius es: " + Fahrenheit);
        
        scanner.close() ; 
        
    }
}
