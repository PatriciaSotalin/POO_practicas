/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_p16_polimorfismo;

/**
 *
 * @author USER
 */
public class POO_P16_Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //llamamos si metodo mostrar 
        mostrarDatosFigura(new triangulo(4,5," Amarillo"));
        mostrarDatosFigura(new Circulo(4," Rojo"));
        mostrarDatosFigura(new Cuadrado(4,"Verde"));
       
    }
    //aplicamos polimorfismo
    //la gran ventaja del polimofirmos es la reutilizacion
    //de cogigo si forzar  a tosas las clses a tener el mismo 
    //esta expresion vale para cualquier subclase de figura
    //cuyos objetos venga aqui como parametros 
    private static void mostrarDatosFigura(Figura f){
        System.out.println("Color " +f.getColor());
        System.out .println("Superficie " +f.superficie());
    }
}
