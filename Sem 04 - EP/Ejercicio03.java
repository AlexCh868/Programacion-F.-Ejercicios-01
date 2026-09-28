import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int Vendedor1;
        int Vendedor2;

        System.out.print("Ingrese las ventas con mayor valor: ");
        Vendedor1 = entrada.nextInt();

        System.out.print("Ingrese las ventas con menor valor: ");
        Vendedor2 = entrada.nextInt();

        System.out.print(Vendedor1 + " es mayor a " + Vendedor2 + ": ");
        System.out.println(Vendedor1 > Vendedor2);

        System.out.print(Vendedor1 + " es menor a " + Vendedor2 + ": ");
        System.out.println(Vendedor1 < Vendedor2);

        System.out.print(Vendedor1 + " es mayor o igual a " + Vendedor2 + ":");
        System.out.println(Vendedor1 >= Vendedor2);

        System.out.print(Vendedor1 + " es menor o igual a " + Vendedor2 + ": ");
        System.out.println(Vendedor1 <= Vendedor2);

        System.out.print(Vendedor1 + " es igual a " + Vendedor2 + ": ");
        System.out.println(Vendedor1 == Vendedor2);

        System.out.print(Vendedor1 + " es diferente de " + Vendedor2 + ": ");
        System.out.println(Vendedor1 != Vendedor2);

        System.out.println("El vendedor 1 realizo mas ventas.");
            System.out.println(Vendedor1 > Vendedor2);
        System.out.println("La diferencia entre ambos es:" + (Vendedor1 - Vendedor2));
    }
}
