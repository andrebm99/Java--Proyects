/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.colegio;

/**
 *
 * @author andre
 */
/*
Diseñe un programa que ingrese los datos de los alumnos de
un colegio código, apellidos y nombres, año de estudio,
examen parcial, examen final y promedio de practicas Se
pide calcular e imprimir el promedio final de cada alumno
Aplique clases, objetos y métodos
*/

public class Alumno {
    private String cod, ApellNombre;
    private int añoEstudio;
    private double exParcial, exFinal, promPractica;
    
    public Alumno(){
    }
    
    public String getCod(){
        return cod;
    }
    public void setCod(String cod){
        this.cod = cod;
    }
    public String getApellNombre(){
        return ApellNombre;
    }
    public void setApellNombre(String ApellNombre) {
        this.ApellNombre = ApellNombre;
    }
    public int getañoEstudio(int añoEstudio){
        return añoEstudio;
    }
    public void setañoEstudio(int añoEstudio){
        this.añoEstudio = añoEstudio;
    }
    public double getexParcial () {
        return exParcial;
    }
    public void setexParcial (double exParcial) {
        this.exParcial = exParcial;
    }
    
    public double getexFinal(){
        return exFinal;
    }
    public void setexFinal(double exFinal) {
        this.exFinal = exFinal;
    }
    
    public double getpromPractica (){
        return promPractica;
    }
    public void setpromPractica(double promPractica) {
        this.promPractica = promPractica;
    }
    public double pf() {
        return (exParcial + exFinal + promPractica)/3;
    }
   @Override
    public String toString() {
        return "Alumno{" + "cod=" + cod + ", apnom=" + ApellNombre + ", Año estudio=" + añoEstudio + ", Examen Parcial=" + exParcial + ", Examen Final=" + exFinal + ", Promedio Practica=" + promPractica + ", Promedio Final=" + pf() + '}';
    }

}
