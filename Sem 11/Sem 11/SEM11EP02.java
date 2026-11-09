import java.util.Scanner;

public class SEM11EP02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contrasena;

        do {
            System.out.print("Ingrese contraseña: ");
            contrasena = sc.nextLine();

            if (!contrasena.equals("Java2026")) {
                System.out.println("Contraseña incorrecta");
                System.out.println();
            }
        } while (!contrasena.equals("Java2026"));

        System.out.println("Acceso permitido");
    }
}