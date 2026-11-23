import java.util.Scanner;

public class SEM13EP09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int LONGITUD_MINIMA = 5;
        int palabrasValidas = 0;

        while (true) {
            System.out.print("Ingrese una palabra (o escriba FIN para finalizar): ");
            String palabra = sc.nextLine().trim();

            if (palabra.equalsIgnoreCase("FIN")) {
                break; // Finaliza el registro de palabras
            }

            if (palabra.length() < LONGITUD_MINIMA) {
                System.out.println("La palabra tiene menos de 5 caracteres. Se ignora.");
                continue;
            }

            palabrasValidas++;
        }

        System.out.println("\n--- Resultado ---");
        System.out.println("Cantidad de palabras validas: " + palabrasValidas);

        sc.close();
    }
}