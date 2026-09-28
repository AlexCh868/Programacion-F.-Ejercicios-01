import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int Estudiante1;
        int Estudiante2;

        System.out.print("Ingrese la asistencia del estudiante (mayor): ");
        Estudiante1 = entrada.nextInt();

        System.out.print("Ingrese la asistencia del estudiante (menor): ");
        Estudiante2 = entrada.nextInt();

        System.out.print(Estudiante1 + " es mayor a " + Estudiante2 + ": ");
        System.out.println(Estudiante1 > Estudiante2);

        System.out.print(Estudiante1 + " es menor a " + Estudiante2 + ": ");
        System.out.println(Estudiante1 < Estudiante2);

        System.out.print(Estudiante1 + " es mayor o igual a " + Estudiante2 + ":");
        System.out.println(Estudiante1 >= Estudiante2);

        System.out.print(Estudiante1 + " es menor o igual a " + Estudiante2 + ": ");
        System.out.println(Estudiante1 <= Estudiante2);

        System.out.print(Estudiante1 + " es igual a " + Estudiante2 + ": ");
        System.out.println(Estudiante1 == Estudiante2);

        System.out.print(Estudiante1 + " es diferente de " + Estudiante2 + ": ");
        System.out.println(Estudiante1 != Estudiante2);

        System.out.println("El estudiante 1 tiene mejor asistencia.");
        System.out.println(Estudiante1 > Estudiante2);

        int diferencia = (int)(((double)(Estudiante1 - Estudiante2) / Estudiante1) * 100);
        System.out.println("Diferencia de asistencia: " + diferencia + "%");
    }
}
