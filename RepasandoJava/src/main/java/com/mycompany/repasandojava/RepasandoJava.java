/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.repasandojava;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class RepasandoJava {

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
        
        double PesoManzanaMayor = 0; 
        double SumaPesosPapayas = 0;
        int cantidadPapayas = 0;
        int cantidadSandias = 0;
        double cantidadSandiasMenor2_5 = 0;
        double pesoFruta = 0;
        
        System.out.println("Ingrese el peso de las frutas (0 para terminar): ");
        pesoFruta = scanner.nextDouble();
        
        while (pesoFruta != 0){
            if (pesoFruta > PesoManzanaMayor && pesoFruta > 0) {
                PesoManzanaMayor = pesoFruta;
                
            }
            if (pesoFruta > 0) {
                SumaPesosPapayas += pesoFruta;
                cantidadPapayas++;
                
            }
            if (pesoFruta <= 2.5 && pesoFruta > 0) {
                cantidadSandiasMenor2_5++;
            }
            if (pesoFruta > 0){
                cantidadSandias ++;
            }
            pesoFruta = scanner.nextDouble();           
        }
        double promedioPapayas = SumaPesosPapayas / cantidadPapayas;
        double porcentajeSandiasMenor2_5 = (cantidadSandiasMenor2_5 / cantidadSandias) * 100;
        
        System.out.println("La manzana de mayor peso es: " + PesoManzanaMayor);
        System.out.println("El promedio de pesos de las papayas es: " + promedioPapayas);
        System.out.println("El porcentaje de sandias que pesaron menos de 2.5kg es: " + porcentajeSandiasMenor2_5 + "%");
        
    }   
}