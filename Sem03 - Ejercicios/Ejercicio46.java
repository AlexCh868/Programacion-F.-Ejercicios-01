class Ejercicio46 {
    public static void main(String[] args) {
        double Potencia = 1200;
        double Tiempo = 6;

            double E = Potencia * Tiempo;   
            double EkWh= E / 1000.0;  

                System.out.println("E (Wh): " + E);
                System.out.println("E (kWh): " + EkWh);
    }
}