class Ejercicio27 {
    public static void main(String[] args) {
        int Segundos = 10000;

        int Horas = Segundos / 3600;
        int Minutos = (Segundos % 3600) / 60;
        int SegundosRestantes = Segundos % 60;

            System.out.println( "Horas: " + Horas );
            System.out.println( "Minutos: " + Minutos );
            System.out.println( "Segundos: " + SegundosRestantes);
    }
}

