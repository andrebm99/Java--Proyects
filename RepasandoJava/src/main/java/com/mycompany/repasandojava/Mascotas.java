/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repasandojava;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Mascotas {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de su mascota: ");
        String mascota = scanner.nextLine();
        
        System.out.println("La mascota mas hermosa es: " + mascota);
        
    }
}
