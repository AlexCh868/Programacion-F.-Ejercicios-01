import java.util.Scanner;

public class SEM13EP15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int respuestasValidas = 0;
        int aciertos = 0;
        int numeroPregunta = 1;

        while (true) {
            System.out.print("Pregunta " + numeroPregunta + " - Ingrese respuesta (vacío/N/R para omitir, FIN para terminar): ");
            String respuesta = sc.nextLine().trim();

            if (respuesta.equalsIgnoreCase("FIN")) {
                break; // Finaliza la evaluación del examen
            }

            if (respuesta.isEmpty() || respuesta.equalsIgnoreCase("N/R") || respuesta.equalsIgnoreCase("SIN RESPONDER")) {
                System.out.println("Pregunta sin responder. Se ignora.");
                continue;
            }

            respuestasValidas++;

            System.out.print("¿Fue correcta? (S/N): ");
            String esCorrecta = sc.nextLine().trim();

            if (esCorrecta.equalsIgnoreCase("S") || esCorrecta.equalsIgnoreCase("SI")) {
                aciertos++;
            }

            numeroPregunta++;
        }

        System.out.println("\n--- Resultados de la Evaluacion ---");
        System.out.println("Numero de respuestas validas: " + respuestasValidas);

        if (respuestasValidas > 0) {
            double porcentajeAciertos = (aciertos * 100.0) / respuestasValidas;
            System.out.printf("Porcentaje de aciertos: %.2f%%%n", porcentajeAciertos);
        } else {
            System.out.println("Porcentaje de aciertos: 0.00% (sin respuestas validas)");
        }

        sc.close();
    }
}