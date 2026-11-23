import java.util.Scanner;

public class SEM13EP02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int EDAD_MINIMA = 18;
        final int EDAD_MAXIMA = 65;

        int cantidadValida = 0;
        double sumaEdades = 0.0;

        while (true) {
            System.out.print("Ingrese una edad (-1 para finalizar): ");
            int edad = sc.nextInt();

            if (edad == -1) {
                break; // Finaliza el registro de edades
            }

            if (edad < EDAD_MINIMA || edad > EDAD_MAXIMA) {
                System.out.println("Edad fuera de rango (18 - 65). Se ignora.");
                continue;
            }

            cantidadValida++;
            sumaEdades += edad;
        }

        System.out.println("\n--- Resultados de Edades ---");
        System.out.println("Cantidad valida de personas: " + cantidadValida);

        if (cantidadValida > 0) {
            double promedioEdad = sumaEdades / cantidadValida;
            System.out.printf("Promedio de edad: %.2f%n", promedioEdad);
        } else {
            System.out.println("Promedio de edad: No hay edades validas registradas.");
        }

        sc.close();
    }
}