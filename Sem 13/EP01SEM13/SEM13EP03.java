import java.util.Scanner;

public class SEM13EP03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double LIMITE_TEMPERATURA = 95.0;

        int lecturas = 0;
        double temperaturaCritica = 0.0;

        while (true) {
            System.out.print("Ingrese la temperatura (°C): ");
            double temperatura = sc.nextDouble();

            lecturas++;

            if (temperatura > LIMITE_TEMPERATURA) {
                temperaturaCritica = temperatura;
                break; // Detiene el monitoreo al superar los 95 °C
            }
        }

        System.out.println("Monitoreo detenido por sobretemperatura.");
        System.out.println("Temperatura critica encontrada: " + temperaturaCritica + " °C");
        System.out.println("Numero de lecturas realizadas: " + lecturas);

        sc.close();
    }
}