import java.util.Scanner;

class Ejercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();

        if (numero >= 17) {
            System.out.println("Alumno destacado");
        }
    }
}
