import java.util.Arrays;
import java.util.Scanner;
public class CalculoArray {
    public static void main(String args[]){
        int miArreglo[], mayor, menor;
        miArreglo= new int[10];
        
        Scanner sn= new Scanner(System.in);
        for(int i=0; i<miArreglo.length; i++){
            System.out.println("Ingrese el valor" + (i+1) );
            miArreglo[i]= sn.nextInt();
        }
        mayor= miArreglo[0];
        menor= miArreglo[0];
        Arrays.sort(miArreglo);
        for(int i=0; i<miArreglo.length; i++){
            if(miArreglo[i]>mayor){
                mayor= miArreglo[i];
            }
            if(miArreglo[i]<menor){
                menor= miArreglo[i];
            }
            //Mostrar los numeros ordenados de forma ascendente
            System.out.println(" " + miArreglo[i]);
        }
        //Mostrar numeros Pares
        System.out.println("Numeros Pares:");
        for(int i=0; i<miArreglo.length; i++){
            if(miArreglo[i]%2==0){
                
                System.out.println(miArreglo[i]);
            }
        }
        //Mostrar numeros impares
        System.out.println("Numeros impares:");
        for(int i=0; i<miArreglo.length; i++){
            if(miArreglo[i]%2!=0){
                System.out.println(miArreglo[i]);
            }
        }        
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
        //Mostrar los numeros ordenados de forma descendente
        for(int i=miArreglo.length-1; i>=0;i--){
            System.out.println(" " + miArreglo[i]);
        }
    }
}
