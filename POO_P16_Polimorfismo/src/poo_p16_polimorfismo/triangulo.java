/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_p16_polimorfismo;

/**
 *
 * @author USER
 */
public class triangulo extends Figura{
    private int base;
    private int altura;
    
    public triangulo(int base, int altura,String color) {
        super(color);
        this.base=base;
        this.altura=altura;
    }

    @Override
    public double superficie() {
        return base*altura/2;
                
    }
    
}
