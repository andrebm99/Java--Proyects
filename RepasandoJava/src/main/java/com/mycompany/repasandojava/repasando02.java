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
public class repasando02 {
    public static void main(String [] args){
            /*
            2. Se ingresan los resultados de la evaluación del curso de Química; por cada
            alumno se informa: su condición (1 = ingresante, 2 = traslado) y su calificación
            obtenida que va de 0 a 20. Para estar aprobado debe tener una nota mínima de 14. 
            A partir de esta información se debe mostrar:
             La cantidad de alumnos ingresantes y la cantidad de traslado.
             La nota promedio de los aprobados y la nota promedio de los desaprobados.
            El programa termina cuando no se desea registrar más alumnos.
            */
        Scanner scan = new Scanner(System.in);
        
        double nota, aprobados = 0, desaprobados = 0, promedioAprobados = 0, promedioDesaprobados = 0;
        int condicion, ingreso = 0, traslado = 0, cont = 1, preg = 1;
        
        while (preg==1){
            condicion = 0;
            while(condicion!=1 && condicion!=2){
                System.out.println("Condicion del alumno #" + cont + "[1]ingresante o [2]traslado");
                condicion = scan.nextInt();
            }

            if(condicion == 1){
                ingreso=ingreso + 1;
            }else{
                traslado = traslado + 1;
            }
            nota = -1;

            while (nota<0||nota > 20){
                System.out.println("Ingrese la nota del alumno: " + cont);
                nota = scan.nextDouble();
            }
            if (nota>=14){
                aprobados = aprobados+1;
                promedioAprobados = promedioAprobados + nota;
            } else{
                desaprobados = desaprobados +1;
                promedioDesaprobados = promedioDesaprobados + nota;
            }

            cont = cont + 1;
            
            System.out.println("Desea registrar otro alumno [Y]Si o [N]No");
            preg = scan.nextInt();
           
        }

        promedioAprobados = promedioAprobados/aprobados;
        promedioDesaprobados = promedioDesaprobados/desaprobados;

        System.out.println("Cantidad de estudiantes ingresantes: " + ingreso);
        System.out.println("Cantidad de estudiantes trasladados: " + traslado);
        System.out.println("Nota promedio de aprobados: " + promedioAprobados);
        System.out.println("Nota promedio de los desaprobados: " + promedioDesaprobados);
        
    }
    
}
