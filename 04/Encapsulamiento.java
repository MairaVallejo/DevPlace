public class Encapsulamiento{
    private int tipo;
// set modifica el valor de la variable 
    public void setTipo(int t){
        tipo= t;
    }           
// get retorna el valor de la variable
    public int getTipo(){
        return this.tipo;
}   
}

public class Acceso {

    public static void main(String[]args)   {
        Encapsulamiento sn= new Encapsulamiento();
        sn.tipo= 3;
    }
}