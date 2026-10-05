import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();

        if (numero > 99 && numero < 1000) {
            System.out.println("Es de 3 cifras");
        }

    }
}
