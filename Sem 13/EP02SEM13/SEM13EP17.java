import java.util.Scanner;

public class SEM13EP17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double MONTO_MINIMO = 10.0;
        final double CENTINELA_SALIDA = -1.0;

        int transaccionesValidas = 0;
        double totalProcesado = 0.0;

        while (true) {
            System.out.print("Ingrese el monto de la transaccion en S/ (-1 para finalizar): ");
            double monto = sc.nextDouble();

            if (monto == CENTINELA_SALIDA) {
                break; // Finaliza el procesamiento de transacciones
            }

            if (monto < MONTO_MINIMO) {
                System.out.println("Monto menor a S/10. Se ignora.");
                continue;
            }

            totalProcesado += monto;
            transaccionesValidas++;
        }

        System.out.println("\n--- Resumen de Transacciones ---");
        System.out.printf("Total procesado: S/ %.2f%n", totalProcesado);
        System.out.println("Cantidad de transacciones validas: " + transaccionesValidas);

        sc.close();
    }
}