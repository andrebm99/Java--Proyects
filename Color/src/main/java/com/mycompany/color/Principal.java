/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.color;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ColorImpresora impresora = new ColorImpresora ("Rojo", 500, 300);
        
        while (true){
            System.out.println("\nMenu:");
            System.out.println("1. Cargar");
            System.out.println("2. Imprimir");
            System.out.println("3. Mantenimiento");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            int opcion = scanner.nextInt();
            
            switch (opcion){
                case 1: 
                    System.out.print("Cantidad a cargar: ");
                    int cantidadCarga = scanner.nextInt();
                    impresora.cargar(cantidadCarga);
                    break;
                case 2: 
                    System.out.print("Cantidad a imprimir: ");
                    int cantidadcargar = scanner.nextInt();
                    impresora.cargar(cantidadcargar);
                    break;
                    
                case 3:
                    impresora.revisar();
                    break;
                    
                case 4:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return; 
                    
                default:
                    System.out.println("Opcion no valida.");
            }
        }
    }
}
