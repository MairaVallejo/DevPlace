
public class Triangulo {
    public int l1,l2,l3;

    public Triangulo(int l1, int l2,int l3){
        this.l1= l1;
        this.l2= l2;
        this.l3= l3;
    }
    public void quienSoy(){
        if(l1== l2 || l1==l3 || l2==l3){
            System.out.println("Triangulo Isoseles");
        }
        else if(l1 ==l2 && l1==l3){
            System.out.println("Triangulo equilatero");

        }
        else{
            System.out.println("Triangulo escaleno");
        }
    }



}