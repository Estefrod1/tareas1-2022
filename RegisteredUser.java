package proyectofinal;

/**
 *
 * @author estefania
 */
public class RegisteredUser {

    private static int runBillboard() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    String Username;
    String Mail;
    String password;
    int points;
    public RegisteredUser(String Username, String Mail,String password, int points ) {
        this.Username = Username;
        this.Mail = Mail;
        this.password = password;
        this.points = points;
    }
    public void readBillboard() {
        String dato1 = "el nombre del usuario: " + Username;
        String dato2 = "el mail del usario es: " + Mail;
        String dato3 = "su contraseña es: " + password;
    }
    public void runBillboard(String dato1, String dato2, String dato3, String dato4) {
        System.out.println("estos son los datos del usuario");

        System.out.println(dato1);
        System.out.println(dato2);
        System.out.println(dato3);
        System.out.println(dato4);
    }
    public int earnpoints(int points) {
        points += 10;
        return points;
    }
    public int writeBillboard() {
        return RegisteredUser.runBillboard();
    }

}
