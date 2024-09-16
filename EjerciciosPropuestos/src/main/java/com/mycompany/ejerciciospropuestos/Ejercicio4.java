/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciospropuestos;

import java.util.Scanner;

/**
 *
 * @author ronal
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        
        /*
        En una competencia de salto largo se registran las distancias en metros de
        todos los participantes, cada participante realiza 5 intentos. Realizar un
        programa que calcule el salto promedio de cada deportista. Mostrar el nombre
        del deportista que ganó la competencia al realizar el mejor salto promedio.
        El programa termina cuando se ingresa una distancia menor a 0.5 metros
        */
        
        Scanner scanner = new Scanner(System.in);
        String nombre;
        float distancia, sumaDistancias, saltoPromedio, mejorSaltoPromedio = 0;
        String nombreGanador = "";
        
        distancia = 0.0f; // Inicializamos distancia fuera del bucle

        do {
            System.out.print("Ingrese el nombre del deportista (o 'fin' para terminar): ");
            nombre = scanner.nextLine();

            if (nombre.equalsIgnoreCase("fin")) {
                break; // Terminar el programa si se ingresa "fin"
            }

            sumaDistancias = 0;
            mejorSaltoPromedio = 0;

            for (int i = 1; i <= 5; i++) {
                System.out.print("Ingrese la distancia del salto " + i + " (en metros): ");
                distancia = scanner.nextFloat();
                scanner.nextLine(); // Limpiar el búfer de entrada

                sumaDistancias += distancia;
            }

            saltoPromedio = sumaDistancias / 5;

            if (saltoPromedio > mejorSaltoPromedio) {
                mejorSaltoPromedio = saltoPromedio;
                nombreGanador = nombre;
            }

            System.out.printf("El salto promedio de %s es: %.2f metros%n", nombre, saltoPromedio);
        } while (distancia >= 0.5f);

        System.out.println("El ganador de la competencia es: " + nombreGanador);
    }

}