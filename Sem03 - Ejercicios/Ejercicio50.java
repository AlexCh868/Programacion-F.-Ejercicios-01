class Ejercicio50 {
    public static void main(String[] args) {
        double U = 300;
        double pU = 16.80;
        double GpU = 30;
        double igv = 18;

            double CT = (U * pU);
            double G = (CT * GpU) / 100;
            double V = (CT + G);
            double IGV = (V * igv ) / 100;
            double pT = (V + IGV);
            double PfU = (pT / U);

                System.out.println("Costo total: " + CT);
                System.out.println("Ganancia: " + G);
                System.out.println("Valor de venta: " + V);
                System.out.println("IGV: " + IGV);
                System.out.println("Precio total: " + pT);
                System.out.println("Precio final por unidad: " + PfU);
        }
}