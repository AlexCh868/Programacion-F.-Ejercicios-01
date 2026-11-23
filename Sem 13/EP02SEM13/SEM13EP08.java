import java.util.Scanner;

public class SEM13EP08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double VELOCIDAD_MINIMA = 20.0;
        final double CENTINELA_SALIDA = -1.0;

        int lecturasValidas = 0;
        double sumaVelocidades = 0.0;
        double mayorVelocidad = Double.NEGATIVE_INFINITY;

        while (true) {
            System.out.print("Ingrese la velocidad en km/h (-1 para finalizar): ");
            double velocidad = sc.nextDouble();

            if (velocidad == CENTINELA_SALIDA) {
                break; // Finaliza el control vehicular
            }

            if (velocidad < VELOCIDAD_MINIMA) {
                System.out.println("Velocidad menor a 20 km/h. Se ignora.");
                continue;
            }

            lecturasValidas++;
            sumaVelocidades += velocidad;

            if (velocidad > mayorVelocidad) {
                mayorVelocidad = velocidad;
            }
        }

        System.out.println("\n--- Resumen de Control Vehicular ---");
        if (lecturasValidas > 0) {
            double velocidadPromedio = sumaVelocidades / lecturasValidas;
            System.out.printf("Velocidad promedio: %.2f km/h%n", velocidadPromedio);
            System.out.printf("Mayor velocidad: %.2f km/h%n", mayorVelocidad);
        } else {
            System.out.println("No se registraron velocidades validas (mayores o iguales a 20 km/h).");
        }

        sc.close();
    }
}