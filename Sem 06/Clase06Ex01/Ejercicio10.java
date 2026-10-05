import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su nota de matemáticas: ");
        int valor1 = entrada.nextInt();

        System.out.print("Ingrese su nota de comunicación: ");
        int valor2 = entrada.nextInt();

        if (valor1 >= 11 && valor2 >= 11) {
            System.out.println("Pastulante apto");
        }
    }
}
