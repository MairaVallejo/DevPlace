import java.util.Scanner;
public class Ejercicio{
    public static void main(String args[]){
        //Mostrar porpantalla un menu con 3 opciones y salir a la 4
        Scanner sn= new Scanner(System.in);
        Boolean salir = false;
        int opcion;

        while(  !salir ){
            System.out.println("Menu......");
            System.out.println("1 Action");
            System.out.println("2 Action");
            System.out.println("3 Action");
            System.out.println("4 Action");

            opcion= sn.nextInt();

            switch(opcion){
                default:
                System.out.println("Ingrese una opcion ente 1-4");
                
            }

        }

    }
}