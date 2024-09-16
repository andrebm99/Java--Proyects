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
public class pregunta1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int alumnosIngresantes = 0;
        int alumnosTrasladoInterno = 0;
        int alumnosTrasladoExterno = 0;

        int totalAprobados = 0;
        int totalDesaprobados = 0;
        int cantidadAprobados = 0;
        int cantidadDesaprobados = 0;

        int condicion;
        int nota;

        System.out.println("Ingrese las calificaciones y condición de los alumnos:");
        System.out.println("1: Ingresante");
        System.out.println("2: Traslado Interno");
        System.out.println("3: Traslado Externo");

        while (true) {
            System.out.print("Condición del alumno (1-3, -1 para terminar): ");
            condicion = scanner.nextInt();

            if (condicion == -1) {
                break;
            }

            System.out.print("Nota del alumno (0-20): ");
            nota = scanner.nextInt();

            if (nota >= 0 && nota <= 20) {
                switch (condicion) {
                    case 1:
                        alumnosIngresantes++;
                        break;
                    case 2:
                        alumnosTrasladoInterno++;
                        break;
                    case 3:
                        alumnosTrasladoExterno++;
                        break;
                }

                if (nota >= 12) {
                    totalAprobados += nota;
                    cantidadAprobados++;
                } else {
                    totalDesaprobados += nota;
                    cantidadDesaprobados++;
                }
            } else {
                System.out.println("Nota inválida. Intente nuevamente.");
            }
        }

        System.out.println("Resumen:");
        System.out.println("Cantidad de alumnos ingresantes: " + alumnosIngresantes);
        System.out.println("Cantidad de alumnos traslado interno: " + alumnosTrasladoInterno);
        System.out.println("Cantidad de alumnos traslado externo: " + alumnosTrasladoExterno);

        if (cantidadAprobados > 0) {
            double promedioAprobados = (double) totalAprobados / cantidadAprobados;
            System.out.println("Promedio de notas de los alumnos aprobados: " + promedioAprobados);
        } else {
            System.out.println("No se ingresaron alumnos aprobados.");
        }

        if (cantidadDesaprobados > 0) {
            double promedioDesaprobados = (double) totalDesaprobados / cantidadDesaprobados;
            System.out.println("Promedio de notas de los alumnos desaprobados: " + promedioDesaprobados);
        } else {
            System.out.println("No se ingresaron alumnos desaprobados.");
        }

        scanner.close();
    }
}
