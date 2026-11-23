import java.util.Scanner;

public class SEM13EP06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double TEMP_MINIMA_PERMITIDA = -10.0;
        final double TEMP_MAXIMA_PERMITIDA = 50.0;
        final double CENTINELA_SALIDA = 999.0;

        int lecturasValidas = 0;
        double sumaTemperaturas = 0.0;
        double tempMaxima = Double.NEGATIVE_INFINITY;
        double tempMinima = Double.POSITIVE_INFINITY;

        while (true) {
            System.out.print("Ingrese una temperatura en °C (999 para finalizar): ");
            double temperatura = sc.nextDouble();

            if (temperatura == CENTINELA_SALIDA) {
                break; // Finaliza el registro de temperaturas
            }

            if (temperatura < TEMP_MINIMA_PERMITIDA || temperatura > TEMP_MAXIMA_PERMITIDA) {
                System.out.println("Temperatura fuera de rango (-10°C a 50°C). Se ignora.");
                continue;
            }

            lecturasValidas++;
            sumaTemperaturas += temperatura;

            if (temperatura > tempMaxima) {
                tempMaxima = temperatura;
            }
            if (temperatura < tempMinima) {
                tempMinima = temperatura;
            }
        }

        System.out.println("\n--- Estadistica de Temperaturas ---");
        if (lecturasValidas > 0) {
            double promedio = sumaTemperaturas / lecturasValidas;
            System.out.printf("Temperatura promedio: %.2f °C%n", promedio);
            System.out.printf("Temperatura maxima: %.2f °C%n", tempMaxima);
            System.out.printf("Temperatura minima: %.2f °C%n", tempMinima);
        } else {
            System.out.println("No se ingresaron temperaturas validas dentro del rango.");
        }

        sc.close();
    }
}