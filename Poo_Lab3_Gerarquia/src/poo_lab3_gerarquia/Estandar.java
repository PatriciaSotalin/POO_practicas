/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_lab3_gerarquia;
//clase hija
public class Estandar extends Producto {
     private String seccion;

    public Estandar(String nombre, double precio, String seccion) {
        super(nombre, precio);
        this.seccion = seccion;
    }
     @Override
     public String getSeccion() {
        return seccion;
    }