import java.util.Scanner;

public class EP09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Constantes de tarifa
        final double KM_BASE = 3.0;
        final double TARIFA_BASE = 8.0;
        final double PRECIO_KM_EXTRA = 2.0; 

        System.out.print("Km recorridos: ");
        double kmRecorridos = entrada.nextDouble();

        if (kmRecorridos <= KM_BASE) {
            System.out.println("Pago total: S/. " + TARIFA_BASE);
        } else {
            double kmExceso = kmRecorridos - KM_BASE;
            double pagoTotal = TARIFA_BASE + (kmExceso * PRECIO_KM_EXTRA);
            
            System.out.println("Sobrepasa los " + KM_BASE + " km base.");
            System.out.println("Kilómetros en exceso: " + kmExceso + " km");
            System.out.println("Pago total a realizar: S/. " + pagoTotal);
        }

    }
}