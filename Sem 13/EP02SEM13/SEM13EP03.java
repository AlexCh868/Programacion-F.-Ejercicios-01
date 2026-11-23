import java.util.Scanner;

public class SEM13EP03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ventasValidas = 0;
        double totalVendido = 0.0;

        while (true) {
            System.out.print("Ingrese el monto de la venta (-1 para finalizar): ");
            double venta = sc.nextDouble();

            if (venta == -1) {
                break; // Finaliza el registro de ventas
            }

            if (venta < 0) {
                System.out.println("Venta negativa. Se ignora.");
                continue;
            }

            totalVendido += venta;
            ventasValidas++;
        }

        System.out.println("\n--- Resumen de Ventas ---");
        System.out.printf("Total vendido: %.2f%n", totalVendido);
        System.out.println("Cantidad de ventas validas: " + ventasValidas);

        sc.close();
    }
}