import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int Fabrica1;
        int Fabrica2;

        System.out.print("Ingrese fabrica 1 (menor): ");
        Fabrica1 = entrada.nextInt();

        System.out.print("Ingrese fabrica 2 (mayor): ");
        Fabrica2 = entrada.nextInt();

        System.out.print(Fabrica1 + " es mayor a " + Fabrica2 + ": ");
        System.out.println(Fabrica1 > Fabrica2);

        System.out.print(Fabrica1 + " es menor a " + Fabrica2 + ": ");
        System.out.println(Fabrica1 < Fabrica2);

        System.out.print(Fabrica1 + " es mayor o igual a " + Fabrica2 + ":");
        System.out.println(Fabrica1 >= Fabrica2);

        System.out.print(Fabrica1 + " es menor o igual a " + Fabrica2 + ": ");
        System.out.println(Fabrica1 <= Fabrica2);

        System.out.print(Fabrica1 + " es igual a " + Fabrica2 + ": ");
        System.out.println(Fabrica1 == Fabrica2);

        System.out.print(Fabrica1 + " es diferente de " + Fabrica2 + ": ");
        System.out.println(Fabrica1 != Fabrica2);

        System.out.println("La fabrica 1 consumio más.");
        System.out.println(Fabrica1 < Fabrica2);
        System.out.println("La diferencia entre ambas es : " + (Fabrica2 - Fabrica1));
    }
}
