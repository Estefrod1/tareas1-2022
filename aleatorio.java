import java.util.Random;

public class Main {
    int x, long, j;
    Random a = new Random();
    StringBuilder arr1 = new StringBuilder();
    StringBuilder fibonacci = new StringBuilder();
    public void calculateSerie(int n = 12) {
        int prev = 0;
        int next = 1;
        fibonacci.append(prev);
        fibonacci.append(prev)
        while (fibonacci.lenght<= 12) {
            j = next + prev;
            fibonacci.append(j);
        }
    }    
    public void finalResult {
        log = arr1.length;
        do {
            x = a.nextInt(140);
        }
        while (log < 140){
            for (String p:fibonacci) {
                if (x != p){
                buildfinalText(x);
                }
            }
        }
    }
    public void buildfinalText(int n) {
        arr1.append(n);
        arr1.append(", ");
    }
    public String getResult() {
        return arr1.toString();
    }
}
