import java.util.Scanner;
public class NumeroMayor {
    public static void main(String args[]){
        float num1,num2,num3, mayor;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese el valor 1");
        num1= teclado.nextFloat();
        System.out.println("Ingrese el valor 2");
        num2= teclado.nextFloat();
        System.out.println("Ingrese el valor 3");
        num3= teclado.nextFloat();

        mayor= num1;
        if(num1>num2 && num1>num3){
            mayor= num1;
        }
        else {
            if(num2>num1 && num2> num3){
                mayor= num2;
            }
            else{
                mayor = num3;
            }
        }
        System.out.println("Valor mayor" + mayor);
}}
