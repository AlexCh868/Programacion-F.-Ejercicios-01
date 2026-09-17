class Ejercicio34 {
    public static void main(String[] args) {
        double Precio = 850;
        double IGV = 18;

        double MontoIGV = ((Precio * IGV) / 100);
        double PrecioFinal = Precio + MontoIGV;
            System.out.println( "IGV: " + MontoIGV );
            System.out.println( "Precio final: " + PrecioFinal );
    }
}