import java.util.Scanner;
public class Calculadora {
    public static void main(String args[]){
        Scanner sn= new Scanner(System.in);
        Scanner n1= new Scanner(System.in);
        Scanner n2= new Scanner(System.in);
        
        Boolean bandera = false;
        int opcion,num1,num2,suma,resta, multi;
        double div;
        System.out.println("Ingrese dos valores");
        System.out.println("Primer numero");
        num1= n1.nextInt();
        System.out.println("Segundo numero");
        num2= n2.nextInt();

        while(  !bandera ){
            System.out.println("Elija la operacion");
            System.out.println("1 Suma");
            System.out.println("2 Resta");
            System.out.println("3 Multiplicacion");
            System.out.println("4 Division");
            System.out.println("5 Salir");

            opcion= sn.nextInt();

            switch(opcion){
                default:
                System.out.println("Ingrese un valor");
                break;
                case 1:
                    suma= num1 + num2;
                    System.out.println("Valor de la Suma ente ambos es: " + suma);
                break;
                case 2:
                    resta= num1 - num2;
                    System.out.println("Valor de la Resta ente ambos es: " + resta);
                break;
                case 3:
                    multi= num1 * num2;
                    System.out.println("Valor de la Multiplicacion ente ambos es: " + multi);
                break;
                case 4:
                    div= num1 / num2;
                    System.out.println("Valor de la Division ente ambos es: " + div);
                break;
                case 5:
                    bandera= true;
                break;
            }

        }

    }
}
