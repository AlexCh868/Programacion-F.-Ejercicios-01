import java.util.Scanner;

public class SEM13EP14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int asistentesValidos = 0;

        while (true) {
            System.out.print("Ingrese el nombre del estudiante (o escriba FIN para terminar): ");
            String estudiante = sc.nextLine().trim();

            if (estudiante.equalsIgnoreCase("FIN")) {
                break; // Finaliza el control de asistencia
            }

            System.out.print("¿Esta retirado? (S/N): ");
            String estado = sc.nextLine().trim();

            if (estado.equalsIgnoreCase("S") || estado.equalsIgnoreCase("SI") || estado.equalsIgnoreCase("RETIRADO")) {
                System.out.println("Estudiante retirado. Se ignora.");
                continue;
            }

            asistentesValidos++;
        }

        System.out.println("\n--- Resumen de Asistencia ---");
        System.out.println("Cantidad de asistentes validos: " + asistentesValidos);

        sc.close();
    }
}