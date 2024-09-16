/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author C26623
 */
public class Pasajero {
    
    private final double peso;
    private final String destino;
    private String origen;
    private final char esFrecuente;
    private boolean esViajarPrimeraClase;
    private final char refrigerio;
    private final char seguro;
    
    
    // Constructor
    
    public Pasajero(double peso, String destino, char esFrecuente, boolean viajarPrimeraClase, char refrigerio, char seguro){
        
        this.peso = peso;
        this.destino = destino;
        this.esFrecuente = esFrecuente;
        this.esViajarPrimeraClase = viajarPrimeraClase;
        this.refrigerio = refrigerio;
        this.seguro = seguro;
        this.origen = origen;
    }
    
    // Método para calcular el precio del apsaje segun el destino
    
    public double calcularTarifa(){
           
        switch (destino){
            
            case "cusco": return 75.00;
            case "Arequipa": return 60.00;
            case "Iquitos": return 48.00;
            case "Tumbes": return 65.00;
            
            default: return 0.00; //Destino no valido
            
        }
        
    }
    
    // Metodo para el atributo origen
    
    public String getOrigen(){
        return origen;
    }
    
    public void setOrigen(String origen){
        
        this.origen = origen;
    }
    
    // Método para calcular el descuento por edad
    
    public double calcularDescuento(){
        
        int edadMinimaDescuento = 65;
        double descuento = 0.08;
        
        /*
        Verificar si el pasajero tiene más de 65 años
        y aplicar el descuento correspondiente
        */
        
        if (edadPasajero() > edadMinimaDescuento){
            
            return calcularTarifa() * descuento;
            
        }else{
            return 0.0;
        }
        
    }
    
    
    // Método para calcular el monto total del pasaje con todos los incrementos
    
    public double calcularMontoTotal(){
        
        double tarifaBase = calcularTarifa();
        double incremento = calcularIncremento();
        double montoPasaje = tarifaBase + tarifaBase * incremento;
        
        // Verificar y aplicar otros incrementossegun la elección del pasajero
        
        if (esViajarPrimeraClase){
            
            montoPasaje += tarifaBase * 0.25;
        }
        
        if (refrigerio == 'S') {
            
            montoPasaje += 5.00;
            
        }
        
        if (seguro == 'S') {
            
            montoPasaje += 10.00;
            
        }
        
        // Restar el descuento si el pasajero es mayor de 65 años
        
        montoPasaje -= calcularDescuento ();
        
        return montoPasaje;
        
    }
    
    // Metodo para calcular el incremento segun el peso del pasajero
    
    private double calcularIncremento (){
        
        if (peso >= 0 && peso <= 20) {
            return 0.00;
            
        } else if (peso >= 21 && peso <= 40) {
            return 0.05;
            
        } else if (peso >= 41 && peso <= 60) {
            return 0.10;
            
        } else {
            return 0.15;
        }
        
    }

    private int edadPasajero() {
        return 30; // Suponiendo que el pasajero tiene 30 años
    }
    
    
}
