public class SEM13EP04 {
    public static void main(String[] args) {
        final int INICIO = 1;
        final int FIN = 100;

        System.out.println("--- Lista de numeros impares (1 al 100) ---");

        for (int i = INICIO; i <= FIN; i++) {
            if (i % 2 == 0) {
                continue; // Ignora los números pares
            }

            System.out.print(i);
            if (i < FIN - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
    }
}