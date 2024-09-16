/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.libro;

/**
 *
 * @author andre
 */
public class Libro {

    private String nombre;
    private List<Autor> autores;

    // Constructor solo con el nombre del libro
    public Libro(String nombre) {
        this.nombre = nombre;
    }

    // Constructor con el nombre del libro y la lista de autores
    public Libro(String nombre, List<Autor> autores) {
        this.nombre = nombre;
        this.autores = autores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    @Override
    public String toString() {
        return "Libro: " + nombre + " | Autores: " + autores;
    }
}
