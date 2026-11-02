import java.util.Scanner;

public class SEM10EP07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número N: ");
        int n = scanner.nextInt();
        
        int sumaTotal = 0;
        
        System.out.println("\nSecuencia:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + (i < n ? " " : ""));
            sumaTotal += i;
        }
        
        System.out.println("\n--- Resultados ---");
        System.out.println("Cantidad: " + n);
        System.out.println("Suma: " + sumaTotal);
        
        scanner.close();
    }
}