
import com.mycompany.empresa.Cliente;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andre
 */
public class main {
    public static void main(String[] args) {
        String ruc = JOptionPane.showInputDialog("Ingrese el RUC (11 dígitos):");
        String razonSocial = JOptionPane.showInputDialog("Ingrese la Razón Social:");
        String razonComercial = JOptionPane.showInputDialog("Ingrese la Razón Comercial:");
        String estado = JOptionPane.showInputDialog("Ingrese el Estado:");
        int cantidadProductosComprados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos comprados:"));
        double totalComprado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el total comprado:"));
        
        Cliente cliente = new Cliente(ruc, razonSocial, razonComercial, estado, cantidadProductosComprados, totalComprado);
        
        if(cliente.validarRuc()) {
            cliente.mostrar();
        } else {
            System.out.println("RUC invalido.");
        }
    }
}
