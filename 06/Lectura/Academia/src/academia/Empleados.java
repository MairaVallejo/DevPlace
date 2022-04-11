package academia;

public class Empleados extends Persona{
    public String fechaIngreso;
    public int nroDespacho;

    public Empleados(String fechaIngreso, int nroDespacho, String nombre, String apellido, int Dni, String estadoCivil) {
        super(nombre, apellido, Dni, estadoCivil);
        this.fechaIngreso = fechaIngreso;
        this.nroDespacho = nroDespacho;
    }
    public int cambiarDespacho(int nroDespacho) {
        this.nroDespacho= nroDespacho;
    } 
}
