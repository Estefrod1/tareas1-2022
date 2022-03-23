package suma;


public class Empleado {
    int a, c, d, Sueldo2;
    int b = 500;
    public void Sueldo1(int Sueldo1) {
        this.Sueldo1 = Sueldo1;
    }
    public void afp(int Sueldo1) {
        a = Sueldo1 * 0.13;
        return a;
    }
    public void healthInsurance(int b) {
        this.b = b;
        return b;
    }
    public void quinqueio(int Sueldo1) {
        c = Sueldo1 / 12;
        return c;
    }
    public void bonus(int Sueldo1) {
        d = Sueldo1 / 12;
        return d;
    }
    public void totalSalary(int Sueldo1) {
        Sueldo2 = Sueldo1 - a - b - c - d;
        return Sueldo2;
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
