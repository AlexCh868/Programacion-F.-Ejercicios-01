import java.util.Scanner;

public class SEM13EP11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalProductosDisponibles = 0;

        while (true) {
            System.out.print("Ingrese el nombre del producto (o escriba FIN para terminar): ");
            String producto = sc.nextLine().trim();

            if (producto.equalsIgnoreCase("FIN")) {
                break; // Finaliza el registro de inventario
            }

            System.out.print("Ingrese el stock del producto: ");
            int stock = sc.nextInt();
            sc.nextLine(); // Limpia el salto de línea pendiente

            if (stock == 0) {
                System.out.println("Producto sin stock (0). Se ignora.");
                continue;
            }

            totalProductosDisponibles++;
        }

        System.out.println("\n--- Resumen de Inventario ---");
        System.out.println("Total de productos disponibles: " + totalProductosDisponibles);

        sc.close();
    }
}