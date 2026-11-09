import java.util.Scanner;

public class SEM11EP07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base;
        int exponente;

        System.out.print("Base: ");
        base = sc.nextInt();

        do {
            System.out.print("Exponente: ");
            exponente = sc.nextInt();

            if (exponente <= 0) {
                System.out.println("El exponente debe ser positivo.");
            }
        } while (exponente <= 0);

        long resultado = 1;
        int contador = 0;

        do {
            resultado *= base;
            contador++;
        } while (contador < exponente);

        System.out.println();
        System.out.println("Resultado: " + resultado);
    }
}