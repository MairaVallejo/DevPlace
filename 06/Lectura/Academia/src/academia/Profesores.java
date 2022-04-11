
package academia;

public class Profesores extends Empleados{
    public String Departamento;

    public Profesores(String Departamento, String fechaIngreso, int nroDespacho, String nombre, String apellido, int Dni, String estadoCivil) {
        super(fechaIngreso, nroDespacho, nombre, apellido, Dni, estadoCivil);
        this.Departamento = Departamento;
    }
    
}
