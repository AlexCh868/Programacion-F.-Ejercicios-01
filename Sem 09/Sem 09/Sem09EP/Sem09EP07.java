import java.util.Scanner;

public class Sem09EP07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 1;
        int totalNumeros = 10;
        
        int mayor = 0;
        int menor = 0;
        while (contador <= totalNumeros) {
            System.out.print("Ingrese el número " + contador + ": ");
            int numero = scanner.nextInt();

            if (contador == 1) {
                mayor = numero;
                menor = numero;
            } else {
                if (numero > mayor) {
                    mayor = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
            }

            contador++;
        }
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        scanner.close();
    }
}