import java.util.Scanner;

public class SEM11EP08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Celsius a Fahrenheit");
            System.out.println("2. Fahrenheit a Celsius");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese grados Celsius: ");
                    double c = sc.nextDouble();
                    double f = (c * 9 / 5) + 32;
                    System.out.println(c + " °C = " + f + " °F");
                    break;

                case 2:
                    System.out.print("Ingrese grados Fahrenheit: ");
                    double fa = sc.nextDouble();
                    double ce = (fa - 32) * 5 / 9;
                    System.out.println(fa + " °F = " + ce + " °C");
                    break;

                case 3:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }

            System.out.println();
        } while (opcion != 3);
    }
}