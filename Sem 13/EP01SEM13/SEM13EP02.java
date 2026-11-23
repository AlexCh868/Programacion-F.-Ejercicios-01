import java.util.Scanner;

public class SEM13EP02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final String CLAVE_CORRECTA = "Java2026";
        final int MAX_INTENTOS = 5;

        boolean accesoConcedido = false;
        int intentoExitoso = 0;

        for (int intento = 1; intento <= MAX_INTENTOS; intento++) {
            System.out.print("Intento " + intento + " de " + MAX_INTENTOS + " - Ingrese la contraseña: ");
            String password = sc.nextLine();

            if (password.equals(CLAVE_CORRECTA)) {
                accesoConcedido = true;
                intentoExitoso = intento;
                break; // Finaliza inmediatamente al acertar
            } else {
                System.out.println("Contraseña incorrecta.");
            }
        }

        if (accesoConcedido) {
            System.out.println("Acceso concedido.");
            System.out.println("Intento en el que accedió: " + intentoExitoso);
        } else {
            System.out.println("Acceso denegado. Se agotaron los " + MAX_INTENTOS + " intentos.");
        }

        sc.close();
    }
}