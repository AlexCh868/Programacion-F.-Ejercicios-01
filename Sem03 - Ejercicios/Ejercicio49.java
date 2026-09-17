class Ejercicio49 {
    public static void main(String[] args) {
        int numero = 748;

            int C = numero / 100;
            int D = (numero % 100) / 10;
            int U = numero % 10;

            int SdC = C + D + U;

                System.out.println("Centenas: " + C);
                System.out.println("Decenas: " + D);
                System.out.println("Unidades: " + U);
                System.out.println("Suma de cifras: " + SdC);
    }
}