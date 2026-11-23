import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SEM13EP18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int META_PUNTOS = 100;
        Map<String, Integer> puntajes = new HashMap<>();

        String ganador = "";
        int puntajeFinal = 0;

        while (true) {
            System.out.print("Ingrese el nombre del participante: ");
            String participante = sc.nextLine().trim();

            System.out.print("Ingrese los puntos obtenidos: ");
            int puntos = sc.nextInt();
            sc.nextLine(); // Limpia el salto de línea pendiente

            if (participante.isEmpty()) {
                System.out.println("El nombre del participante no puede estar vacio.");
                continue;
            }

            int nuevoPuntaje = puntajes.getOrDefault(participante, 0) + puntos;
            puntajes.put(participante, nuevoPuntaje);

            if (nuevoPuntaje >= META_PUNTOS) {
                ganador = participante;
                puntajeFinal = nuevoPuntaje;
                break; // Finaliza la competencia al alcanzar los 100 puntos
            }
        }

        System.out.println("Ganador: " + ganador);
        System.out.println("Puntaje final: " + puntajeFinal);

        sc.close();
    }
}