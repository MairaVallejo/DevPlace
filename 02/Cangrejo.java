public class Cangrejo implements Alimentable {
    public double cantIngerida;
    public double cantMejillones;
    public double cantReciduo;
    @Override
    public double cantidadDeReciduoIngerido() {
        
        return this.cantReciduo= this.cantIngerida - this.cantMejillones;
    }
    
}
