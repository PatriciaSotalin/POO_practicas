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
public class conferencia {
        Scanner leer = new Scanner(System.in);
    private String id;
    private String nombreR;
    private String tipoR;

    public void info1(){
        System.out.println("Ingrese su id");
                id=leer.next();
                leer.nextLine();
                System.out.println("Ingrese el nombre de la revista o conferencia");
                nombreR=leer.next();
                leer.nextLine();
                System.out.println("Ingrese que tipo de revista o conferencia");
                tipoR=leer.next();
                leer.nextLine();
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreR() {
        return nombreR;
    }

    public void setNombreR(String nombreR) {
        this.nombreR = nombreR;
    }

    public String getTipoR() {
        return tipoR;
    }

    public void setTipoR(String tipoR) {
        this.tipoR = tipoR;
    }
    
}
