import java.util.Scanner;

public class EPFinal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Constantes del problema
        final double LIMITE_SALARIO = 2500.0;
        final int LIMITE_HORAS = 48;
        final double BONO_EXTRA = 300.0;

        // Lectura de datos
        System.out.print("Ingrese el salario bruto: S/ ");
        double salarioBruto = entrada.nextDouble();

        System.out.print("Ingrese las horas trabajadas: ");
        int horasTrabajadas = entrada.nextInt();

        double porcentajeImpuesto;
        if (salarioBruto > LIMITE_SALARIO) {
            porcentajeImpuesto = 0.12; // 12%
        } else {
            porcentajeImpuesto = 0.07; // 7%
        }

        double impuesto = salarioBruto * porcentajeImpuesto;

        double bono = 0.0;
        if (horasTrabajadas > LIMITE_HORAS) {
            bono = BONO_EXTRA;
        }
        double salarioNeto = salarioBruto - impuesto + bono;
        
        System.out.println("Salario bruto: S/ " + salarioBruto);
        System.out.println("Impuesto (" + (int)(porcentajeImpuesto * 100) + "%): S/ " + impuesto);
        System.out.println("Bono por horas extras: S/ " + bono);
        System.out.println("Salario neto final: S/ " + salarioNeto);

    }
}