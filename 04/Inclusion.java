// para redifinir metodos en otras clases
abstract class Inclusion {
    //metodo declarado de forma abstracta
    public abstract void calculo(int x, int y);
}
public class Calculos extends Inclusion {
    @Override
    public void calculo(int x, int y)   {

    }
}