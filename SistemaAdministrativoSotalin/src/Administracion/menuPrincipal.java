package Administracion;
import java.util.Scanner;
import java.time.LocalDate;
public class menuPrincipal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int opc;
		do {
			System.out.println("Bienvenidos a Sistema ADMINISTRATIVO");
			System.out.println("   Elija su opcion  ");
			System.out.println("1. Elegir Docente");
			System.out.println("2. Elija Tecnico");
			System.out.println("3. Elija Limpieza ");
			System.out.println("4. Salir ");
			opc=sc.nextInt();
			switch(opc) {
			case 1:
				System.out.println("Ingrese el nombre");
				String nombre=sc.nextLine();
				System.out.println("Ingresar la edad");
				 int edad =sc.nextInt();
				System.out.println("Ingresar el salario que gana");
				double salario =sc.nextDouble();
				System.out.println("Ingresaer la asignatura  ");
				String asignatura=sc.nextLine();
				
				break;
			case 2:
				System.out.println("Bienvenidos al area de Tecnico ");
				System.out.println("Ingrese el nombre");
				
				break;
			case 3:
				System.out.println("Ingrese al are de limpieza ");
				//String nombre=sc.nextLine();
			    break;
			case 4:
				System.out.println("Puede salir con exito");
				default:
					System.out.println("Los datos son incorrectos ");
				break;
				
			    
				
			
				
			}
			
			
			
		}while (opc !=4);
	
	}
}
		
	