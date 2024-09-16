/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carro;

/**
 *
 * @author andre
 */

import javax.swing.JOptionPane;
public class carro {
    
    private int km;
    private int siguienteMantenimiento, opc;
    private boolean mantenimientoRealizado;
    private String mensaje, pregunta, tit;

    public carro() {
        this.km = 0;
        this.siguienteMantenimiento = 5000;
        this.mantenimientoRealizado = true;
    }

    public void recorrido() {
        int kmRecorridos;
        opc = JOptionPane.QUESTION_MESSAGE;
        pregunta = "Cuantos km ha recorrido";
        tit = "Registro de recorridos";
        do {
            mensaje = JOptionPane.showInputDialog(null, pregunta, tit, opc);
            kmRecorridos = Integer.parseInt(mensaje);
        } while (kmRecorridos < 0);
        this.km += kmRecorridos;
        if (this.km >= this.siguienteMantenimiento) {
            mensaje = "Es recomendable realizar lo más pronto posible el mantenimiento.";
            tit = "Requiere mantenimiento";
            opc = JOptionPane.ERROR_MESSAGE;
            JOptionPane.showMessageDialog(null, mensaje, tit, opc);
            this.mantenimientoRealizado = false;
        } else {
            mensaje = "No es necesario realizar mantenimiento.";
            tit = "No requiere mantenimiento";
            opc = JOptionPane.INFORMATION_MESSAGE;
            JOptionPane.showMessageDialog(null, mensaje, tit, opc);
        }
    }

    public boolean isMantenimientoRealizado() {
        return mantenimientoRealizado;
    }

    public void realizarMantenimiento() {
        tit = "Reporte de mantenimiento";
        opc = JOptionPane.INFORMATION_MESSAGE;
        if (!isMantenimientoRealizado()) {
            this.siguienteMantenimiento += 5000;
            this.mantenimientoRealizado = true;
            mensaje = "Realizando mantenimiento...";

        } else {
            mensaje = "Aún no es necesario el mantenimiento.";
        }
        JOptionPane.showMessageDialog(null, mensaje, tit, opc);
    }

    public String mostrarDatos() {
        tit = "Reporte de mantenimiento";
        opc = JOptionPane.INFORMATION_MESSAGE;
        mensaje = "Kilómetros recorridos: " + this.km;
        mensaje += "\nSiguiente mantenimiento a los: " + this.siguienteMantenimiento + " km";
        mensaje += "\nMantenimiento realizado: " + (this.mantenimientoRealizado ? "Sí" : "No");
        return mensaje;
    }

    public void imprimir(String msg, String titulo, int opc2) {
        JOptionPane.showMessageDialog(null, msg, titulo, opc2);
    }

}
