import java.util.Scanner;

public class SEM13EP13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int RESPUESTA_MINIMA = 1;
        final int RESPUESTA_MAXIMA = 5;
        final int CENTINELA_SALIDA = 0;

        int[] frecuencia = new int[RESPUESTA_MAXIMA + 1];
        int totalRespuestasValidas = 0;
        double sumaRespuestas = 0.0;

        while (true) {
            System.out.print("Ingrese una respuesta del 1 al 5 (0 para finalizar): ");
            int respuesta = sc.nextInt();

            if (respuesta == CENTINELA_SALIDA) {
                break; // Finaliza la encuesta
            }

            if (respuesta < RESPUESTA_MINIMA || respuesta > RESPUESTA_MAXIMA) {
                System.out.println("Respuesta fuera de rango (1 a 5). Se ignora.");
                continue;
            }

            frecuencia[respuesta]++;
            totalRespuestasValidas++;
            sumaRespuestas += respuesta;
        }

        System.out.println("\n--- Resultados de la Encuesta ---");
        System.out.println("Frecuencia de respuestas:");
        for (int i = RESPUESTA_MINIMA; i <= RESPUESTA_MAXIMA; i++) {
            System.out.println("  Valor " + i + ": " + frecuencia[i]);
        }

        if (totalRespuestasValidas > 0) {
            double promedio = sumaRespuestas / totalRespuestasValidas;
            System.out.printf("Promedio: %.2f%n", promedio);
        } else {
            System.out.println("Promedio: No se registraron respuestas validas.");
        }

        sc.close();
    }
}