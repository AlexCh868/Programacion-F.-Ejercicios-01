import java.util.Scanner;

public class SEM13EP09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalRespuestas = 0;
        double sumaSatisfaccion = 0.0;

        while (true) {
            System.out.print("Ingrese su nivel de satisfaccion (1 a 5, 0 para finalizar): ");
            int respuesta = sc.nextInt();

            if (respuesta == 0) {
                break; // Finaliza la encuesta
            }

            if (respuesta < 1 || respuesta > 5) {
                System.out.println("Valor no valido. Ingrese un numero entre 1 y 5, o 0 para salir.");
                continue;
            }

            totalRespuestas++;
            sumaSatisfaccion += respuesta;
        }

        System.out.println("Total de respuestas: " + totalRespuestas);

        if (totalRespuestas > 0) {
            double promedioSatisfaccion = sumaSatisfaccion / totalRespuestas;
            System.out.printf("Promedio de satisfaccion: %.2f%n", promedioSatisfaccion);
        } else {
            System.out.println("Promedio de satisfaccion: No hay respuestas registradas.");
        }

        sc.close();
    }
}