import java.util.Scanner;

public class SEM13EP04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int numero = sc.nextInt();

        boolean esPrimo = true;
        int primerDivisor = -1;

        if (numero <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i * i <= numero; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    primerDivisor = i;
                    break; // Detiene la búsqueda al hallar el primer divisor
                }
            }
        }

        if (esPrimo) {
            System.out.println("El numero " + numero + " ES primo.");
        } else {
            System.out.println("El numero " + numero + " NO es primo.");
            if (primerDivisor != -1) {
                System.out.println("Primer divisor encontrado: " + primerDivisor);
            } else {
                System.out.println("Primer divisor encontrado: ninguno (numero menor o igual a 1).");
            }
        }

        sc.close();
    }
}