/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import controller.CitaController;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Scanner;
import model.Cita;
import model.Paciente;

/**
 *
 * @author GAMER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CitaController citacon = new CitaController();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        System.out.println("=====================================================");
        System.out.println("================= Cllínica Vitalis ==================");
        System.out.println("=====================================================");
        do {
            
            System.out.println("Seleccione una opción:");
            System.out.println("1. Registrar una cita");
            System.out.println("2. Ver todas las citas");
            System.out.println("3. Buscar una cita");
            System.out.println("4. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:// recoleccion de datos
                    System.out.println("***** DATOS DEL PACIENTE ***** ");
                    System.out.println("Nombres del paciente: ");
                    String nombres = scanner.next();
                    System.out.println("Apellidos del paciente: ");
                    String apellidos = scanner.next();
                    System.out.println("DNI: ");
                    String dni = scanner.next();
                    System.out.println("***** DATOS DE LA CITA ***** ");
                    System.out.println("Descripción: ");
                    String descripcion = scanner.next();
                    
                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    Date tmp_fecha = null;
                    boolean date_corect = true;
                    do {
                        System.out.println("Fecha (formato: dd/mm/yyyy): ");
                        String fecha = scanner.next();
                        try {
                            tmp_fecha = dateFormat.parse(fecha);
                            date_corect = false;
                        } catch (ParseException e) {
                            System.out.println("Formato de fecha incorrecto. Intente nuevamente...");
                            date_corect = true;
                        }
                    } while (date_corect);
                    System.out.println("Hora (formato: H:i): ");
                    String hora = scanner.next();
                    Paciente paciente = new Paciente();
                    paciente.setNombres(nombres);
                    paciente.setApellidos(apellidos);
                    paciente.setDni(dni);

                    Cita cita = new Cita();
                    cita.setDescripcion(descripcion);
                    cita.setFechacita(tmp_fecha);
                    cita.setHora(hora);
                    cita.setPaciente(paciente);

                    citacon.agendarCita(cita);

                    System.out.println("*====* Cita registrada con éxito *====*\n");
                    break;
                case 2:
                    System.out.println("***** LISTADO DE CITAS ***** ");
                    List<Cita> tmpcita = new ArrayList<>();
                    System.out.println(citacon.getTablaCitas(tmpcita));
                    break;
                case 3:
                    System.out.println("***** BUSQUEDA DE CITAS ***** ");
                    System.out.println("Ingrese el DNI del paciente:");
                    String dni_search = scanner.next(); // Limpiar el buffer del scanner
                    Paciente pacient = new Paciente();
                    pacient.setDni(dni_search);
                    List<Cita> ls_citas = citacon.buscarCitasPorPaciente(pacient);
                    if(!ls_citas.isEmpty())
                    {
                        System.out.println(citacon.getTablaCitas(ls_citas));
                    }else{
                        System.out.println("*====* Cita no encontrada*====*\n");
                    }
                    break;
                case 4:
                    System.out.println("Gracias por utilizar el sistema de citas de la clínica Vitalis. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion != 4);


    
    }
    
}
