import java.util.Scanner;

public class SEM13EP13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int META_ENTRADAS = 500;

        int totalVendido = 0;
        int numeroVentas = 0;

        while (true) {
            System.out.print("Ingrese la cantidad de entradas vendidas (Meta: " + META_ENTRADAS + "): ");
            int cantidad = sc.nextInt();

            if (cantidad <= 0) {
                System.out.println("Ingrese una cantidad mayor que 0.");
                continue;
            }

            totalVendido += cantidad;
            numeroVentas++;

            if (totalVendido >= META_ENTRADAS) {
                break; // Meta alcanzada: detiene el registro de ventas
            }
        }

        System.out.println("Total vendido: " + totalVendido);
        System.out.println("Numero de ventas realizadas: " + numeroVentas);

        sc.close();
    }
}