import java.util.Scanner;

public class SEM13EP17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double UMBRAL_SOSPECHOSO = 50000.0;

        int operacionesRevisadas = 0;
        double montoSospechoso = 0.0;

        while (true) {
            System.out.print("Ingrese el monto de la operacion: ");
            double monto = sc.nextDouble();

            operacionesRevisadas++;

            if (monto > UMBRAL_SOSPECHOSO || monto < 0) {
                montoSospechoso = monto;
                break; // Detiene el procesamiento al detectar operacion sospechosa
            }
        }

        System.out.printf("Monto sospechoso: %.2f%n", montoSospechoso);
        System.out.println("Numero de operaciones revisadas: " + operacionesRevisadas);

        sc.close();
    }
}