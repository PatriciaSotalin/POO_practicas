
package jerarquiaproduccion;
//Datos heredados de la primera clase producto
public class Ofertado extends Producto  {
    ////Declaramos la varibles para identificar los dias 
    int dias;
    //crearemos contructores
    //heredan la clase padre
    public Ofertado(String nombre, int precio, int dias){
        super(nombre,precio);
        this.dias=dias;    
    }  
    //crearemos un metodo de obtener precio 
    //aplicaremos descuento 
    //cantidad de dias pasados
   @Override
public double obtenerPrecioPedido(int unidadespedida) {
	double precioFinal = super.obtenerPrecioPedido(unidadespedida);
//usamos un condicional if para presentar los 3 casos
	if(dias==1) {
		precioFinal*=0.2;
		System.out.println("se le a aplicado un descuento del 20%");
	}else if(dias==2) {
		precioFinal*=0.15;
		System.out.println("se le a aplicado un descuento del 15%");
	}else if(dias>3) {
		precioFinal*=0.1;
	    System.out.println("se le a aplicado un descunto del 10%");
	}
	//regresa el precio final sin presentar ningun tipo de descuento
	return precioFinal;
		
}
}
    


