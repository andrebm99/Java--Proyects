/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto;

/**
 *
 * @author ronal
 */
public class Proyecto {
        private String nombre;
        private int edad;
        private String destino;
        private String origen;
        
        // Constructor
        
        public Proyecto(String nombre, int edad, String destino){
            this.nombre = nombre;
            this.edad = edad;
            this.destino = destino;
            this.origen = origen;
        }
        
        // Metodo para calcular el precio del pasaje
        
        public double calcularPrecio(){
            
            double precioBase;
            
            switch (origen){
                
                case "Cusco":
                    
            }
            
            
            switch (destino){
                
                case "Cusco":
                    precioBase = 75.00;
                    break;
                    
                case "Arequipa":
                    precioBase = 60.00;
                    break;
                 
                case "Iquitos":
                    precioBase = 48.00;
                    break;
                    
                case "Tumbes":
                    precioBase = 65.00;
                    break;
                
                default:
                    precioBase = 0.00; //Destino no valido
            }
            
            // Descuento 8% si el pasajero tiene más de 65 años
            
            if (edad > 65){
                return precioBase - (precioBase * 0.08);
            } else {
                return precioBase;
            }
            
        }
        
        // Opcional para acceder a los atributos desde fuera de la clase
        
        public String getNombre(){
            return nombre;
        }
        
        public void setNombre(String nombre){
            this.nombre = nombre;
            
        }
        
        public int getEdad(){
            
            return edad;
            
        }
        
        public void setEdad(int edad){
            
           this.edad = edad;
            
        }
        
        public String getDestino(){
            return destino;
            
        }
        
        public void setDestino(String destino){
            this.destino = destino;
        }
        
        
        
        
        
        
        
        
}
