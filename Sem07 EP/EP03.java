import java.util.Scanner;

public class EP03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final double PxU = 2500.0;

        System.out.print("Ingrese la cantidad de computadoras a comprar: ");
        int cantidad = entrada.nextInt();

        double PrecioTotal = cantidad * PxU;
        double porcentajeDescuento;

        if (cantidad >= 5) {
            porcentajeDescuento = 0.12;
        } else {
            porcentajeDescuento = 0.05;
        }

        double descuento = PrecioTotal * porcentajeDescuento;
        double total = PrecioTotal - descuento;
        System.out.println("Total a pagar: S/ " + total);

    }
}