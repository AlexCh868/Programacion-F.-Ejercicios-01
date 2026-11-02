import java.util.Scanner;

public class SEM10EP11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalTrabajadores = 25;
        double planillaTotal = 0;
        double sueldoMayor = Double.MIN_VALUE;
        double sueldoMenor = Double.MAX_VALUE;
        int contMasDe2500 = 0;
        
        System.out.println("Ingrese el sueldo de los " + totalTrabajadores + " trabajadores:");
        
        for (int i = 1; i <= totalTrabajadores; i++) {
            System.out.print("Trabajador " + i + ": S/ ");
            double sueldo = scanner.nextDouble();
            
            planillaTotal += sueldo;
            
            if (sueldo > sueldoMayor) {
                sueldoMayor = sueldo;
            }
            
            if (sueldo < sueldoMenor) {
                sueldoMenor = sueldo;
            }
            
            if (sueldo > 2500) {
                contMasDe2500++;
            }
        }
        
        double sueldoPromedio = planillaTotal / totalTrabajadores;
        
        System.out.println("\n--- Resultados del Análisis ---");
        System.out.println("Planilla total: S/ " + (planillaTotal == (int)planillaTotal ? String.format("%,d", (int)planillaTotal).replace(',', ' ') : planillaTotal));
        System.out.println("Promedio: S/ " + (sueldoPromedio == (int)sueldoPromedio ? String.format("%,d", (int)sueldoPromedio).replace(',', ' ') : sueldoPromedio));
        System.out.println("Mayor sueldo: S/ " + (sueldoMayor == (int)sueldoMayor ? String.format("%,d", (int)sueldoMayor).replace(',', ' ') : sueldoMayor));
        System.out.println("Menor sueldo: S/ " + (sueldoMenor == (int)sueldoMenor ? String.format("%,d", (int)sueldoMenor).replace(',', ' ') : sueldoMenor));
        System.out.println("Trabajadores con sueldo > S/2500: " + contMasDe2500);
        
        scanner.close();
    }
}