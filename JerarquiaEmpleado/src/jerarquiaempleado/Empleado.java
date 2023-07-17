
package jerarquiaempleado;

import java.time.LocalDate;

public abstract class Empleado {
    String nombre;
    int edad;
    LocalDate fechaingreso;
    double  salario;
    static final double bono=100;
    
    public Empleado(String nombre, int edad, LocalDate fechaingreso, double  salario){
        this.nombre=nombre;
        this.edad=edad;
        this.fechaingreso=fechaingreso;
        this.salario=salario;
    }
     public String getNombre() {
        return nombre;
    }
     public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(LocalDate fechaingreso) {
        this.fechaingreso = fechaingreso;
    }
    
    public double  getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public abstract void incetivar();
      
    
}
    
}
