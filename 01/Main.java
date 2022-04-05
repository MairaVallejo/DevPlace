import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        public int lado1,lado2,lado3;
        Scanner triangulo= new Scanner(System.in);
        System.out.println("Ingrese el valor del primer lado");
        lado1 = triangulo.nextInt();
        System.out.println("Ingrese el valor del segundo lado");
        lado2 = triangulo.nextInt();
        System.out.println("Ingrese el valor del tercer lado");
        lado3 = triangulo.nextInt();

        
        System.out.println("Ingrese un numero");
        Scanner num= new Scanner(System.in);
        NumPrimo primo= new NumPrimo(num);

        if(primo.soyPrimo()== true){
            System.out.println("El numero" + num + "Es primo");
        }
        else{
            System.out.println("El numero" + num + "NO es primo");
        }
    }
}


