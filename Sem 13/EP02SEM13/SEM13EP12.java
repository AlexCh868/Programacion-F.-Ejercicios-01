import java.util.Scanner;

public class SEM13EP12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double CENTINELA_SALIDA = -1.0;

        int diasConProduccion = 0;
        double produccionAcumulada = 0.0;

        while (true) {
            System.out.print("Ingrese la produccion del dia (-1 para finalizar): ");
            double produccion = sc.nextDouble();

            if (produccion == CENTINELA_SALIDA) {
                break; // Finaliza el registro de producción
            }

            if (produccion == 0) {
                System.out.println("Dia con produccion igual a cero. Se ignora.");
                continue;
            }

            produccionAcumulada += produccion;
            diasConProduccion++;
        }

        System.out.println("\n--- Resumen de Produccion Industrial ---");
        System.out.printf("Produccion acumulada: %.2f%n", produccionAcumulada);

        if (diasConProduccion > 0) {
            double promedioDiario = produccionAcumulada / diasConProduccion;
            System.out.printf("Promedio diario: %.2f%n", promedioDiario);
        } else {
            System.out.println("Promedio diario: No hay dias con produccion registrados.");
        }

        sc.close();
    }
}