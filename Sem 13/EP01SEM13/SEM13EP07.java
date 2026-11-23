import java.util.Scanner;

public class SEM13EP07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalProducido = 0.0;
        int horasRegistradas = 0;

        while (true) {
            System.out.print("Ingrese la produccion de la hora (0 para finalizar): ");
            double produccion = sc.nextDouble();

            horasRegistradas++;

            if (produccion == 0) {
                break; // Detiene el registro al encontrar producción igual a cero
            }

            totalProducido += produccion;
        }

        System.out.println("Total producido: " + totalProducido);
        System.out.println("Cantidad de horas registradas: " + horasRegistradas);

        sc.close();
    }
}