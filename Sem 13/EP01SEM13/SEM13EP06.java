import java.util.Random;
import java.util.Scanner;

public class SEM13EP06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int intentos = 0;

        System.out.println("=== JUEGO DE ADIVINANZA ===");
        System.out.println("Adivina el numero secreto entre 1 y 100.");

        while (true) {
            System.out.print("Ingresa tu intento: ");
            int intentoUsuario = sc.nextInt();

            intentos++;

            if (intentoUsuario == numeroSecreto) {
                break; // Termina el juego al adivinar
            } else if (intentoUsuario < numeroSecreto) {
                System.out.println("El numero secreto es MAYOR.");
            } else {
                System.out.println("El numero secreto es MENOR.");
            }
        }

        System.out.println("Felicitaciones! Adivinaste el numero secreto (" + numeroSecreto + ").");
        System.out.println("Numero de intentos usados: " + intentos);

        sc.close();
    }
}