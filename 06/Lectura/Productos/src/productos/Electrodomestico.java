package productos;
public class Electrodomestico extends Producto {
    private int diasDeGarantia;
    
    public Electrodomestico(){
        
    }
    
    public Electrodomestico(String nombre, int id, double precio, int diasDeGarantia) {
        super(nombre, id, precio);
        this.diasDeGarantia = diasDeGarantia;
    }

}
