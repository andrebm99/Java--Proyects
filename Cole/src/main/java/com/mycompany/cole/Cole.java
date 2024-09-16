/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cole;

/**
 *
 * @author andre
 */
public class Cole {

    private String Cod, ApellNombres, AñoEstudio;
    private double ExParcial, ExFinal;
    
    public Cole(){
    }
    
    public String getCod(){
        return Cod;
    }
    
    public void setCod(String Cod){
        this.Cod = Cod;
    }
    
    
    public String getApellNombres(){
        return ApellNombres;
    }
    
    public void setApellNombres(String ApellNombres){
        this.ApellNombres = ApellNombres;
    }
    
    
    public String getAñoEstudio(){
        return AñoEstudio;
    }
    
    public void setAñoEstudio(String AñoEstudio){
        this.AñoEstudio = AñoEstudio;
    }
    
    public double getExParcial(){
        return ExParcial;
    }
    
    public void setExParcial(double ExParcial){
        this.ExParcial = ExParcial;
    }
    
    public double getExFinal(){
        return ExFinal;
    }
    
    public void setExFinal(double ExFinal){
        this.ExFinal = ExFinal;
    }
     
    public double Promedio(){
        return  (ExParcial + ExFinal)/2;
    }
    
    @Override
    public String toString() {
        return "Alumno{" + "cod = " + Cod + ", apellidos y nombres =" + ApellNombres + ", Año estudio=" + AñoEstudio + ", Examen Parcial=" + ExParcial + ", Examen Final=" + ExFinal + ", Promedio Final= " + Promedio() + '}';
    }
    
}
