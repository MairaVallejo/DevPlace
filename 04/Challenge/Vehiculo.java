public class Vehiculo{
    String matricula;
    double velocidad;
    int puertas;

    public Vehiculo( String matricula,double velocidad, int puertas) {
        this.matricula= matricula;
        this.velocidad= velocidad;
        this.puertas= puertas;
    }
    // set modifica el valor de la variable 
    public void setMatricula(String matricula){
        this.matricula= matricula;
    }           
    // get retorna el valor de la variable
    public String getMatricula(){
        return this.matricula;
    }   
    public void setVelocidad(double velocidad){
        this.velocidad= velocidad;
    }           
    // get retorna el valor de la variable
    public double getVelocidad(){
        return this.velocidad;
    }  
    public void setPuertas(int puertas){
        this.puertas= puertas;
    }           
    
    public int getPuertas(){
        return this.puertas;
    } 
    
    @Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", velocidad=" + velocidad + "]";
	}
}


