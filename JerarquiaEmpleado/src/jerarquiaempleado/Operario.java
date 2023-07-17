
package jerarquiaempleado;
import java.time.LocalDate;

public class Operario extends Empleado {
    
       int nivel; 
   public Operario(String nombre, int edad, LocalDate fechaingreso, double salario, int nivel){
       super(nombre, edad, fechaingreso, salario);
       this.nivel=nivel;       
   }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
   
    @Override
    public void incetivar() {
        if (edad > 30 && nivel > 2) {
            salario += 2 * bono;
        } else if (edad > 30 || nivel > 2) {
            salario += bono;
        }
        
    }
    
    public void actualizarNivel(){
        if (fechaingreso.getYear() > 2 && nivel < 5) {
            nivel++;
        }
        
    }
    
}