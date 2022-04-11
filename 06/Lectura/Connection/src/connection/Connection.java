package connection;
public class Connection {

    

//    SINGLETONE
//    private static Conexion conexion;
//    
//    private Conexion(){
//    }
//    
//
//    public static Conexion getConexion(){
//        if(conexion == null){
//            return new Conexion();
//        }
//        return conexion;
//    }
//    
    
    private IConnectionStrategy strategy;
    
    public Connection(IConnectionStrategy strategy){
        this.strategy = strategy;
    }
    
    public String conectarBaseDeDatos(String nombre){
        return strategy.conectarBaseDeDatos(nombre);
    }
    
    public String desconectarBaseDeDatos(){
        return strategy.desconectarBaseDeDatos();
    }
    
    public void cambiarConnection(IConnectionStrategy strategy){
        this.strategy = strategy;
    }
}
