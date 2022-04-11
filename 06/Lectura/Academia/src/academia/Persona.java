package academia;

public class Persona {
    private String nombre;
    private String apellido;
    private int Dni;
    private  String estadoCivil;

    public Persona(String nombre ,String  apellido ,int  Dni ,String estadoCivil ) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Dni = Dni;
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    //Metodos 
    public String cambiarEstadoCivil(String estadoCivil) {
        this.estadoCivil= estadoCivil;
    }
    
            
    }
    

