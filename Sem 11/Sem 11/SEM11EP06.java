import java.util.Scanner;

public class SEM11EP06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int pares = 0;
        int impares = 0;

        do {
            numero = sc.nextInt();

            if (numero != 0) {
                if (numero % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
        } while (numero != 0);

        System.out.println();
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
    }
}