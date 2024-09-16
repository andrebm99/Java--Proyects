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
public class ConversionTiempo {
    public static void main(String [] args){
        
        /*
        Escribe un programa en Java que convierta una cantidad de segundos dada por el usuario a un formato más legible en horas, minutos y segundos. 
        Por ejemplo, si el usuario ingresa 3661 segundos, el programa debe convertirlo a 1 hora, 1 minuto y 1 segundo.
        Requisitos del Código:
            Leer una cantidad de segundos desde la entrada estándar (consola).
            Calcular el número de horas, minutos y segundos equivalentes.
            Imprimir el resultado en el formato "X horas, Y minutos, Z segundos".
        */
        
        // Crear objeto scanner 
        Scanner scanner = new Scanner(System.in);
        
        // Pedir Segundos
        System.out.println("Ingrese la cantidad de segundos: ");
        int SegundosTotales = scanner.nextInt();
        
        
        // Calcular horas, minutos y segundos
         int Horas = SegundosTotales/3600;
         int Minutos = (SegundosTotales % 3600) / 60;
         int segundos = SegundosTotales % 60;
         
         
         // Imprimir Resultado
         System.out.println("Segundos equivalentes a  " + SegundosTotales);
         System.out.println(" Horas: " + Horas + " Minutos: " + Minutos + " Segundos: " + segundos);
         
         scanner.close();
         
    }
}
