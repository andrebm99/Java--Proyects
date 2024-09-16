/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso_java;
import java.util.Scanner;
/**
 *
 * @author ronal
 */
public class Repaso_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Elabore un algoritmo/programa que acepte tres números enteros diferentes. Seguidamente mostrar el menor de ellos.
        
        // Creamos el objeto Scanner
        
        Scanner entrada = new Scanner(System.in);
        
        //Pedimos al usuario ingresar 3 números enteros diferentes
        
        System.out.print("Ingrese el primero número entero: ");
        int num1 = entrada.nextInt();
        
        System.out.print("Ingrese el segundo número entero: ");
        int num2 = entrada.nextInt();
        
        System.out.print("Ingrese el tercer número entero: ");
        int num3 = entrada.nextInt();
        
        // Comparamos los tres numeros para determinar el menor
        
        int menor = num1;
        if(num2 < menor){
            menor = num2;
        }
        if (num3 < menor){
            menor = num3;
        }
        // mostrar el resultado al usuario
        
        System.out.println("El menor número es: " + menor);
        
    }
    
}
