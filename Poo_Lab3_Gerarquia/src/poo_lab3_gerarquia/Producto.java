/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_lab3_gerarquia;
//clase Padre
//Ingresar datos del producto
public class Producto {
    private String nombre;
    private String seccion;
    private double precio;
    private double dias;
    public Producto(String nombre, double precio) {
        //utilizamos seccion 
        this.nombre = nombre;
        this.precio = precio;
        this.seccion = seccion;
    }
       public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
   public void setDias(int dias) {
        this.dias = dias;
    }

    @Override
    public double Precio(int unidadesPedidas) {
        
       
if (dias == 1) {
            return super.Precio(unidadesPedidas) * 0.8;
        } else if (dias == 2 || dias == 3) {
            super.Precio(unidadesPedidas) * 0.85;
            return 
        } else {
            super.Precio(unidadesPedidas) * 0.9;
            return 
        }
    }
}


