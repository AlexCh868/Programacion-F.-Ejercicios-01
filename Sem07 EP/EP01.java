import java.util.Scanner;

public class EP01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final double TNORMAL = 20.0;
        final int HLIMITE = 40;

        System.out.print("Ingrese las horas trabajadas en la semana: ");
        int HTrabajadas = entrada.nextInt();

        double salarioTotal;

        if (HTrabajadas > HLIMITE) {
            int HNormales = HLIMITE;
            int HExtras = HTrabajadas - HLIMITE;
            salarioTotal = (HNormales * TNORMAL) + (HExtras * (TNORMAL * 2));
        } else {
            salarioTotal = HTrabajadas * TNORMAL;
        }

        System.out.println("El salario total a pagar es: S/ " + salarioTotal);
    }
}