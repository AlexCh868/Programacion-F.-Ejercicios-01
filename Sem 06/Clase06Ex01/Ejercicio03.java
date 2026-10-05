import java.util.Scanner;

class Ejercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();

        if (numero >= 300) {
            System.out.println("Puede obtener el descuento del 10%");
        }
    }
}
