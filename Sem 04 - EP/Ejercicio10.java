import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int Saldo1;
        int Saldo2;

        System.out.print("Ingrese saldo 1: ");
        Saldo1 = entrada.nextInt();

        System.out.print("Ingrese saldo 2: ");
        Saldo2 = entrada.nextInt();

        System.out.print(Saldo1 + " es mayor a " + Saldo2 + ": ");
        System.out.println(Saldo1 > Saldo2);

        System.out.print(Saldo1 + " es menor a " + Saldo2 + ": ");
        System.out.println(Saldo1 < Saldo2);

        System.out.print(Saldo1 + " es mayor o igual a " + Saldo2 + ":");
        System.out.println(Saldo1 >= Saldo2);

        System.out.print(Saldo1 + " es menor o igual a " + Saldo2 + ": ");
        System.out.println(Saldo1 <= Saldo2);

        System.out.print(Saldo1 + " es igual a " + Saldo2 + ": ");
        System.out.println(Saldo1 == Saldo2);

        System.out.print(Saldo1 + " es diferente de " + Saldo2 + ": ");
        System.out.println(Saldo1 != Saldo2);

        System.out.println("La cuenta 1 tinee mayor saldo.");
        System.out.println(Saldo1 > Saldo2);
        System.out.println("La diferencia de saldo es : " + (Saldo1 - Saldo2));
    }
}
