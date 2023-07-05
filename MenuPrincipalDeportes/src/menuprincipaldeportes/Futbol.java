/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menuprincipaldeportes;


public  class Futbol extends Deporte {
    private int jugadores;

    public Futbol(String nombre, String descripcion, int jugadores) {
        super(nombre, descripcion);
        this.jugadores = jugadores;
    }

    public int getJugadores() {
        return jugadores;
    }
}
