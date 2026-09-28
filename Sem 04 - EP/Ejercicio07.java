import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int Hogar1;
        int Hogar2;

        System.out.print("Ingrese hogar 1 (mayor): ");
        Hogar1 = entrada.nextInt();

        System.out.print("Ingrese hogar 2 (menor): ");
        Hogar2 = entrada.nextInt();

        System.out.print(Hogar1 + " es mayor a " + Hogar2 + ": ");
        System.out.println(Hogar1 > Hogar2);

        System.out.print(Hogar1 + " es menor a " + Hogar2 + ": ");
        System.out.println(Hogar1 < Hogar2);

        System.out.print(Hogar1 + " es mayor o igual a " + Hogar2 + ":");
        System.out.println(Hogar1 >= Hogar2);

        System.out.print(Hogar1 + " es menor o igual a " + Hogar2 + ": ");
        System.out.println(Hogar1 <= Hogar2);

        System.out.print(Hogar1 + " es igual a " + Hogar2 + ": ");
        System.out.println(Hogar1 == Hogar2);

        System.out.print(Hogar1 + " es diferente de " + Hogar2 + ": ");
        System.out.println(Hogar1 != Hogar2);

        System.out.println("El Hogar 1 consumio más energía.");
        System.out.println(Hogar1 > Hogar2);
        System.out.println("La diferencia entre ambos es : " + (Hogar1 - Hogar2) + "KWh");
    }
}
