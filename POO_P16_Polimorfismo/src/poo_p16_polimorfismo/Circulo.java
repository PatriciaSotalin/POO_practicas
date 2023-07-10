/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_p16_polimorfismo;

/**
 *
 * @author USER
 */
public class Circulo extends Figura {
    private int radio;
    
    public Circulo(int radio,String color) {
        super(color);
        this.radio=radio;
    }

    @Override
    public double superficie() {
       return Math.PI*radio;
    }
    
}
