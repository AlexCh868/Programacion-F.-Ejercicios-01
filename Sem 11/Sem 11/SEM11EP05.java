import java.util.Scanner;

public class SEM11EP05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 5000;
        int opcion;

        do {
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Depositar dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Su saldo actual es: S/ " + saldo);
                    break;

                case 2:
                    System.out.print("Monto a retirar: S/ ");
                    double retiro = sc.nextDouble();

                    if (retiro <= 0) {
                        System.out.println("El monto debe ser mayor a 0.");
                    } else if (retiro > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= retiro;
                        System.out.println("Retiro exitoso. Nuevo saldo: S/ " + saldo);
                    }
                    break;

                case 3:
                    System.out.print("Monto a depositar: S/ ");
                    double deposito = sc.nextDouble();

                    if (deposito <= 0) {
                        System.out.println("El monto debe ser mayor a 0.");
                    } else {
                        saldo += deposito;
                        System.out.println("Depósito exitoso. Nuevo saldo: S/ " + saldo);
                    }
                    break;

                case 4:
                    System.out.println("Gracias por usar el cajero. ¡Hasta pronto!");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }

            System.out.println();
        } while (opcion != 4);
    }
}