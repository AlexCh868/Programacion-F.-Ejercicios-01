import java.util.Scanner;

public class Sem09EP08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese cantidad de términos: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Por favor, ingrese un número mayor a 0.");
        } else {
            long a = 0;
            long b = 1;
            int contador = 1;

            System.out.print("Secuencia: ");
            while (contador <= n) {
                if (contador == 1) {
                    System.out.print(a + " ");
                } else if (contador == 2) {
                    System.out.print(b + " ");
                } else {
                    long siguiente = a + b;
                    System.out.print(siguiente + " ");
                    a = b;
                    b = siguiente;
                }
                contador++;
            }
            System.out.println();
        }
        scanner.close();
    }
}