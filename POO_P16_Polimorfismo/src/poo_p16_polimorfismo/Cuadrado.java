/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_p16_polimorfismo;

public class Cuadrado extends Figura  {
    private int lado;

    public Cuadrado(int lado ,String color) {
        super(color);
        this.lado=lado;
    }

    @Override
    public double superficie() {
        return lado*lado;
    }
    
}
