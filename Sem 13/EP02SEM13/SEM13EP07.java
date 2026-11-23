import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SEM13EP07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> correosValidos = new ArrayList<>();

        while (true) {
            System.out.print("Ingrese un correo electronico (o escriba FIN para terminar): ");
            String correo = sc.nextLine().trim();

            if (correo.equalsIgnoreCase("FIN")) {
                break; // Finaliza el registro de correos
            }

            if (!correo.contains("@")) {
                System.out.println("Correo invalido (falta el simbolo @). Se ignora.");
                continue;
            }

            correosValidos.add(correo);
        }

        System.out.println("\n--- Lista de Correos Validos ---");
        if (correosValidos.isEmpty()) {
            System.out.println("No se registraron correos validos.");
        } else {
            for (String correo : correosValidos) {
                System.out.println("- " + correo);
            }
        }

        sc.close();
    }
}