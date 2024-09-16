/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.socio;

/**
 *
 * @author andre
 */
public class Socio {
    private String Codigo, ApellNombre, TipoSocio;
    private double CuotaM, Mora;
    
    public Socio(){
    
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
    
    public double getCuotaM(){
        return CuotaM;
    }
    
    public void setCuotaM(double CuotaM){
        this.CuotaM = CuotaM;
    }
    
    public double getMora(){
        return Mora;
    }
    
    public void setMora(double Mora){
        this.Mora = Mora; 
    }
    
    public double ImPagar(){
        return CuotaM + Mora;
    }
    
}
