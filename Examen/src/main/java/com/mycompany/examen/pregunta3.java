/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen;

import java.util.Scanner;

/**
 *
 * @author ronal
 */
public class pregunta3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cantidadProductos;

        System.out.print("Ingrese la cantidad de productos elaborados: ");
        cantidadProductos = scanner.nextInt();

        int cajasPlastico = 0;
        int cajasCarton = 0;

        int cajasChicas = 0;
        int cajasMedianas = 0;
        int cajasGrandes = 0;

        for (int i = 1; i <= cantidadProductos; i++) {
            System.out.println("Producto #" + i);
            System.out.print("Tamaño del producto (chico, mediano, grande): ");
            String tamano = scanner.next();

            System.out.print("Material del producto (plástico, cartón): ");
            String material = scanner.next();

            if (material.equalsIgnoreCase("plástico")) {
                cajasPlastico++;
            } else if (material.equalsIgnoreCase("cartón")) {
                cajasCarton++;
            }

            if (tamano.equalsIgnoreCase("chico")) {
                cajasChicas++;
            } else if (tamano.equalsIgnoreCase("mediano")) {
                cajasMedianas++;
            } else if (tamano.equalsIgnoreCase("grande")) {
                cajasGrandes++;
            }
        }

        System.out.println("Resumen:");
        System.out.println("Cantidad de cajas de plástico: " + cajasPlastico);
        System.out.println("Cantidad de cajas de cartón: " + cajasCarton);

        int totalCajas = cajasChicas + cajasMedianas + cajasGrandes;
        double porcentajeChicas = (double) cajasChicas / totalCajas * 100;
        double porcentajeMedianas = (double) cajasMedianas / totalCajas * 100;
        double porcentajeGrandes = (double) cajasGrandes / totalCajas * 100;

        System.out.println("Porcentaje de cajas chicas: " + porcentajeChicas + "%");
        System.out.println("Porcentaje de cajas medianas: " + porcentajeMedianas + "%");
        System.out.println("Porcentaje de cajas grandes: " + porcentajeGrandes + "%");

        scanner.close();
    
        
    }
}
