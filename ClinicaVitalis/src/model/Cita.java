/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author GAMER
 */
public class Cita {
    private String descripcion;
    private Date fechacita;
    private String hora;
    private Paciente paciente;

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechacita() {
        return fechacita;
    }

    public void setFechacita(Date fechacita) {
        this.fechacita = fechacita;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

        sb.append("Descripción: ").append(descripcion).append("\n");
        sb.append("Fecha cita: ").append(formatoFecha.format(fechacita)).append("\n");
        sb.append("Hora: ").append(hora).append("\n");
        sb.append("Paciente: ").append(paciente.getNombres()).append(" (DNI: ").append(paciente.getDni()).append(")\n");

        return sb.toString();
    }
}
