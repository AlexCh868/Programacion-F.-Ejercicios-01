import java.util.Scanner;

public class SEM13EP05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine().trim();

        StringBuilder vocalesEncontradas = new StringBuilder();

        for (int i = 0; i < palabra.length(); i++) {
            char c = Character.toLowerCase(palabra.charAt(i));

            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                continue; // Ignora consonantes y caracteres que no sean vocales
            }

            if (vocalesEncontradas.length() > 0) {
                vocalesEncontradas.append(", ");
            }
            vocalesEncontradas.append(palabra.charAt(i));
        }

        System.out.println("\n--- Resultado ---");
        if (vocalesEncontradas.length() > 0) {
            System.out.println("Vocales encontradas: " + vocalesEncontradas);
        } else {
            System.out.println("Vocales encontradas: Ninguna");
        }

        sc.close();
    }
}