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
public class AreaPerimetroRectangulo {
    public static void main(String [] args){
        
        /*
        Escribe un programa en Java que calcule el área y el perímetro de un rectángulo dados su ancho y su altura. Utiliza las fórmulas:
        Area del rectangulo: area = ancho * altura
        Perimetro del rectangulo: perimetro = 2 * (ancho+altura)
        
        Requisitos del Código:
            Leer el ancho y la altura del rectángulo desde la entrada estándar (consola).
            Calcular el área y el perímetro utilizando las fórmulas proporcionadas.
            Imprimir los resultados en un formato claro y comprensible.
        */
        Scanner scanner = new Scanner(System.in);
        
        // Le pedimos datos al usuario
        System.out.println("Ingrese la altura del rectangulo: ");
        double Altura = scanner.nextDouble();
        
        System.out.println("Ingrese el ancho del rectangulo: ");
        double Ancho = scanner.nextDouble();
        
        // Calculamos el area del rectangulo
        
        double Area = Ancho * Altura;
         
         // Calculamos el perimetro
         
         double Perimetro = 2 * (Ancho + Altura);
         
         // Imprimimos resultados
         
         System.out.println("El area del rectangulo es: " + Area);
         System.out.println("El perimetro del rectangulo es: " + Perimetro);
         
         scanner.close();
    }
}
