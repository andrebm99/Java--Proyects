/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.perro;

import java.util.Scanner;

public class Perro {
    private String nombre, razadsc, colordsc;
    private int tamaño, raza, color;
    private boolean estado;
    private Scanner teclado = new Scanner(System.in);
    
    public Perro(){
        estado = false;
    }
    public Perro(String nombre){
        System.out.println("\n¡Adoptemos un nuevo amigo!");
        System.out.println("Ingrese el nombre de la mascota");
        nombre = teclado.next();
        System.out.println("Usted debe definir la raza, color y tamaño");
        tamaño = 0;
        raza = 0;
        color = 0; 
        estado = true;
    }
    
    public void adoptar(){
        if(isAdoptado()){
            System.out.println("\nYa has adoptado a " + getNombre() + ". ¡Cuidalo bien!");
        } else{
            System.out.println("\n¡Adoptemos un nuevo amigo!");
            System.out.println("Ingrese el nombre de la mascota");
            nombre = teclado.next();
            
        }
    }
   
}
