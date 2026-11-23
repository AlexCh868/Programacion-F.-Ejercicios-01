import java.util.Scanner;

public class SEM13EP16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double MIN_MEDIDA = 10.0;
        final double MAX_MEDIDA = 20.0;

        int piezasRevisadas = 0;
        double medidaIncorrecta = 0.0;

        while (true) {
            System.out.print("Ingrese la medida de la pieza (rango permitido " + MIN_MEDIDA + " - " + MAX_MEDIDA + "): ");
            double medida = sc.nextDouble();

            piezasRevisadas++;

            if (medida < MIN_MEDIDA || medida > MAX_MEDIDA) {
                medidaIncorrecta = medida;
                break; // Detiene el control al detectar medida fuera de rango
            }
        }

        System.out.println("Medida incorrecta: " + medidaIncorrecta);
        System.out.println("Cantidad de piezas revisadas: " + piezasRevisadas);

        sc.close();
    }
}