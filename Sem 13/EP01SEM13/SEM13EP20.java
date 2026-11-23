import java.util.Scanner;

public class SEM13EP20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int paquetesValidos = 0;
        String numeroPaquete = "";

        while (true) {
            System.out.print("Ingrese el numero de paquete: ");
            String idPaquete = sc.nextLine().trim();

            System.out.print("¿Esta corrupto? (S/N): ");
            String corrupto = sc.nextLine().trim();

            if (corrupto.equalsIgnoreCase("S") || corrupto.equalsIgnoreCase("SI")) {
                numeroPaquete = idPaquete;
                break; // Detiene la simulación al detectar un paquete corrupto
            }

            paquetesValidos++;
        }

        System.out.println("Numero del paquete: " + numeroPaquete);
        System.out.println("Paquetes validos procesados: " + paquetesValidos);

        sc.close();
    }
}