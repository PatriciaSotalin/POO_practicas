package Administracion;
import java.util.Scanner;
public class Docente extends Personal {
	private static final int Asignatura = 0;
	//Atributos
		private String asignatura;
		
		
		public Docente(String nombre, int edad, String dirreccion, String telefono) {
			super(nombre,edad,dirreccion,telefono);
			this.asignatura=asignatura;
			
		}


		public String getAsignatura() {
			return asignatura;
		}


		public void setAsignatura(String asignatura) {
			this.asignatura = asignatura;
		}


		@Override
		public double calcularPago() {
			Scanner scanner=new Scanner(System.in);
			int i;
			String cantidadAsignatura;
			
			System.out.println("Bienvenidos al area de Docente");
			System.out.println("Elija su opcion");
			//String cantidadAsignatura;
			for(int=0;i<Asignatura;i++) {
				System.out.println("Ingresar los datos de asignatura #"+(i+1));
				System.out.print("Nombre de la Asignatura");
				String nombre= scanner.nextLine();
				System.out.print("Horario de la  Asignatura");
				String horario= scanner.nextLine();
				
			}
			
			return 0;
		}
		
           
}
