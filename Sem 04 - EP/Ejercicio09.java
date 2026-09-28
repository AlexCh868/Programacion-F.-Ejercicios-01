import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int Conductor1;
        int Conductor2;

        System.out.print("Ingrese conductor 1 (mayor): ");
        Conductor1 = entrada.nextInt();

        System.out.print("Ingrese conductor 2 (menor): ");
        Conductor2 = entrada.nextInt();

        System.out.print(Conductor1 + " es mayor a " + Conductor2 + ": ");
        System.out.println(Conductor1 > Conductor2);

        System.out.print(Conductor1 + " es menor a " + Conductor2 + ": ");
        System.out.println(Conductor1 < Conductor2);

        System.out.print(Conductor1 + " es mayor o igual a " + Conductor2 + ":");
        System.out.println(Conductor1 >= Conductor2);

        System.out.print(Conductor1 + " es menor o igual a " + Conductor2 + ": ");
        System.out.println(Conductor1 <= Conductor2);

        System.out.print(Conductor1 + " es igual a " + Conductor2 + ": ");
        System.out.println(Conductor1 == Conductor2);

        System.out.print(Conductor1 + " es diferente de " + Conductor2 + ": ");
        System.out.println(Conductor1 != Conductor2);

        System.out.println("El Conductor 2 recorrió más.");
        System.out.println(Conductor2 > Conductor1);
        System.out.println("La diferencia entre ambos es : " + (Conductor2 - Conductor1) + "Km/h");
    }
}
