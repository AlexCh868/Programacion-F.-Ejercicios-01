import java.util.Scanner;

public class EP08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el promedio del estudiante (0-20): ");
        double promedio = entrada.nextDouble();

        if (promedio < 0 || promedio > 20) {
            System.out.println("Error: El promedio debe estar entre 0 y 20.");
        } else if (promedio < 11) {
            System.out.println("Estado: Desaprobado");
        } else if (promedio <= 14) {
            System.out.println("Estado: Regular");
        } else if (promedio <= 17) { 
            System.out.println("Estado: Bueno");
        } else {
            System.out.println("Estado: Excelente");
        }
    }
}