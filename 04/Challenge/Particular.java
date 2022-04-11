public class Particular extends Vehiculo {
    public Particular(String matricula,double velocidad, int puertas){
        super(matricula,velocidad, puertas);
    }
    @Override
	public String toString() {
		return "Particular [puertas=" + puertas + ", velocidad=" + getVelocidad() + ", matricula="
				+ getMatricula() + "]";
	}
}
