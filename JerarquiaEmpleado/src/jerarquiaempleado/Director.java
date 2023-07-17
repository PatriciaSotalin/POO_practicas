
package jerarquiaempleado;
import java.time.LocalDate;

public class Director extends Empleado{
    
    String departamento;
    int personal;
    
    public Director(String nombre, int edad, LocalDate fechaingreso, double  salario, String departamento, int personal) {
        super(nombre, edad, fechaingreso, salario);
        this.departamento=departamento;
        this.personal=personal;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getPersonal() {
        return personal;
    }

    public void setPersonal(int personal) {
        this.personal = personal;
    }
    
    

    @Override
    public void incetivar() {
        int mesesTranscurridos = (int) getFechaingreso().until(LocalDate.now()).toTotalMonths();
        if (mesesTranscurridos > 30 && personal > 20) {
            setSalario(getSalario() + 2 * bono);
        } else if (mesesTranscurridos <= 30 || personal <= 20) {
            setSalario(getSalario() + bono);
        }
    }
}