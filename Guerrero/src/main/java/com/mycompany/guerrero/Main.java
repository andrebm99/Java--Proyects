/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guerrero;

import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class Main {
    public static void main(String[] args) {
        Namekiano namekiano = new Namekiano();
        boolean continuar = true;

        while (continuar) {
            // Mostrar menú
            String[] opciones = {"Entrenar", "Transformar", "Ver información", "Salir"};
            int opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Menú Principal",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (opcion) {
                case 0: // Entrenar
                    String inputHoras = JOptionPane.showInputDialog("Ingrese las horas de entrenamiento:");
                    int horas = Integer.parseInt(inputHoras);
                    String inputNivel = JOptionPane.showInputDialog("Ingrese el nivel de poder ganado:");
                    int nivel = Integer.parseInt(inputNivel);
                    namekiano.entrenar(horas, nivel);
                    JOptionPane.showMessageDialog(null, "Entrenamiento realizado.\n" + namekiano.mostrarDatos(), "Información", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 1: // Transformar
                    int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar una fusión?", "Fusión", JOptionPane.YES_NO_OPTION);
                    if (respuesta == JOptionPane.YES_OPTION) {
                        namekiano.fusionar();
                        JOptionPane.showMessageDialog(null, "Fusión realizada.\n" + namekiano.mostrarDatos(), "Información", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 2: // Ver información
                    JOptionPane.showMessageDialog(null, namekiano.mostrarDatos(), "Información del Guerrero", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3: // Salir
                    continuar = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }
}
