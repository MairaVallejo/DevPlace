//ejemplo de aplicacion de interfaces 
public class Interface {
    int id= 0;
    double valor= 0.1;
}
public interface InterfaceFunciones {
    void asignacion(int x);
}
public class Factura implements Interface, InterfaceFunciones      {
    public void asignacion(int x)   {
        this.id=10;
        this.valor=100;
    }
}
