import java.util.Scanner;
public class AlumnoNota {


    public static void main(String[] args) {
        int nota1,nota2,nota3,suma,prom;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese nota 1");
        nota1 = sc.nextInt();
        System.out.println("Ingrese nota 2");
        nota2 = sc.nextInt();
        System.out.println("Ingrese nota 3");
        nota3 = sc.nextInt();
        
        suma=nota1+nota2+nota3;
        prom=suma/3;
        
        if(prom>=7){
            System.out.println("El alumno promociona con " + prom);
        }
        else if(prom<7 && prom>=4){
            System.out.println("El alumno aprueba " + prom);
        }
        else if(prom<7 && prom>=4){
            System.out.println("El alumno aprueba " + prom);
        }
        
    }
    
}
}
