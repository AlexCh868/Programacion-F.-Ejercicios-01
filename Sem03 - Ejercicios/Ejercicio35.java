class Ejercicio35 {
    public static void main(String[] args) {
        double Precio = 1600;
        double Descuento = 10;
        double IGV = 18;

        double MontoDescontado = ((Precio * Descuento) / 100);
        double PrecioConDescuento = Precio - MontoDescontado;
        
        double MontoIGV = ((PrecioConDescuento * IGV) / 100);
        double PrecioFinal = PrecioConDescuento + MontoIGV;

            System.out.println( "Descuento: " + MontoDescontado );
            System.out.println( "IGV: " + MontoIGV );
            System.out.println( "Precio final: " + PrecioFinal );
    }
}