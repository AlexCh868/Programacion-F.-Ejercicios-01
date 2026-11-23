import java.util.Scanner;

public class SEM13EP15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int registrosValidos = 0;
        String productoConError = "";

        while (true) {
            System.out.print("Ingrese el nombre del producto: ");
            String producto = sc.nextLine().trim();

            System.out.print("Ingrese la cantidad en stock: ");
            int stock = sc.nextInt();
            sc.nextLine(); // Limpia el salto de línea pendiente

            if (stock < 0) {
                productoConError = producto;
                break; // Detiene la verificación al detectar stock negativo
            }

            registrosValidos++;
        }

        System.out.println("Producto con error: " + productoConError);
        System.out.println("Cantidad de registros validos: " + registrosValidos);

        sc.close();
    }
}