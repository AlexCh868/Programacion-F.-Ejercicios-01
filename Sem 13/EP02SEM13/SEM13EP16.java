import java.util.Scanner;

public class SEM13EP16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double CENTINELA_SALIDA = -1.0;

        int salariosValidos = 0;
        double sumaSalarios = 0.0;
        double salarioMasAlto = Double.NEGATIVE_INFINITY;

        while (true) {
            System.out.print("Ingrese un salario (-1 para finalizar): ");
            double salario = sc.nextDouble();

            if (salario == CENTINELA_SALIDA) {
                break; // Finaliza el registro de salarios
            }

            if (salario < 0) {
                System.out.println("Salario negativo. Se ignora.");
                continue;
            }

            salariosValidos++;
            sumaSalarios += salario;

            if (salario > salarioMasAlto) {
                salarioMasAlto = salario;
            }
        }

        System.out.println("\n--- Analisis de Salarios ---");
        if (salariosValidos > 0) {
            double promedioSalarial = sumaSalarios / salariosValidos;
            System.out.printf("Promedio salarial: %.2f%n", promedioSalarial);
            System.out.printf("Salario mas alto: %.2f%n", salarioMasAlto);
        } else {
            System.out.println("No se registraron salarios validos.");
        }

        sc.close();
    }
}