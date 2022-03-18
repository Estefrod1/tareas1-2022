import java.util.Scanner;


public class impares {
    public static void main(String[] args) {
        Scanner text = new Scanner (System.in);
        System.out.println("dame un numero");
        int a;
        a = text.nextInt();
        int b = -1;
        int suma = 0;
        String cadena = "";
        for (int i = 0; i < a; i++) {
            b = b + 2;
            suma = suma + b;
            char d = (char) (b + '0');
            cadena = cadena + d + "+";
        }
        System.out.println(cadena + "=" + suma);
    }
}
