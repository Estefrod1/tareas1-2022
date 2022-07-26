package MainApp;

import java.util.Scanner;
public class App {
    Scanner a = new Scanner (System.in);
    int x, y, c, z, d;
    String resultado = "";
    public String resolver() {
        x = a.nextInt();
        y = a.nextInt();
        String b = "";
        d = x + y;
        if (x==y) {
            while (d > 0) {
                b = b + "xy";
                d -= 2;
            }
        }
        if (x > y) {
            z = x-y;
            if (z < 4) {
                while (x== 1) {
                    b = b + "x";
                    x--;
                    while (y>0) {
                        b=b + "y";
                        y--;
                    }
                }
                while (x>1) {
                    b = b + "xx";
                    while (y>0) {
                        b=b + "y";
                        y--;
                    }
                    x -= 2;
                }
            }
            if (z > 4) {
                System.out.println("imposible combinacion");
            }
        }
        if (y>x) {
            for (int i = 0; i < d; i++) {
                z = x-y;
                if (z < 4) {
                    while (x>1) {
                        b = b + "xx";
                        x -= 2;
                        while (y>0) {
                            b=b + "y";
                            y--;
                        }
                    }
                }
                while(x==1) {
                    b = b + "x";
                }
            }
            if (z > 4) {
                System.out.println("imposible combinacion");
            }
        }
        resultado = resultado + b;
        return resultado;
    }
    public static void main(String args[]) {
        System.out.print(new examen().resolver());
    }
}
