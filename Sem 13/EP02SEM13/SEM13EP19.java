public class SEM13EP19 {
    public static void main(String[] args) {
        final int INICIO = 1;
        final int FIN = 500;

        StringBuilder listaNumerosValidos = new StringBuilder();
        int cantidadEncontrada = 0;

        for (int i = INICIO; i <= FIN; i++) {
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
                continue; // Ignora múltiplos de 2, 3 y 5
            }

            if (listaNumerosValidos.length() > 0) {
                listaNumerosValidos.append(", ");
            }
            listaNumerosValidos.append(i);
            cantidadEncontrada++;
        }

        System.out.println("--- Analisis de Numeros (1 al 500) ---");
        System.out.println("Lista de numeros validos: " + listaNumerosValidos);
        System.out.println("Cantidad encontrada: " + cantidadEncontrada);
    }
}