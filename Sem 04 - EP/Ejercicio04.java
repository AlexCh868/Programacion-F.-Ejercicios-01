import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int Trabajador1;
        int Trabajador2;

        System.out.print("Ingrese la edad del trabajador (menor): ");
        Trabajador1 = entrada.nextInt();

        System.out.print("Ingrese la edad del trabajador (mayor): ");
        Trabajador2 = entrada.nextInt();

        System.out.print(Trabajador1 + " es mayor a " + Trabajador2 + ": ");
        System.out.println(Trabajador1 > Trabajador2);

        System.out.print(Trabajador1 + " es menor a " + Trabajador2 + ": ");
        System.out.println(Trabajador1 < Trabajador2);

        System.out.print(Trabajador1 + " es mayor o igual a " + Trabajador2 + ":");
        System.out.println(Trabajador1 >= Trabajador2);

        System.out.print(Trabajador1 + " es menor o igual a " + Trabajador2 + ": ");
        System.out.println(Trabajador1 <= Trabajador2);

        System.out.print(Trabajador1 + " es igual a " + Trabajador2 + ": ");
        System.out.println(Trabajador1 == Trabajador2);

        System.out.print(Trabajador1 + " es diferente de " + Trabajador2 + ": ");
        System.out.println(Trabajador1 != Trabajador2);

        System.out.println("El trabajador 2 es mayor.");
        System.out.println(Trabajador1 < Trabajador2);
        System.out.println("La diferencia entre ambos es:" + (Trabajador2 - Trabajador1));
    }
}
