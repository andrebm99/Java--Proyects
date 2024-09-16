/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.holamundo;

/**
 *
 * @author andre
 */
public class Holamundo {
    private String Codigo, ApellNombre, TipoSocio;
    private double CuotaM, Mora;
    
    public Holamundo(){
    
    }
    
    public String getCodigo(){
        return Codigo;
    }
    
    public void setCodigo(String Codigo){
        this.Codigo = Codigo;
    }
    
    public String getApellNombre(){
        return ApellNombre;
    }
    
    public void setApellNombre(String ApellNombre){
        this.ApellNombre = ApellNombre; 
    }
    
    public String getTipoSocio(){
        return TipoSocio;
    }
    
    public void setTipoSocio(String TipoSocio){
        this.TipoSocio = TipoSocio;
    }
    
    public double getCuotaM(double CuotaM){
        return CuotaM;
    }
    
    public void setCuotaM(double CuotaM){
        this.CuotaM = CuotaM;
    }
    
    public double getMora(double More){
        return Mora;
    }
    
    public void setMora(double Mora){
        this.Mora = Mora; 
    }
    
    public double ImPagar(){
        return CuotaM + Mora;
    }
   
}
