import java.util.Scanner;

public class Sem09EP09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 1000.0;
        int opcion = -1; 

        System.out.println("Saldo inicial: S/ " + saldo);
        System.out.println("Ingrese 0 para salir.");
        while (opcion != 0) {
            System.out.print("\nIngrese monto a retirar (o 0 para salir): S/ ");
            double retiro = scanner.nextDouble();
            if (retiro == 0) {
                System.out.println("Saliendo del cajero automático. ¡Gracias por usar nuestros servicios!");
                break; 
            }
            if (retiro > saldo) {
                System.out.println("Error: Fondos insuficientes. Su saldo actual es S/ " + saldo);
            } else if (retiro < 0) {
                System.out.println("Error: Por favor, ingrese una cantidad válida mayor a 0.");
            } else {
                saldo -= retiro;
                System.out.println("Retiro exitoso: S/ " + retiro);
                System.out.println("Saldo restante: S/ " + saldo);
            }
        }

        scanner.close();
    }
}