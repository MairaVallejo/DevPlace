public class PrincipioDos {
    void acelerar() {

    }
    void stop() {

    }
}
public class Vehiculo extends PrincipioDos  {
    @Override
    void acelerar() {
        super.acelerar();// no es neceario el super perose pone para indicar que se modifica el comportamiento del metodo
    }
    // cuando se sobre escribe el metodo se modifica el metodo en donde se sobreescribe, jamas en la clase padre
    //
}
public class Vehiculo extends PrincipioDos  {
    @Override
    void acelerar() {
        super.acelerar();// no es neceario el super perose pone para indicar que se modifica el comportamiento del metodo
    }
    // cuando se llama con un objeto a un metodo de clase hija este accede a el metodo sobre escrito, en cambio si no lo llega a encontrar... lo va a buscar a la clase padre
    
}
