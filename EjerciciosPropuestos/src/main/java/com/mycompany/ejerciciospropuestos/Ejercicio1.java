/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciospropuestos;

import java.util.Scanner;

/**
 *
 * @author ronal
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
        /*
        1. Un agricultor que siembra diferentes tipos de frutas necesita obtener la siguiente
        información:
         La manzana que tuvo el mayor peso
         El promedio de pesos de las papayas
         El porcentaje de las sandías producidas que pesaron menos de 2.5 kilogramos
        comparado con el total de sandías producidas.
        El proceso termina cuando se ingresa un peso con el valor de cero
        */
        
        Scanner scanner = new Scanner (System.in);
        
        double pesoManzanaMayor = 0;
        double sumaPesosPapayas = 0;
        int cantidadPapayas = 0;
        int cantidadSandias = 0;
        double cantidadSandiasMenor2_5 = 0;
        
        double pesoFruta;
        
        System.out.println("Ingrese el peso de las frutas (0 para terminar):");
        pesoFruta = scanner.nextDouble();
        
        while (pesoFruta != 0 ){
            if (pesoFruta > pesoManzanaMayor && pesoFruta > 0 ) {
                pesoManzanaMayor = pesoFruta;
                
            }
            if (pesoFruta > 0) {
                sumaPesosPapayas += pesoFruta;
                cantidadPapayas++;
            
            }
            if (pesoFruta <= 2.5 && pesoFruta > 0) {
                cantidadSandiasMenor2_5++;
            }
            
            if (pesoFruta > 0) {
                cantidadSandias++;
            }
            pesoFruta = scanner.nextDouble();
            
            }
            double promedioPapayas = sumaPesosPapayas / cantidadPapayas;
            double porcentajeSandiasMenor2_5 = (cantidadSandiasMenor2_5 / cantidadSandias) * 100;
        
            System.out.println("La manzana de mayor peso es: " + pesoManzanaMayor);
        System.out.println("El promedio de pesos de las papayas es: " + promedioPapayas);
        System.out.println("El porcentaje de sandias que pesaron menos de 2.5 kg es: " + porcentajeSandiasMenor2_5 + "%");
        
        
    }
}
