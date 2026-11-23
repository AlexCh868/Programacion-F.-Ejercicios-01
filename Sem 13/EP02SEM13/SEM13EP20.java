import java.util.Scanner;

public class SEM13EP20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalRegistros = 0;
        int clientesValidos = 0;

        while (true) {
            System.out.print("Ingrese el nombre del cliente (o escriba FIN para terminar): ");
            String nombre = sc.nextLine().trim();

            if (nombre.equalsIgnoreCase("FIN")) {
                break; // Finaliza el registro de clientes
            }

            System.out.print("Ingrese el correo del cliente: ");
            String correo = sc.nextLine().trim();

            System.out.print("Ingrese el telefono del cliente: ");
            String telefono = sc.nextLine().trim();

            totalRegistros++;

            if (nombre.isEmpty() || correo.isEmpty() || telefono.isEmpty()) {
                System.out.println("Datos del cliente incompletos. Se ignora.");
                continue;
            }

            clientesValidos++;
        }

        System.out.println("\n--- Resumen del Sistema de Clientes ---");
        System.out.println("Cantidad de clientes validos: " + clientesValidos);

        if (totalRegistros > 0) {
            double porcentajeValidos = (clientesValidos * 100.0) / totalRegistros;
            System.out.printf("Porcentaje de registros validos: %.2f%%%n", porcentajeValidos);
        } else {
            System.out.println("Porcentaje de registros validos: 0.00% (sin registros)");
        }

        sc.close();
    }
}