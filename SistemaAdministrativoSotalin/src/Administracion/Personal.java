package Administracion;

public abstract class Personal {
	
	      //utilizaremos metodos 
         private String nombre;
         private int edad;
         private String dirreccion;
         private String telefono;
         private String ocupacion;
         
         //Utilizamos el constructor
         public Personal (String nombre, int edad, String dirreccion, String telefono ) {
        	 this.nombre=nombre;
        	 this.edad=edad;
        	 this.dirreccion=dirreccion;
        	 this.telefono=telefono; 
         }

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public String getDirreccion() {
			return dirreccion;
		}

		public void setDirreccion(String dirreccion) {
			this.dirreccion = dirreccion;
		}

		public String  getTelefono() {
			return telefono;
		}

		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}

		public String getOcupacion() {
			return ocupacion;
		}

		public void setOcupacion(String ocupacion) {
			this.ocupacion = ocupacion;
		}
         //constructir
       public abstract double calcularPago();
    	
         
         
}
