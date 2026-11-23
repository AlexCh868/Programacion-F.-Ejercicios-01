import java.util.Scanner;

public class SEM13EP18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double CENTINELA_SALIDA = -1.0;

        int registrosValidos = 0;
        double precipitacionAcumulada = 0.0;

        while (true) {
            System.out.print("Ingrese el registro de lluvia en mm (-1 para finalizar): ");
            double lluvia = sc.nextDouble();

            if (lluvia == CENTINELA_SALIDA) {
                break; // Finaliza el registro meteorológico
            }

            if (lluvia < 0) {
                System.out.println("Registro de lluvia negativo. Se ignora.");
                continue;
            }

            precipitacionAcumulada += lluvia;
            registrosValidos++;
        }

        System.out.println("\n--- Resumen Meteorologico ---");
        System.out.printf("Precipitacion acumulada: %.2f mm%n", precipitacionAcumulada);

        if (registrosValidos > 0) {
            double promedio = precipitacionAcumulada / registrosValidos;
            System.out.printf("Promedio: %.2f mm%n", promedio);
        } else {
            System.out.println("Promedio: No se registraron datos validos.");
        }

        sc.close();
    }
}