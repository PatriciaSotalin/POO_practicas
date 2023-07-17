package jerarquiaproduccion;
public class Producto {
   //Declaramos un atributo 
        String nombre;
        int precio;
        //Crearemos los constructores
       public Producto(String nombre, int precio) {
        this.precio=precio;
        this.nombre=nombre;
        //creamos metodos get 
        //Presentacio de datos de pedido
    }
       public String getNombre() {
		return nombre;
	}
       //mostrar dato de pedido 
       public double getPrecio(){
         return precio;
         
        }
       public void setPrecio(){
           this.precio=precio;
           
       }
       //se crea un metodo para hacer una multiplicacion para el pedido
      public double obtenerPrecioPedido(int unidadespedida) {
		return unidadespedida*precio;
		
	}
    }
