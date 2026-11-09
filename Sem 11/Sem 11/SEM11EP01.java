import java.util.Scanner;

public class SEM11EP01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int suma = 0;

        do {
            System.out.print("Ingrese número: ");
            numero = sc.nextInt();

            if (numero >= 0) {
                suma += numero;
            }
        } while (numero >= 0);

        System.out.println("Suma total: " + suma);
    }
}