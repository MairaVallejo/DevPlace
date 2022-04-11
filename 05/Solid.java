// principios solid 
// 1. principios de 
// 2)todas las clases modulos interfaces eberian estar abiertas para extenderse pero cerrados para modificarce
// 3) SI UNA clase a es de un subtipo de b deberiamos poder remplazzar b por a sin problema
// 4) no debe estar la clase obligada a dependr de los metodos que no se utiliza
// 5)no debe existir dependencia entre los modulos, aquelos de bajo NIVEl y alto nivel 
//ejemplo de responsabilidad unica
public class UserLogin  {
    private final Database db;
    UserLogin(Database db)  {
        this.db= db;
    }
    void login(String username, String pass)    {
        User user= db.findUserByUsername(username);
        if(user==null)  {

        }
        else{

        }
    }
    // EL VOID EMAIL DEBERIA ESTAE EN OTRA CLASE 

}
public class EmailSender    {
    void sendEmail(User user, String mensage)   {

    }
}