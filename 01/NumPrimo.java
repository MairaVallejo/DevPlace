import java.util.Scanner;
public class NumPrimo {

    public int numero;

    public int Primo(int numero){
        this.numero= numero;
    }
    public boolean soyPrimo(int numero){
        if(numero == 0 || numero ==1 || numero ==4){
            return false;
        }
        for(int i=2; i<numero; i++){
            if(n%i==0){
                return false;
            }
            return true;
        }
    }
}
