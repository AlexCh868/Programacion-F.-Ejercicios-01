import java.util.Scanner;

class Lectura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print(
        "Ingrese un valor entero: ");
        int numero1 = entrada.nextInt();

        System.out.print("Ingrese otro valor entero: ");
        int numero2 = entrada.nextInt();

        int suma = numero1 + numero2;
        System.out.println("La suma es " + suma);
    }
}
