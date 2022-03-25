class RegisteredUser {
    String Username;
    String Mail;
    String password;
    int points;
    public void readBillboard(String Username, String Mail,String password, int points ) {
        this.Username = Username;
        this.Mail = Mail;
        this.password = password;
        this.points = points;
    }
    public void writeBillboard() {
        System.out.println("estos son los datos del usuario");
        String dato1 = "el nombre del usuario: " + Username;
        String dato2 = "el mail del usario es: " + Mail;
        String dato3 = "su contraseña es: " + password;
        int dato4 = "el usuario tiene un total de puntos de: " + points;
    }
    public void runBillboard() {
        System.out.println(dato1);
        System.out.println(dato2);
        System.out.println(dato3);
        System.out.println(dato4);
    }
    public int earnpoints() {
        points += 10;
        System.out.print("el usuario a aumentado sus puntos");
        System.out.print(" ahora tiene " + points + "puntos");
    }
}
