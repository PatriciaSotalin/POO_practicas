package Administracion;

public class Tecnico extends Personal {
	
	private String ocupacion;
	 
	public Tecnico (String nombre, int edad, String dirreccion, String telefono) {
		 super(nombre,edad,dirreccion,telefono);
		 this.ocupacion=ocupacion;
	}

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}
	
	//@Override
			public double calcularPago() {
				System.out.println("Bienvenidos al area de Tenico");
				System.out.println("Elija su opcion");
				return 0;
			}
	      
	 }
	


