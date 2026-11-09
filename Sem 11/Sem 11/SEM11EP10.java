import java.util.Scanner;

public class SEM11EP10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        double precio;
        int cantidad;
        String respuesta;

        double montoTotal = 0;
        int cantidadTotal = 0;
        int productosRegistrados = 0;

        do {
            System.out.print("Nombre del producto: ");
            nombre = sc.nextLine();

            System.out.print("Precio: S/ ");
            precio = sc.nextDouble();

            System.out.print("Cantidad: ");
            cantidad = sc.nextInt();
            sc.nextLine(); 

            montoTotal += precio * cantidad;
            cantidadTotal += cantidad;
            productosRegistrados++;

            System.out.print("¿Desea registrar otra venta? (s/n): ");
            respuesta = sc.nextLine();
            System.out.println();
        } while (respuesta.equalsIgnoreCase("s"));

        double promedio = montoTotal / productosRegistrados;

        System.out.println("Monto total vendido: S/ " + montoTotal);
        System.out.println("Cantidad total de productos vendidos: " + cantidadTotal);
        System.out.println("Promedio de venta por producto: S/ " + promedio);
    }
}