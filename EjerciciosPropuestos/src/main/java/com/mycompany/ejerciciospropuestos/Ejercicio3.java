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
public class Ejercicio3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menores55 = 0;
        int entre55y70 = 0;
        int mayores70 = 0;
        double mayorPesoNacional = 0;
        double menorPesoExtranjero = Double.MAX_VALUE;
        double peso;

        do {
            System.out.print("Ingrese la condición del deportista (nacional/extranjero): ");
            String condicion = scanner.nextLine();

            if (condicion.equalsIgnoreCase("nacional") || condicion.equalsIgnoreCase("extranjero")) {
                System.out.print("Ingrese el peso del deportista: ");
                peso = scanner.nextDouble();
                scanner.nextLine(); // Limpiar el buffer de entrada

                if (peso < 0) {
                    break; // Salir del bucle si se ingresa un peso negativo
                }

                if (peso < 55) {
                    menores55++;
                } else if (peso >= 55 && peso <= 70) {
                    entre55y70++;
                } else {
                    mayores70++;
                }

                if (condicion.equalsIgnoreCase("nacional")) {
                    if (peso > mayorPesoNacional) {
                        mayorPesoNacional = peso;
                    }
                } else {
                    if (peso < menorPesoExtranjero) {
                        menorPesoExtranjero = peso;
                    }
                }
            }

        } while (true);

        System.out.println("Cantidad de deportistas con peso menor a 55 kg: " + menores55);
        System.out.println("Cantidad de deportistas con peso entre 55 kg y 70 kg: " + entre55y70);
        System.out.println("Cantidad de deportistas con peso mayor a 70 kg: " + mayores70);
        System.out.println("Mayor peso en deportistas nacionales: " + mayorPesoNacional);
        System.out.println("Menor peso en deportistas extranjeros: " + menorPesoExtranjero);
    }
}
