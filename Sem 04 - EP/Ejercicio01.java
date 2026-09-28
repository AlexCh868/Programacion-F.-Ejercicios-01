import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int Promedio1;
        int Promedio2;

        System.out.print("Ingrese el mayor promedio: ");
        Promedio1 = entrada.nextInt();

        System.out.print("Ingrese el menor promedio: ");
        Promedio2 = entrada.nextInt();

        System.out.print(Promedio1 + " es mayor a " + Promedio2 + ": ");
        System.out.println(Promedio1 > Promedio2);

        System.out.print(Promedio1 + " es menor a " + Promedio2 + ": ");
        System.out.println(Promedio1 < Promedio2);

        System.out.print(Promedio1 + " es mayor o igual a " + Promedio2 + ":");
        System.out.println(Promedio1 >= Promedio2);

        System.out.print(Promedio1 + " es menor o igual a " + Promedio2 + ": ");
        System.out.println(Promedio1 <= Promedio2);

        System.out.print(Promedio1 + " es igual a " + Promedio2 + ": ");
        System.out.println(Promedio1 == Promedio2);

        System.out.print(Promedio1 + " es diferente de " + Promedio2 + ": ");
        System.out.println(Promedio1 != Promedio2);

        System.out.println("El estudiante 1 obtuvo el mejor promedio.");
        System.out.println("La diferencia entre ambos es:" + (Promedio1-Promedio2));
    }
}
