package academia;

import java.util.ArrayList;

public class Estudiantes extends Persona{
    public ArrayList<Cursos> listaCursos ;

    public Estudiantes(String curso , String nombre, String apellido, int Dni, String estadoCivil) {
        super(nombre, apellido, Dni, estadoCivil);
        this.listaCursos = new ArrayList<Cursos>();
    }
    
    public String matriculacion( curso)   {
        
    }
    

    
    
    
}
