public class SEM13EP14 {
    public static void main(String[] args) {
        final int DIVISOR_1 = 17;
        final int DIVISOR_2 = 23;

        int numero = 1;
        int numeroEncontrado = 0;

        while (true) {
            if (numero % DIVISOR_1 == 0 && numero % DIVISOR_2 == 0) {
                numeroEncontrado = numero;
                break; // Detiene la búsqueda al hallar el primer múltiplo común
            }
            numero++;
        }

        System.out.println("Numero encontrado: " + numeroEncontrado);
    }
}