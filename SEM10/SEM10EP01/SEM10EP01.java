import java.util.Scanner;

public class SEM10EP01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero positivo N: ");
        int n = scanner.nextInt();

        int sumaFormula = n * (n + 1) / 2;
        
        System.out.println("La suma de los números es: " + sumaFormula);
        
        scanner.close();
    }
}