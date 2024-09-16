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
public class Ejercicio5 {
    public static void main(String[] args) {
        /*
        Un supermercado ha recopilado los datos de N productos, para esto se ingresan
        en un proceso repetitivo: el tipo (comida, vestido), la procedencia (Nacional,
        Importado) y el precio de cada producto. Construya un programa que permita
        mostrar:
        -El mayor precio pagado por un producto Nacional.
        -El menor precio pagado por un producto Importado.
        -La ganancia total de dinero en comida y la ganancia total de dinero en
        vestido
        */
        
        Scanner scanner = new Scanner(System.in);
        int cantidadProductos;
        String tipo, procedencia;
        float precio;
        float mayorPrecioNacional = 0;
        float menorPrecioImportado = Float.MAX_VALUE;
        float gananciaComida = 0;
        float gananciaVestido = 0;

        System.out.print("Ingrese la cantidad de productos: ");
        cantidadProductos = scanner.nextInt();
        scanner.nextLine(); // Limpiar el búfer de entrada

        for (int i = 1; i <= cantidadProductos; i++) {
            System.out.println("Producto #" + i);
            System.out.print("Ingrese el tipo (comida/vestido): ");
            tipo = scanner.nextLine();

            System.out.print("Ingrese la procedencia (Nacional/Importado): ");
            procedencia = scanner.nextLine();

            System.out.print("Ingrese el precio: ");
            precio = scanner.nextFloat();
            scanner.nextLine(); // Limpiar el búfer de entrada

            if (procedencia.equalsIgnoreCase("Nacional")) {
                if (precio > mayorPrecioNacional) {
                    mayorPrecioNacional = precio;
                }
                if (tipo.equalsIgnoreCase("comida")) {
                    gananciaComida += precio;
                }
            } else if (procedencia.equalsIgnoreCase("Importado")) {
                if (precio < menorPrecioImportado) {
                    menorPrecioImportado = precio;
                }
                if (tipo.equalsIgnoreCase("vestido")) {
                    gananciaVestido += precio;
                }
            }
        }

        System.out.println("El mayor precio pagado por un producto Nacional es: " + mayorPrecioNacional);
        System.out.println("El menor precio pagado por un producto Importado es: " + menorPrecioImportado);
        System.out.println("La ganancia total de dinero en comida es: " + gananciaComida);
        System.out.println("La ganancia total de dinero en vestido es: " + gananciaVestido);
        
        
        
    }
}
