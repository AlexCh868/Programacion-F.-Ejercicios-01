import java.util.Scanner;

public class EP10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Constantes del problema
        final double PRECIO_PIEZA = 5.0;

        System.out.print("Ingrese la cantidad de piezas producidas: ");
        int piezas = entrada.nextInt();

        double valorBase = piezas * PRECIO_PIEZA;
        double porcentajeIncentivo;

        if (piezas > 1000) {
            porcentajeIncentivo = 0.15; // 15%
        } else {
            porcentajeIncentivo = 0.08; // 8%
        }

        double incentivo = valorBase * porcentajeIncentivo;
        double totalPagar = valorBase + incentivo;

        System.out.println("Valor base (" + piezas + " piezas): S/ " + valorBase);
        System.out.println("Incentivo (" + (int)(porcentajeIncentivo * 100) + "%): S/ " + incentivo);
        System.out.println("Total a pagar: S/ " + totalPagar);
    }
}