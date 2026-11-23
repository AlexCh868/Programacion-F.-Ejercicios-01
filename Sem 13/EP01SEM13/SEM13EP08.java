public class SEM13EP08 {
    public static void main(String[] args) {
        String[] codigos = {"XYZ987", "LMN456", "ABC123", "QWE789", "RTY321"};
        final String CODIGO_BUSCADO = "ABC123";

        boolean encontrado = false;
        int indiceEncontrado = -1;
        int codigosRevisados = 0;

        for (int i = 0; i < codigos.length; i++) {
            codigosRevisados++;

            if (codigos[i].equals(CODIGO_BUSCADO)) {
                encontrado = true;
                indiceEncontrado = i;
                break; // Detiene la búsqueda al encontrar el código
            }
        }

        if (encontrado) {
            System.out.println("Codigo encontrado: " + CODIGO_BUSCADO);
            System.out.println("Posicion (indice base 0): " + indiceEncontrado);
            System.out.println("Posicion (conteo desde 1): " + (indiceEncontrado + 1));
            System.out.println("Cantidad de codigos revisados: " + codigosRevisados);
        } else {
            System.out.println("El codigo " + CODIGO_BUSCADO + " no se encontro en la lista.");
            System.out.println("Cantidad de codigos revisados: " + codigosRevisados);
        }
    }
}