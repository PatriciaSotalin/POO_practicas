/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jerarquiaproduccion;

public class Estandar extends Producto {
    //donde los datos herdados de la clase padre es producto
    //seccion donde entrontrar el producto
    String seccion;
    //creamos constructores 
    //junto a las variables heredadas del padre
    public Estandar(String nombre, int precio,String seccion ){
        super(nombre,precio);
        this.seccion=seccion;
        
    }
    
    //crearemos un metodo para obtener el precio donde aplicaremos descuento
  public double obtenerPrecioPedido(int unidadespedida) {
		double precioFinal = super.obtenerPrecioPedido(unidadespedida);
		if(this.precio>=5){
			precioFinal*=0.1;
			System.out.println("se le a aplicado un descuento del 10%");
		}
		return precioFinal;
		}
	}
