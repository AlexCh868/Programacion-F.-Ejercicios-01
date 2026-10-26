import java.util.Scanner;

public class Sem09EP02 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        int i = 1;

        while (i <= 12) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
            i++; 
        }

        scanner.close();
    }
}