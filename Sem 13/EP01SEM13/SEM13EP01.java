import java.util.Scanner;

public class SEM13EP01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cantidad = 0;
        double suma = 0;
        double maxima = Double.NEGATIVE_INFINITY;
        double minima = Double.POSITIVE_INFINITY;

        while (true) {
            System.out.print("Ingrese una nota (0 a 20, termina con 20): ");
            double nota = sc.nextDouble();

            if (nota < 0 || nota > 20) {
                System.out.println("Nota fuera de rango. Intente entre 0 y 20.");
                continue;
            }

            cantidad++;
            suma += nota;

            if (nota > maxima) {
                maxima = nota;
            }
            if (nota < minima) {
                minima = nota;
            }

            if (nota == 20) {
                break;
            }
        }

        if (cantidad > 0) {
            double promedio = suma / cantidad;
            System.out.println("Cantidad de notas registradas: " + cantidad);
            System.out.printf("Promedio de notas: %.2f%n", promedio);
            System.out.println("Nota maxima: " + maxima);
            System.out.println("Nota minima: " + minima);
        } else {
            System.out.println("No se registraron notas.");
        }

        sc.close();
    }
}