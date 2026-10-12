import java.util.Scanner;

public class EP04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Kwh Gastados: ");
        int cantidad = entrada.nextInt();

        double PagoTtotal;

        if (cantidad >= 100) {
            PagoTtotal = 0.8;
        } else {
            PagoTtotal = 1.2;
        }
        double total = cantidad * PagoTtotal;
        System.out.println("Total a pagar: S/ " + total);

    }
}