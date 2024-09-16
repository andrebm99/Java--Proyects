/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;

import java.util.Scanner;

/**
 *
 * @author ronal
 */
public class pregunta2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int deportistasMenor60 = 0;
        int deportistasEntre60y80 = 0;
        int deportistasMayor80 = 0;

        int menorPesoNacionales = -1;
        int mayorPesoNacionalizados = -1;

        int peso;
        String condicion;

        do {
            System.out.print("Ingrese la condición del deportista (nacional/nacionalizado): ");
            condicion = scanner.next();

            if (condicion.equalsIgnoreCase("nacional") || condicion.equalsIgnoreCase("nacionalizado")) {
                System.out.print("Ingrese el peso del deportista (en kg): ");
                peso = scanner.nextInt();

                if (peso < 0) {
                    break;
                }

                if (peso < 60) {
                    deportistasMenor60++;
                } else if (peso >= 60 && peso <= 80) {
                    deportistasEntre60y80++;
                } else {
                    deportistasMayor80++;
                }

                if (condicion.equalsIgnoreCase("nacional") && (menorPesoNacionales == -1 || peso < menorPesoNacionales)) {
                    menorPesoNacionales = peso;
                }

                if (condicion.equalsIgnoreCase("nacionalizado") && (mayorPesoNacionalizados == -1 || peso > mayorPesoNacionalizados)) {
                    mayorPesoNacionalizados = peso;
                }
            } else {
                System.out.println("La condición ingresada es inválida.");
            }
        } while (true);

        System.out.println("Resumen de deportistas:");
        System.out.println("Cantidad de deportistas con pesos menores a 60 kg: " + deportistasMenor60);
        System.out.println("Cantidad de deportistas con pesos entre 60 kg y 80 kg: " + deportistasEntre60y80);
        System.out.println("Cantidad de deportistas con pesos mayores a 80 kg: " + deportistasMayor80);
        System.out.println("Menor peso en deportistas nacionales: " + (menorPesoNacionales == -1 ? "No hay deportistas nacionales" : menorPesoNacionales + " kg"));
        System.out.println("Mayor peso en deportistas nacionalizados: " + (mayorPesoNacionalizados == -1 ? "No hay deportistas nacionalizados" : mayorPesoNacionalizados + " kg"));

        scanner.close();
    }
}