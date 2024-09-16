/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ingresardatosdetrabajadoresempresa;

/**
DISEÑAR UN PROGRAMA QUE INGRESE LOS DATOS DE LOS
TRABAJADORES DE UNA EMPRESA CODIGO, APELLIDOS Y
NOMBRES, SUELDO BASICO, BONIFICACION Y DESCUENTO
SE PIDE CALCULAR E IMPRIMIR EL SUELDO NETO DE CADA
TRABAJADOR APLIQUE CLASES, OBJETOS Y METODOS
CALCULE E IMPRIMA EL TOTAL DE SUELDOS NETOS
 */
public class Trabajador {

    private String Cod, ApNombre;
    private double SueldoBasico, Bono, Descuento;
    
    public Trabajador() {
    }
    
    public String getCod(){
        return Cod;
    }
    
    public void setCod(String Cod){
        this.Cod = Cod;
    } 
    
    public String getApNombre(){
        return ApNombre;
    }
    
    public void setApNombre(String ApNombre){
        this.ApNombre = ApNombre;
    }
    
    public double getSueldoBasico(){
        return SueldoBasico;
    }
    
    public void setSueldoBasico(double SueldoBasico){
        this.SueldoBasico = SueldoBasico;
    }
    
    public double getBono(){
        return Bono;
    }
    
    public void setBono(double Bono){
        this.Bono = Bono;
    }
    
    public double getDescuento() {
        return Descuento;
    }
    
    public void setDescuento(double Descuento){
        this.Descuento = Descuento;
    }
    
    public double SNeto() {
        return SueldoBasico + Bono - Descuento;
    }
}
