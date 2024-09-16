/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicios;

import java.util.Scanner;

/**
 *
 * @author ronal
 */
public class Ejercicios {

    public static void main(String[] args) {
        String[] nombres = {"Luis", "Ana", "Carlos", "Beatriz", "Felipe", "Jorge", "María"};
        int[] notas = {15, 18, 14, 16, 18, 18, 11};

        int maxNota = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > maxNota) {
                maxNota = notas[i];
            }
        }

        StringBuilder ganadores = new StringBuilder();
        for (int i = 0; i < nombres.length; i++) {
            if (notas[i] == maxNota) {
                ganadores.append(nombres[i]).append(" - ");
            }
        }

        // Eliminar el último guion y espacio
        ganadores.delete(ganadores.length() - 3, ganadores.length());

        System.out.println("Ganadores: " + ganadores.toString());
    }
}
