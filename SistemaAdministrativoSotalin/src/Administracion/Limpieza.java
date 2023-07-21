package Administracion;


public class Limpieza extends Personal{
      
         private  int horaTrabajada;

          public Limpieza(String nombre, int edad, String dirreccion, int telefono) {
        	  super(nombre,edad,dirreccion,telefono);
        	  this.horaTrabajada=horaTrabajada;
        	   		
          }
          
          public int getHoraTrabajada() {
			return horaTrabajada;
		}


		public void setHoraTrabajada(int horaTrabajada) {
			this.horaTrabajada = horaTrabajada;
		}

//metodo abstracto
		//@Override
		public double calcularPago(int precioHora) {
			private int precioHora;
			private int dias;
			System.out.println("Bienvenidos al area de limpieza");
			System.out.println("Elija su opcion");
			if (precioHora>=5) {
				precioHora*=0.12 //Aplicamos por las horas extras trabajadas
						
			} if (dias>3) {
				precioHora*=0.9;
			}
			
			
			return precioHora 0;
		}
      
 }

