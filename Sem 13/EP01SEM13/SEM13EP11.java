import java.util.Scanner;

public class SEM13EP11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double LIMITE_MS = 5000.0;

        int registrosProcesados = 0;
        double tiempoCritico = 0.0;

        while (true) {
            System.out.print("Ingrese el tiempo de respuesta (ms): ");
            double tiempoMs = sc.nextDouble();

            registrosProcesados++;

            if (tiempoMs > LIMITE_MS) {
                tiempoCritico = tiempoMs;
                break; // Detiene el monitoreo al superar los 5000 ms
            }
        }

        System.out.println("Tiempo critico: " + tiempoCritico + " ms");
        System.out.println("Registros procesados: " + registrosProcesados);

        sc.close();
    }
}