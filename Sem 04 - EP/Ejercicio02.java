import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int Sueldo1;
        int Sueldo2;

        System.out.print("Ingrese sueldo 1: ");
        Sueldo1 = entrada.nextInt();

        System.out.print("Ingrese sueldo 2: ");
        Sueldo2 = entrada.nextInt();

        System.out.print(Sueldo1 + " es mayor a " + Sueldo2 + ": ");
        System.out.println(Sueldo1 > Sueldo2);

        System.out.print(Sueldo1 + " es menor a " + Sueldo2 + ": ");
        System.out.println(Sueldo1 < Sueldo2);

        System.out.print(Sueldo1 + " es mayor o igual a " + Sueldo2 + ":");
        System.out.println(Sueldo1 >= Sueldo2);

        System.out.print(Sueldo1 + " es menor o igual a " + Sueldo2 + ": ");
        System.out.println(Sueldo1 <= Sueldo2);

        System.out.print(Sueldo1 + " es igual a " + Sueldo2 + ": ");
        System.out.println(Sueldo1 == Sueldo2);

        System.out.print(Sueldo1 + " es diferente de " + Sueldo2 + ": ");
        System.out.println(Sueldo1 != Sueldo2);

        System.out.println("El Practicante 2 gana más.");
            System.out.println(Sueldo1 < Sueldo2);
        System.out.println("La diferencia salarial es : " + (Sueldo2 - Sueldo1));
    }
}
