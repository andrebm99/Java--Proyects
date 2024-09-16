/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guerrero;

/**
 *
 * @author andre
 */

public class Guerrero {

    private int NPoder;
    private int horasEntrenamiento;

    public Guerrero() {
        this.NPoder = 0;
        this.horasEntrenamiento = 0;
    }

    public void entrenar(int horas, int nivel) {
        this.horasEntrenamiento += horas;
        this.NPoder += nivel;
    }

    public int getNivelPoder() {
        return NPoder;
    }

    public int getHorasEntrenamiento() {
        return horasEntrenamiento;
    }

    public String mostrarDatos() {
        return "Nivel de poder: " + NPoder + "\nHoras de entrenamiento: " + horasEntrenamiento;
    }
    
}
