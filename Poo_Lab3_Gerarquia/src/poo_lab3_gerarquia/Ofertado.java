/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_lab3_gerarquia;

public class Ofertado extends Producto {
    //clase hija 
   private int dias;
//Dar datos de ofertado
    public Ofertado(String nombre, double precio, int dias) {
        super(nombre, precio);
        this.dias = dias;
    }
//se utiliza el dia 
    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
    
    

}