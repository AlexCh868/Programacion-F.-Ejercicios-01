import java.util.Scanner;

public class SEM13EP10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double LIMITE_TRANSFERENCIA = 100000.0;

        int registrosProcesados = 0;
        double transferenciaDetectada = 0.0;

        while (true) {
            System.out.print("Ingrese el monto de la transferencia (S/): ");
            double monto = sc.nextDouble();

            registrosProcesados++;

            if (monto > LIMITE_TRANSFERENCIA) {
                transferenciaDetectada = monto;
                break; // Detiene el análisis al superar S/ 100000
            }
        }

        System.out.printf("Transferencia detectada: S/ %.2f%n", transferenciaDetectada);
        System.out.println("Cantidad de registros procesados: " + registrosProcesados);

        sc.close();
    }
}