import java.util.Scanner;

public class SEM11EP04
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad = 0;
        double suma = 0;
        double nota;
        String respuesta;

        do {
            do {
                System.out.print("Ingrese nota (0-20): ");
                nota = sc.nextDouble();

                if (nota < 0 || nota > 20) {
                    System.out.println("Nota inválida. Debe estar entre 0 y 20.");
                }
            } while (nota < 0 || nota > 20);

            suma += nota;
            cantidad++;

            System.out.print("¿Desea ingresar otra nota? (s/n): ");
            respuesta = sc.next();
        } while (respuesta.equalsIgnoreCase("s"));

        double promedio = suma / cantidad;

        System.out.println();
        System.out.println("Cantidad de notas: " + cantidad);
        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}