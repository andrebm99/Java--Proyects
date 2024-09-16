package controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import model.Cita;
import model.Paciente;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GAMER
 */
public class CitaController {
    
    private List<Cita> citas;
    
    public CitaController() {
        citas = new ArrayList<>();
    }

    public void agendarCita(Cita cita)
    {
        citas.add(cita);
    }

    public List<Cita> buscarCitasPorPaciente(Paciente paciente) {
        List<Cita> citasEncontradas = new ArrayList<>();
        for (Cita cita : citas) {
            if (cita.getPaciente().getDni().equals(paciente.getDni())) {
                citasEncontradas.add(cita);
            }
        }
        return citasEncontradas;
    }

    public String getTablaCitas(List<Cita> lst_cita) {
        StringBuilder tablaCitas = new StringBuilder();
        tablaCitas.append("--------------------------------------------------------------\n");
        tablaCitas.append(String.format("| %-13s | %-13s | %-13s | %-13s |\n", "DNI","Paciente","Fecha","Hora"));
        tablaCitas.append("--------------------------------------------------------------\n");
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        if(!lst_cita.isEmpty()){
            citas = lst_cita;
        }
        for (Cita cita : citas) {
            tablaCitas.append(String.format("| %-13s | %-13s | %-13s | %-13s |\n", cita.getPaciente().getDni(),cita.getPaciente().getApellidos()+" "+cita.getPaciente().getNombres(),formato.format(cita.getFechacita()), cita.getHora()));
        }
        tablaCitas.append("--------------------------------------------------------------\n");
        return tablaCitas.toString();
    }
}
