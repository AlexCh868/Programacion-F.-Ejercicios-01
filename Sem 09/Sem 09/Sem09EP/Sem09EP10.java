import java.util.Scanner;

public class Sem09EP10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = 50;
        int intentoUsuario = 0;
        int intentosRealizados = 0;

        System.out.println("¡Bienvenido al juego de Adivina el Número!");
        while (intentoUsuario != numeroSecreto) {
            System.out.print("Ingrese un número: ");
            intentoUsuario = scanner.nextInt();
            intentosRealizados++;
            if (intentoUsuario < numeroSecreto) {
                System.out.println("El número es mayor");
            } else if (intentoUsuario > numeroSecreto) {
                System.out.println("El número es menor");
            } else {
                System.out.println("¡Correcto!");
                System.out.println("Intentos realizados: " + intentosRealizados);
            }
        }

        scanner.close();
    }
}