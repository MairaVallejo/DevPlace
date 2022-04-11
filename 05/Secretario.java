public class Secretario extends Empleado{
    private String despacho;
    private int fax;


    public Secretario(String nombre,String apellidos,double dni,String direccion,int telefono,double salario,String despacho,int fax)    {
        super(nombre,apellidos,dni,direccion,telefono,salario);
        this.despacho= despacho;
        this.fax= fax;
    }
    

}
