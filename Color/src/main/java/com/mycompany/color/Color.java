/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.color;

/**
* Implementar la clase color con atributos color, total, 
* consumo y saldo y métodos cargar y consumir.  
* Crear clase hija Color Impresora, con atributo mantenimiento. 
* Con método revisar, si consumo es mayor a mantenimiento 
* realizar el mantenimiento y sumar 500 al atributo mantenimiento 
* siempre y cuando sea menor al total.
* Implementar en el main  a la clase color Impresora y ejecutar en un menú
* Cargar. Invoca al método cargar. 
* consumir. aumentar el consumo y reducir el saldo
* mantenimiento. Al ejecutar revisar indicar si fue necesario el 
* mantenimiento y cuando es el siguiente mantenimiento.
*/

public class Color {
        protected String color;
        protected int total;
        protected int consumo;
        protected int salto;
        
    
    public Color(String color, int total) {
        this.color = color;
        this.total = total; 
        this.consumo = consumo;
        this.salto = salto;
    }
    
    public void cargar(int cantidad) {
        this.Saldo += cantidad;
        System.out.println("Cargado" + cantidad + ". Saldo actual: " + this.Saldo);
    }
    
    public void consumir (int cantidad){
        if(cantidad <= this.Saldo){
            this.Consumo += cantidad;
            this.Saldo -= cantidad;
            System.out.println("Consumido: " + cantidad + ". Saldo actual: " + this.Saldo);
        }else{
            System.out.println("No cuenta con suficiente.");
        }
    }
    public int getConsumo(){
        return Consumo;
    }
    
    public int getSaldo(){
        return Saldo;
    }
    
    public int getTotal(){
        return Total;
    }
}

class ColorImpresora extends Color {
    private int mantenimiento;
    
    public ColorImpresora(String Color, int Total, int mantenimiento) {
        super(Color, Total);
        this.mantenimiento = mantenimiento;
    }
    public void revisar(){
        if(getConsumo() > mantenimiento) {
            System.out.println("Mantenimiento necesario. Realizando mantenimeinto...");
            mantenimiento += 500;
            System.out.println("Nuevo valor de mantenimiento: " + mantenimiento);
        } else {
            System.out.println("No es neesario el mantenimiento");
        }
    }
    public int getmantenimiento(){
        return mantenimiento;
    }
    
}
