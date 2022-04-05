import java.util.Scanner;

public class Operaciones {

    public static void main(String[] args) {
        int valor1, valor2, op, suma, mul, resta,div;
        Scanner sc = new Scanner(System.in);

        System.out.println("Selecccione la operacion: 1 Suma, 2 Resta, 3 Multiplicacion, 4 Division ");
        op = sc.nextInt();
        System.out.println("Ingrese el primer valor");
        valor1 = sc.nextInt();
        System.out.println("Ingrese el segundo valor");
        valor2 = sc.nextInt();

        switch (op) {
            case 1:
                suma = valor1 + valor2;
                System.out.println("La suma es:" + suma);
                break;
            case 2:
                resta = valor1 - valor2;
                System.out.println("La resta es:" + resta);
                break;
            case 3:
                mul = valor1 * valor2;
                System.out.println("El producto entre ambos es:" + mul);
                break;
            case 4:
                div = valor1 / valor2;
                System.out.println("La division entre ambos es:" + mul);
                break;
            default: System.out.println("Selecccione la operacion: 1 Suma, 2 Resta, 3 Multiplicacion, 4 Division ");
                     break;
        }

    }
}