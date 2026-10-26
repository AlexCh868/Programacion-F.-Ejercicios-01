import java.util.Scanner;

public class Sem09EP05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int n = scanner.nextInt();

        long factorial = 1;
        int i = 1;
        while (i <= n) {
            factorial *= i; 
            i++;            
        }

        System.out.println("Factorial = " + factorial);

        scanner.close();
    }
}