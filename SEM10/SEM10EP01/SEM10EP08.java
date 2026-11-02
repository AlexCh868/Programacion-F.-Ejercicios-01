import java.util.Scanner;

public class SEM10EP08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalDias = 7;
        double ventaTotal = 0;
        double mayorVenta = Double.MIN_VALUE;
        int diaMayorVenta = 0;
        
        System.out.println("Ingrese el monto vendido en cada uno de los " + totalDias + " días:");
        
        for (int i = 1; i <= totalDias; i++) {
            System.out.print("Día " + i + ": S/ ");
            double venta = scanner.nextDouble();
            
            ventaTotal += venta;
            
            if (venta > mayorVenta) {
                mayorVenta = venta;
                diaMayorVenta = i;
            }
        }
        
        double promedio = ventaTotal / totalDias;
        
        System.out.println("\n--- Resultados ---");
        System.out.printf("Venta total: S/ %.2f\n", ventaTotal);
        System.out.printf("Promedio: S/ %.2f\n", promedio);
        System.out.println("Mayor venta: Día " + diaMayorVenta);
        
        scanner.close();
    }
}