import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SEM13EP10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double CENTINELA_SALIDA = -1.0;

        List<Double> pagosUnicos = new ArrayList<>();
        double totalAcumulado = 0.0;

        while (true) {
            System.out.print("Ingrese el monto del pago (-1 para finalizar): ");
            double pago = sc.nextDouble();

            if (pago == CENTINELA_SALIDA) {
                break; // Finaliza el registro de pagos
            }

            if (pagosUnicos.contains(pago)) {
                System.out.println("Pago repetido. Se ignora.");
                continue;
            }

            pagosUnicos.add(pago);
            totalAcumulado += pago;
        }

        System.out.println("\n--- Resumen de Pagos ---");
        System.out.printf("Total acumulado: %.2f%n", totalAcumulado);
        System.out.println("Cantidad de pagos unicos: " + pagosUnicos.size());

        sc.close();
    }
}