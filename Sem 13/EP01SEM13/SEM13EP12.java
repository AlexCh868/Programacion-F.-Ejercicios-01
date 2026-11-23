import java.util.Scanner;

public class SEM13EP12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalAsistentes = 0;

        while (true) {
            System.out.print("Ingrese el nombre del estudiante (o escriba FIN para terminar): ");
            String nombre = sc.nextLine().trim();

            if (nombre.equalsIgnoreCase("FIN")) {
                break; // Finaliza el registro de asistencia
            }

            if (!nombre.isEmpty()) {
                totalAsistentes++;
            }
        }

        System.out.println("Total de asistentes registrados: " + totalAsistentes);

        sc.close();
    }
}