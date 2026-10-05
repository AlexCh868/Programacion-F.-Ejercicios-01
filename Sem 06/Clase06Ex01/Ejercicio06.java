import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();

        if (numero >= 15 && numero <= 18) {
            System.out.println("Puede participar");
        }

    }
}
