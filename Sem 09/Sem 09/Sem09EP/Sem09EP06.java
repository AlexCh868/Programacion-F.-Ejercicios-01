import java.util.Scanner;

public class Sem09EP06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        int cantidadDigitos = 0;

        if (numero <= 0) {
            System.out.println("Por favor, ingrese un número entero positivo.");
        } else {
            while (numero > 0) {
                numero = numero / 10; 
                cantidadDigitos++;    
            }
            System.out.println("Cantidad de dígitos: " + cantidadDigitos);
        }
        scanner.close();
    }
}