import java.util.Scanner;

public class SEM10EP05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero positivo: ");
        int n = scanner.nextInt();
        
        long factorial = 1;
        
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        
        System.out.println(n + "! = " + factorial);
        
        scanner.close();
    }
}