import java.util.Scanner;
public class PromedioNotas {
    public static void main(String args[]){
        float nota1, nota2,nota3, suma, promedio;

        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese la nota 1");
        nota1= teclado.nextFloat();
        System.out.println("Ingrese la nota 2");
        nota2= teclado.nextFloat();
        System.out.println("Ingrese la nota 3");
        nota3= teclado.nextFloat();
        suma= nota1 + nota2+ nota3;
        //System.out.println(suma);
        promedio= suma/3;
        System.out.println(promedio);
    }
}
