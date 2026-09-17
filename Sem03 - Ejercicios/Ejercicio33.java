class Ejercicio33 {
    public static void main(String[] args) {
        double Precio = 1200;
        double Descuento = 15;

        double MontoDescontado = ((Precio * Descuento) / 100);
        double precioFinal = Precio - MontoDescontado;
            System.out.println( "Descuento: " + MontoDescontado );
            System.out.println( "Precio final: " + precioFinal );
    }
}