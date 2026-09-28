import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int Promedio1;
        int Promedio2;

        System.out.print("Ingrese el mayor promedio (mayor): ");
        Promedio1 = entrada.nextInt();

        System.out.print("Ingrese el menor promedio (menor): ");
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

        
        System.out.println("El estudiante 1 obtiene la beca");
        System.out.println(Promedio1 > Promedio2);
    }
}
