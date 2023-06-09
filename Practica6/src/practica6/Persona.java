/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica6;
public class Persona {
    private  String nombre;
    private String telefono;
    private String email;
    Persona (String nombre,String telfono , String email){
        this.nombre=nombre;
        this.telefono=telefono;
        this.email=email;
       
    }
    
    public String getNombre(){
        return nombre;
        
    }
    
    public void etNombre(String nombre){
        this.nombre=nombre;
    }
}
