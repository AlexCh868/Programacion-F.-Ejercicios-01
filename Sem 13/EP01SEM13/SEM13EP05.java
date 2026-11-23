import java.util.Scanner;

public class SEM13EP05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo = 1000.0;
        int operacionesRealizadas = 0;

        while (true) {
            System.out.println("\n=== CAJERO AUTOMATICO ===");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            int opcion = sc.nextInt();

            if (opcion == 4) {
                break; // Sale del menú repetitivo
            }

            switch (opcion) {
                case 1:
                    System.out.printf("Saldo actual: %.2f%n", saldo);
                    operacionesRealizadas++;
                    break;

                case 2:
                    System.out.print("Ingrese el monto a depositar: ");
                    double deposito = sc.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        operacionesRealizadas++;
                        System.out.printf("Deposito exitoso. Nuevo saldo: %.2f%n", saldo);
                    } else {
                        System.out.println("El monto debe ser mayor que 0.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el monto a retirar: ");
                    double retiro = sc.nextDouble();
                    if (retiro <= 0) {
                        System.out.println("El monto debe ser mayor que 0.");
                    } else if (retiro > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= retiro;
                        operacionesRealizadas++;
                        System.out.printf("Retiro exitoso. Nuevo saldo: %.2f%n", saldo);
                    }
                    break;

                default:
                    System.out.println("Opcion no valida. Intente nuevamente.");
                    break;
            }
        }

        System.out.println("Operaciones realizadas: " + operacionesRealizadas);
        System.out.println("Sesion cerrada. Gracias por usar el cajero automatico.");

        sc.close();
    }
}