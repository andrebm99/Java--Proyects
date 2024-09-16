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
public class pregunta4 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de alumnos: ");
        int N = sc.nextInt(); // Número de alumnos

        int[] notas = generarNotas(N);

        mostrarArreglo(notas);
        double promedio = calcularPromedio(notas);
        System.out.println("Promedio de notas: " + promedio);

        int[] cantidadAlumnos = contarAlumnosPorNota(notas);
        System.out.println("Cantidad de alumnos por nota:");
        System.out.println("Excelente: " + cantidadAlumnos[0]);
        System.out.println("Bueno: " + cantidadAlumnos[1]);
        System.out.println("Regular: " + cantidadAlumnos[2]);
        System.out.println("Irregular: " + cantidadAlumnos[3]);
        System.out.println("Deficiente: " + cantidadAlumnos[4]);
    }

    // Arreglo de notas aleatorias entre 0 y 20
    
    public static int[] generarNotas(int N) {
        int[] notas = new int[N];

        for (int i = 0; i < N; i++) {
            notas[i] = (int) (Math.random() * 21);
        }

        return notas;
    }

    // Mostrando el arreglo con notas en la pantalla
    
    public static void mostrarArreglo(int[] notas) {
        System.out.println("Notas:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Alumno #" + (i + 1) + ": " + notas[i]);
        }
    }

    // Calculando el promedio de las notas
    
    public static double calcularPromedio(int[] notas) {
        int suma = 0;
        for (int nota : notas) {
            suma += nota;
        }
        return (double) suma / notas.length;
    }

    
    public static int[] contarAlumnosPorNota(int[] notas) {
        int[] cantidadAlumnos = new int[5]; // Una posición para cada tipo de nota

        for (int nota : notas) {
            if (nota >= 18 && nota <= 20) {
                cantidadAlumnos[0]++; // Excelente
            } else if (nota >= 15 && nota <= 17) {
                cantidadAlumnos[1]++; // Bueno
            } else if (nota >= 12 && nota <= 14) {
                cantidadAlumnos[2]++; // Regular
            } else if (nota >= 6 && nota <= 11) {
                cantidadAlumnos[3]++; // Irregular
            } else if (nota >= 0 && nota <= 5) {
                cantidadAlumnos[4]++; // Deficiente
            }
        }

        return cantidadAlumnos;
    
    }
    
}
