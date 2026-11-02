import java.util.Scanner;

public class SEM10EP04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalNumeros = 20;
        int cantidadPares = 0;
        int cantidadImpares = 0;
        int sumaPares = 0;
        
        System.out.println("Ingrese " + totalNumeros + " números enteros:");
        
        for (int i = 1; i <= totalNumeros; i++) {
            System.out.print("Número " + i + ": ");
            int numero = scanner.nextInt();
            
            if (numero % 2 == 0) {
                cantidadPares++;
                sumaPares += numero; 
            } else {
                cantidadImpares++;
            }
        }
        
        System.out.println("\n--- Resultados ---");
        System.out.println("Pares: " + cantidadPares);
        System.out.println("Impares: " + cantidadImpares);
        System.out.println("Suma de pares: " + sumaPares);
        
        scanner.close();
    }
}