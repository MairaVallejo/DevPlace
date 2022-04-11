
 // 3) SI UNA clase a es de un subtipo de b deberiamos poder remplazzar b por a sin problema, sin afectar el comportamiento del programa
interface Car {
    void acelerar();
    void top();
}
public class PrincipioTres implements Car {
   
    @Override
    public void acelerar() {    }
    @Override
    public void top() {    }
}

public class CarElect implements Car{
    @Override
    public void acelerar() {    }
    @Override
    public void top() {    }

    public boolean verificar()  {return true;}
}
public class CarDrive   {
    public static void main(String[]args)   {
        // declaramos el acceso a los metodos
        Car car;
        String CardType= args[0];
        if("PrincipioTres"== CardType)  {
            car= new PrincipioTres();
        }
        else if("CarElect"== CardType)  {
            car= new CarElect();
            
        }
        else{} 
        car.acelerar();
        // si quiero acceder al metodo del carro electrico verificar()  no me dejaria 
        // es una variabble del tipo interfaz y solo puede acceder a esos metodos declarados en la interface 

    }
}