import java.util.Scanner;

public class Sem09EP04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double suma = 0;
        int contador = 1;
        int totalNotas = 5;

        while (contador <= totalNotas) {
            System.out.print("Nota " + contador + ": ");
            double nota = scanner.nextDouble();
            suma += nota; 
            contador++;   
        }

        double promedio = suma / totalNotas;

        System.out.println("Promedio: " + promedio);

        scanner.close();
    }
}