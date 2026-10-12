import java.util.Scanner;

public class EP07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final double PESO_MAXIMO = 50.0;

        System.out.print("Ingrese el peso del paquete (kg): ");
        double peso = entrada.nextDouble();

        if (peso <= PESO_MAXIMO) {
            System.out.println("Se acepta su paquete.");
        } else {
            double pesoExcedido = peso - PESO_MAXIMO;
            System.out.println("Sobrepasa el peso establecido.");
            System.out.println("El paquete sobrepasa el límite en: " + pesoExcedido + " kg");
        }

    }
}