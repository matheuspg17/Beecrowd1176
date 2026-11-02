
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        long fib[] = new long[61];
        int numentrada, indice;
        fib[0] = 0;
        fib[1] = 1;
        
        for (int i = 2; i <= 60; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        
        numentrada = leia.nextInt();
        
        for (int i = 0; i < numentrada; i++) {
            indice = leia.nextInt();
            
            System.out.println("Fib(" + indice + ") = " + fib[indice]);
        }
        
    }
}
