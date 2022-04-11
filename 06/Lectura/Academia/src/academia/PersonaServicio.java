package academia;

public class PersonaServicio extends Empleados{
    public String seccion;

    public PersonaServicio(String seccion, String fechaIngreso, int nroDespacho, String nombre, String apellido, int Dni, String estadoCivil) {
        super(fechaIngreso, nroDespacho, nombre, apellido, Dni, estadoCivil);
        this.seccion = seccion;
    }
    
}
