class Ejercicio36 {
    public static void main(String[] args) {
        double Precio = 12500;
        double ComisiónPorcentaje = 6;
        double SuledoBase = 1400;

            double Comisión = ((Precio * ComisiónPorcentaje) / 100);
            double IngresoTotal = SuledoBase + Comisión;

                System.out.println( "Comisión: " + Comisión );
                System.out.println( "Ingreso total: " + IngresoTotal );
    }
}