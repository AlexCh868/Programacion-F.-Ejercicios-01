import java.util.Scanner;

public class SEM11EP09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secreto = 25;
        int intento;
        int intentos = 0;

        do {
            System.out.print("Adivine el número: ");
            intento = sc.nextInt();
            intentos++;

            if (intento > secreto) {
                System.out.println("Muy alto");
            } else if (intento < secreto) {
                System.out.println("Muy bajo");
            }
        } while (intento != secreto);

        System.out.println("¡Correcto!");
        System.out.println("Intentos realizados: " + intentos);
    }
}