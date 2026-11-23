import java.util.Scanner;

public class SEM13EP01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int TOTAL_NOTAS = 100;
        final double MIN_NOTA = 0.0;
        final double MAX_NOTA = 20.0;

        int notasValidas = 0;
        double sumaNotas = 0.0;
        double notaMaxima = Double.NEGATIVE_INFINITY;
        double notaMinima = Double.POSITIVE_INFINITY;

        for (int i = 1; i <= TOTAL_NOTAS; i++) {
            System.out.print("Ingrese la nota " + i + " (0 a 20): ");
            double nota = sc.nextDouble();

            if (nota < MIN_NOTA || nota > MAX_NOTA) {
                System.out.println("Nota fuera de rango (0 - 20). Se ignora.");
                continue;
            }

            notasValidas++;
            sumaNotas += nota;

            if (nota > notaMaxima) {
                notaMaxima = nota;
            }
            if (nota < notaMinima) {
                notaMinima = nota;
            }
        }

        System.out.println("\n--- Resultados de Notas ---");
        if (notasValidas > 0) {
            double promedio = sumaNotas / notasValidas;
            System.out.printf("Promedio: %.2f%n", promedio);
            System.out.printf("Nota maxima: %.2f%n", notaMaxima);
            System.out.printf("Nota minima: %.2f%n", notaMinima);
        } else {
            System.out.println("No se ingresaron notas validas dentro del rango 0 a 20.");
        }

        sc.close();
    }
}