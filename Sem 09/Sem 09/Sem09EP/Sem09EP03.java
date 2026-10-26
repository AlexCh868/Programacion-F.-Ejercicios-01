import java.util.Scanner;

public class Sem09EP03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese N: ");
        int n = scanner.nextInt();

        int contadorPares = 0;
        int i = 2; 

        while (i <= n) {
            contadorPares++;
            i += 2; 
        }

        System.out.println("Cantidad de pares: " + contadorPares);

        scanner.close();
    }
}