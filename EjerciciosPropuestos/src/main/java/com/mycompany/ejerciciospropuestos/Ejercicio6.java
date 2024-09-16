/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciospropuestos;

/**
 *
 * @author ronal
 */

import java.util.Scanner;

public class Ejercicio6 {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Ingrese el número de estudiantes: ");
        int numEstudiantes = scanner.nextInt();
        
        String mejorAlumnoPHP = "";
        int mejorNotaPHP = 0;
        String mejorAlumnoAndroid = "";
        int mejorNotaAndroid = 0;
        
        
        for (int i = 1; i <= numEstudiantes; i++) {
            // Pedir el nombre del estudiante
            System.out.print("Ingrese el nombre del estudiante " + i + ": ");
            String nombre = scanner.next();

            // Validar el curso electivo elegido
            String cursoElectivo;
            do {
                System.out.print("Ingrese el curso electivo (PHP o Android) del estudiante " + i + ": ");
                cursoElectivo = scanner.next();
            } while (!cursoElectivo.equalsIgnoreCase("PHP") && !cursoElectivo.equalsIgnoreCase("Android"));

            // Pedir la nota del estudiante
            int nota;
            do {
                System.out.print("Ingrese la nota del estudiante " + i + ": ");
                nota = scanner.nextInt();
            } while (nota < 0 || nota > 20);

            // Actualizar los mejores alumnos y sus notas
            if (cursoElectivo.equalsIgnoreCase("PHP") && nota > mejorNotaPHP) {
                mejorAlumnoPHP = nombre;
                mejorNotaPHP = nota;
            } else if (cursoElectivo.equalsIgnoreCase("Android") && nota > mejorNotaAndroid) {
                mejorAlumnoAndroid = nombre;
                mejorNotaAndroid = nota;
            }
        }

        // Mostrar los resultados
        System.out.println("Mejor alumno en PHP: " + mejorAlumnoPHP + " (nota: " + mejorNotaPHP + ")");
        System.out.println("Mejor alumno en Android: " + mejorAlumnoAndroid + " (nota: " + mejorNotaAndroid + ")");

        scanner.close();
        
        
        
    }
}
