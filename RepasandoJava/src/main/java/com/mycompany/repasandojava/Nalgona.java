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
public class Nalgona {
    public static void main(String [] args){
        try (Scanner scanner = new Scanner (System.in)) {
            System.out.println("Ingrese el nombre de su nalgona <3 : ");
            String nalgona = scanner.nextLine();
            
            System.out.println("La nalgona mas hermosa es : " + nalgona);
        }
    }
}
