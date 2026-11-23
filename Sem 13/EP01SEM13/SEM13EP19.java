import java.util.Scanner;

public class SEM13EP19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pedidosProcesados = 0;
        String numeroPedidoUrgente = "";

        while (true) {
            System.out.print("Ingrese el numero de pedido: ");
            String numeroPedido = sc.nextLine().trim();

            System.out.print("¿Es urgente? (S/N): ");
            String urgente = sc.nextLine().trim();

            pedidosProcesados++;

            if (urgente.equalsIgnoreCase("S") || urgente.equalsIgnoreCase("SI")) {
                numeroPedidoUrgente = numeroPedido;
                break; // Detiene el procesamiento al encontrar un pedido urgente
            }
        }

        System.out.println("Numero del pedido urgente: " + numeroPedidoUrgente);
        System.out.println("Pedidos procesados: " + pedidosProcesados);

        sc.close();
    }
}