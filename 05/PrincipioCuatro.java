// 4) no debe estar la clase obligada a dependr de los metodos que no se utilizan
public interface PrincipioCuatro {
    String getTipo();
}
public interface vista  {
    int getOpciones();
}
public class Opciones implements PrincipioCuatro    {
    @Override
    public String getTipo() {return "mesa";}
}
// si no necesito emplementar las dos intrfaces no las agrego
public class Twopciones implements PrincipioCuatro, vista  {
    // se sobre escribe los metodos de las interfaces que se quieren usar Y LOS Q VA A UTILIZAR, SOLO ESO
    @Override
    public String getTipo() {return "mesa";}
    @Override
    public String getOpciones() {return 12;}
} 