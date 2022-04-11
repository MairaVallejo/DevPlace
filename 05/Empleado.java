public class Empleado {
    private String nombre;
    private String apellidos;
    private double dni;
    private String direccion;
    private int antiguedad;
    private int telefono;
    private double salario;
    // empleado que lo supervisa?
    public Empleado(String nombre,String apellidos,double dni,String direccion,int telefono,double salario){
        this.nombre= nombre;
        this.apellidos= apellidos;
        this.dni= dni;
        this.direccion= direccion;
        this.telefono= telefono;
        this.salario= salario;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre)  {
        this.nombre= nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos)  {
        this.apellidos= apellidos;
    }   
    public double getSalario(){
        return this.salario;
    }  
    public void setSalario(int salario){
        this.salario= salario;
    }  
     
    
    public double getDni() {
        return dni;
    }
    public void setDni(double dni)  {
        this.dni= dni;
    }

   
    
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion)  {
        this.direccion= direccion;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono)  {
        this.telefono= telefono;
    }
    public void cambiarSupervisor()  {}
    public void incrementarSalario()    {}

}
