import java.util.Scanner;
public class NumeroMenor {
    public static void main(String args[]){
        float num1,num2,num3, menor;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese el valor 1");
        num1= teclado.nextFloat();
        System.out.println("Ingrese el valor 2");
        num2= teclado.nextFloat();
        System.out.println("Ingrese el valor 3");
        num3= teclado.nextFloat();

        menor= num1;
        if(num1<num2 && num1<num3){
            menor= num1;
        }
        else {
            if(num2<num1 && num2< num3){
                menor= num2;
            }
            else{
                menor = num3;
            }
        }
        System.out.println("Valor menor" + menor);
}}
