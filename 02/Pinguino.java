public class Pinguino implements Alimentable {
    public double cantIngerida;
    public double cantCrustaceos;
    public double cantReciduo;
    @Override
    public double cantidadDeReciduoIngerido() {
        
        return this.cantReciduo= this.cantIngerida - this.cantCrustaceos;
    }
    
}
