package examen;

public class datosEstudiante {
	String[] nombre = new String[10];
	int cedula = new int[10];
	
	
	do{
	System.out.println("Registro de Alumno");
	System.out.println("Seleccione una opción:");
	System.out.println("1 - Registro");
	System.out.println("2 - Consultar");
	System.out.println("3 - Modificar");
	resp1 = s.nextInt();
		}while(resp1<1||resp1>3);
	
	if(resp1==1){
		if(x==10){
			System.out.println("Máximo de alumnos registrados");
		}
	}
