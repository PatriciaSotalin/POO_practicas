/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemagestionhorario;

/**
 *
 * @author USER
 */
public class Asignatura {
    private String nombre;
    private String horario;
    private Laboratorio lab;

    public Asignatura(String nombre, String horario, Laboratorio laboratorio) {
        this.nombre = nombre;
        this.horario = horario;
        this.lab = laboratorio;
    }
}