import java.util.Scanner;

public class EP06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el monto total de ventas: S/ ");
        double ventas = entrada.nextDouble();

        double porcentajeBonificacion;
        if (ventas > 5000) {
            porcentajeBonificacion = 0.10; 
        } else {
            porcentajeBonificacion = 0.05; 
        }

        double bonificacion = ventas * porcentajeBonificacion;
        double total = ventas + bonificacion;

        System.out.println("Bonificación" + (int)(porcentajeBonificacion * 100) + "%): S/ " + bonificacion);
        System.out.println("Total a recibir: S/ " + total);
    }
}