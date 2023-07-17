package jerarquiaempleado;
import java.util.Scanner;
import java.time.LocalDate;
public class JerarquiaEmpleado {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int opc;
        do{
            System.out.println("MENU PRINCIPAL");
            System.out.println("1.Director");
            System.out.println("2.Operario");
            System.out.println("3.Salir");
            opc=sc.nextInt();
        switch(opc){
        case 1:
        LocalDate fechaingreso= LocalDate.of(2021, 5, 1);
        
        System.out.println("ingrese el nombre:");
        String nombre=sc.nextLine();
        sc.nextLine();
        System.out.println("ingrese la edad:");
        int edad=sc.nextInt();
        System.out.println("ingrese el salario que gana el director:");
        double salario=sc.nextDouble();
        sc.nextLine();
        System.out.println("ingrese el nombre del departamento");
        String departamento=sc.nextLine();
        System.out.println("ingrese el numero de personal que se encuentra bajo el mande del director");
        int personal=sc.nextInt();
        Director director = new Director(nombre, edad, fechaingreso, salario, departamento, personal);
        System.out.println("El director: " + nombre);
        System.out.println("ingrese la edad del director: " +edad);
        System.out.println("la fecha en la ingreso: "+fechaingreso);
        System.out.println("ingresa el salario: "+salario);
        director.incetivar();
        System.out.println("El nombre del deparatamento al que pertenece: "+departamento);
        System.out.println("Numero de personal que trabajan con el director: "+personal);
        break;
        case 2:
            
                LocalDate fechaingreso1= LocalDate.of(2022, 7, 2);
        
        System.out.println("ingrese el nombre:");
        String nombre1=sc.nextLine();
        System.out.println("ingrese la edad:");
        int edad2=sc.nextInt();
        System.out.println("ingrese el salario que gana el director:");
        double salario3=sc.nextDouble();
        System.out.println("ingrese el nivel al que pertenece el operario");
        int nivel=sc.nextInt();
        
        Operario operario=new Operario(nombre1, edad2, fechaingreso1, salario3, nivel);
              
        System.out.println("El director: " + nombre1);
        System.out.println("ingrese la edad del director: " +edad2);
        System.out.println("la fecha en la ingreso: "+fechaingreso1);
        System.out.println("ingrese el salario: "+salario3);
        operario.incetivar();
        System.out.println("nivel: " +nivel);
        operario.actualizarNivel();
        break;
        case 3:
        System.out.println("A finalizar");
        break;
        default:
        System.out.println("Esta opcion es invalido vuelva a intentar");        
        }         
    }while(opc !=3);           
}    
}
