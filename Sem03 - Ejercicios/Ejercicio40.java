class Ejercicio40 {
    public static void main(String[] args) {
        double CT = 4625;
        double PdGanancia = 25;

            double GananciaTotal = (CT * PdGanancia)/100;
            double PrecioVenta = CT + GananciaTotal;

                System.out.println("Ganancia total: " + GananciaTotal);
                System.out.println("Precio de venta: " + PrecioVenta);  
    }
}