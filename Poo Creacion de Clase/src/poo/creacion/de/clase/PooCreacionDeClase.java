package poo.creacion.de.clase;
public class PooCreacionDeClase {
    public static void main(String[] args) {
        Hospital javi = new Hospital();
        javi.edad =20;
        javi.especialidad = "medicina";
        javi.nombre = "luis";
        javi.turno = 10;
        System.out.println(javi.edad);
        System.out.println(javi.especialidad);
        System.out.println(javi.nombre);
        System.out.println(javi.turno);
    }
    
}
