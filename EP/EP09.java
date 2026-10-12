

import java.util.Scanner;

public class EP09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final double KmMin = 3.0;
        final double tarifa = 8.0;
        final double KmExtra = 2.5;

        System.out.print("Km recorridos: ");
        double kmRecorridos = entrada.nextDouble();

        if (kmRecorridos <= KmMin) {
            System.out.println("Pago total: S/. " + tarifa);
        } else {
            double KmExtra = kmRecorridos - KmMin;
            double pagoTotal = tarifa + (KmRecorridos * KmExtra);
            
            System.out.println("Sobrepasa los " + KmMin + " km base.");
            System.out.println("Kilómetros en exceso: " + KmExtra + " km");
            System.out.println("Pago total a realizar: S/. " + pagoTotal);
        }

    }
}