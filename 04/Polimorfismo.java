// clase padre
// cada metodo ejecuta algo distinto, sobrecarga
// creando un objeto de cada clase puedo acceder a cada metodo

public class Polimorfismo {
    public void makeSound() {
        System.out.println("Action");
    }
}
//Main 
    public static void main(String[]args)   {
        Polimorfismo a = new Cars();
        Polimorfismo b = new Moto();
        a.makeSound();
        b.makeSound();
    }

//clases hijas
public class Cars extends Polimorfismo  {
    public void makeSound() {
        System.out.println("cars");
    }
}
public class Moto extends Polimorfismo  {
     public void makeSound() {
        System.out.println("Moto");
    }
}


