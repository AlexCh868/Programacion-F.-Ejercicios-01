import java.util.Scanner;

class Ejercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();

        if (numero >= 18) {
            System.out.println("Puede obtener licencia");
        }
    }
}
