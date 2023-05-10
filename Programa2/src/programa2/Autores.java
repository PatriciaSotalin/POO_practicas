/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa2;
import java.util.Scanner;
/**
 *
 * @author ESPE
 */
public class Autores {
    private String ci;
    private String nombreCompleto;
    private String correo;
    private String FechaIngreso;
    private int CantidadP;
    private int opcion;
    private int num1;
    Scanner leer=new Scanner(System.in);
    
    public void info1(){
        System.out.println("Ingrese la opcion que decee");
        System.out.println("1. Registrarse");
        opcion=leer.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Ingrese cuantos autores se van a registrar");
                      Metodos array1[]= new Metodos[num1];
                System.out.println("Ingrese su cedula(si es extrangero ingrese su pasaporte)");
                ci=leer.next();
                leer.nextLine();
                System.out.println("Ingrese su nombre completo");
                nombreCompleto=leer.next();
                leer.nextLine();
                System.out.println("Ingrese su correo");
                correo=leer.next();
                leer.nextLine();
                System.out.println("Ingrese su fecha en la cual ingreso");
                FechaIngreso=leer.next();
                leer.nextLine();
                break;
            default:
                System.out.println("Ingrese una opcion correcta");
            info1();
        }
    }
    public int getCantidadP() {
        return CantidadP;
    }

    public void setCantidadP(int CantidadP) {
        this.CantidadP = CantidadP;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(String FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }
}
