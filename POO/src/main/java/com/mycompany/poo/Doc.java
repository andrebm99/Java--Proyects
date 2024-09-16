/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;


/**
 *
 * @author andre
 */
public class Doc {
    private String nombre;

    private String ApellidoP;

    private String ApellidoM;

    private String nomcmp;

 

    public Doc(String nombre, String ApellidoP, String ApellidoM) {

        this.nombre = nombre;

        this.ApellidoP = ApellidoP;

        this.ApellidoM = ApellidoM;

    }

    public void nombrecompleto(){

        nomcmp = ApellidoP+" "+ApellidoM+", "+nombre;

    }

    public String mostrar(){

        return nomcmp;

    }
}
