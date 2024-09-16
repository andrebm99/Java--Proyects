/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andre
 */

import com.mycompany.ingresardatosdetrabajadoresempresa.Trabajador;
import javax.swing.JOptionPane;

public class principal {
    public static void main (String[] args){
        int n,i;
        double tsn = 0;
        n = Integer.parseInt(JOptionPane.showInputDialog("Inserte la cantidad de" + "trabajadores"));
    for (i = 1; i <= n; i++){
        Trabajador trab = new Trabajador();
        trab.setCod(JOptionPane.showInputDialog("Ingrese el codigo: "));
        trab.setApNombre(JOptionPane.showInputDialog("Ingrese apellidos y " + "nombres"));
        trab.setSueldoBasico(Double.parseDouble(JOptionPane.showInputDialog("Ingrese " + "sueldo basico")));
        trab.setBono(Double.parseDouble(JOptionPane.showInputDialog("Ingrese " + "bonificacion")));
        trab.setDescuento(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el " + "descuento")));
        
            System.out.println("El sueldo neto es " + trab.SNeto());
            tsn = tsn+trab.SNeto();
        }
    
        System.out.println("El total de sueldos netos es " + tsn);
    }
}
