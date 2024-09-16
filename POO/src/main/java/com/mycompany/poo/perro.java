/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;


/**
 *
 * @author andre
 */

import java.util.Scanner;


public class perro {
    
    private String nombre, razadsc, colordsc;
    private int tamaño, raza, color;
    private boolean estado;
    private Scanner teclado = new Scanner(System.in);
    
    public perro() {
        estado = false;
    }
    
   public void adoptar(){
       System.out.println("Ingrese el nombre de la mascota: ");
       nombre = teclado.next();
       tamaño();
       raza();
       color();
   }
   
   public void tamaño(){
       int tam;
       boolean error;
       do {
           System.out.println("Seleccione el tamaño del perro(1 | Pequeño 2 | Mediano 3 | Grande");
           
           tam = teclado.nextInt();
           
           if (tam == 1 || tam == 2 || tam == 3){
               error = false;
           }
           
       }while (error = true);
       
       tamaño = tam;
       System.out.println("Se ha seleccionado el tamaño" + tam + " del perro");
       
   }
       public void raza (){
        int valor; 
        boolean error;
        do {
            System.out.println("Seleccione el tamaño del perro (1| Coocker 2 | Malinois 3 | Shitzu");
            valor = teclado.nextInt();
            switch (valor){
                case 1:
                    razadsc = "Coocker";
                    raza = 1;
                    error = false;
                    break;
                case 2:
                    razadsc = "Malinois";
                    raza = 2;
                    error = false;
                    break;
                case 3 : 
                    razadsc = "Shitzu";
                    raza = 3;
                    error = false;
                    break;
                    
                default :
                    error = true; 
            }
        } while (error == true);
        
            System.out.println("Se ha seleccionado la raza " + razadsc + "del perro");
       
   }
    
}
