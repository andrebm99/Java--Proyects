/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.empresa;

/**
Implementar la clase Empresa con los atributos RUC, 
* Razón social, razón comercial, y estado, implementar 
* método validar ruc de 11 dígitos y la clase cliente 
* que hereda de Empresa cuente con los atributos cantidad 
* de productos comprados, total comprados que implemente 
* el método mostrar y presenta la información del padre y 
* del hijo en el main.
 */
public class Empresa {

    private final String Ruc;

    private String RazonSocial, RazonComercial, Estado;
    
    public Empresa (String Ruc, String RazonSocial, String RazonComercial, String Estado) {
        this.Ruc = Ruc;
        this.RazonSocial = RazonSocial;
        this.RazonComercial = RazonComercial;
        this.Estado = Estado;
    }
    
    public boolean validarRuc() { // Cambiado a boolean
        return Ruc != null && Ruc.matches("\\d{11}");
    }

    
    public String getRuc(){
        return Ruc; 
    }
    
    public String getRazonSocial() {
        return RazonSocial; 
    }
    
    public String getRazonComercial(){
        return RazonComercial; 
    }
    
    public String getEstado(){
        return Estado; 
    }   
}

