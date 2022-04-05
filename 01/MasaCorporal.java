import java.util.Scanner;
public class MasaCorporal {
    public static void main(String args[]){
        float peso, altura;
        float indiceMc;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese su Peso");
        peso= teclado.nextFloat();
        //scanner.close();
        System.out.println("Ingrese su Altura");
        altura= teclado.nextFloat();
        //scanner.close();
        indiceMc= peso / altura;
        System.out.println("Diagnostigo: ");

        if(indiceMc <20){
            System.out.println("Mal Estado");
        }    
        if(indiceMc >=20 && indiceMc<22){
            System.out.println("Bajo de peso");
        }
            if(indiceMc >=22 && indiceMc <25){
                System.out.println("Peso normal");
            }
            if(indiceMc >=25 && indiceMc<30){
                System.out.println("Sobrepeso");
            }
            if(indiceMc >=30 && indiceMc<40){
                System.out.println("Sobrepeso cronico");
            }
            if(indiceMc > 40){
                System.out.println("Hospitalizado");
            }

        
    }
}
