public class Parametrico {
    public static void main(String[]args)   {
        Suma sm = new Suma();
        double result;
        sm.sumar(3);
        result= sm.sumar(6.3);
        sm.sumar(6, 3);
        System.out.println("Resultado: " + result);
    }
}
//metodos con el mismo nombre pero son diferentes parametros
public class Suma {
    void sumar(int a, int b){
        System.out.println("suma" + (a+b));
    }
    double sumar(double a){
        System.out.println("valor" + a);
        return a;
    }
    void sumar(int a){
        System.out.println("Un solo parametro" + a);
    }
}
