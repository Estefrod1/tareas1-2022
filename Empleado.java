package suma;


public class Empleado {
    double a, c, d, Sueldo2;
    int b = 500;
    int[] Employee = new int[0];
    public void Employee(String nombre, int Sueldo1) {
        this.Sueldo1 = Sueldo1;
        this.nombre = nombre;
    }
    public void afp(int Sueldo1) {
        a = Sueldo1 * 0.13;
        this.a = a;
    }
    public void healthInsurance(int b) {
        this.b = b;
    }
    public void quinqueio(int Sueldo1) {
        c = Sueldo1 / 12;
        this.c = c;
    }
    public void bonus(int Sueldo1) {
        d = Sueldo1 / 12;
        this.d = d;
    }
    public void totalSalary(int Sueldo1) {
        Sueldo2 = Sueldo1 - a - b - c - d;
        this.Sueldo2 = Sueldo2;
    }
    public static void main(String[] args) {
        Employee Empl1 = new Employee("Juan Perez", 5000);
        
        System.out.println(Empl1.healthInsurance());
        System.out.println(Empl1.afp());
        System.out.println(Empl1.bonus());
        System.out.println(Empl1.quinquenio());
        System.out.println(Empl1.totalSalary());
    }
}
