import java.util.Scanner;

public class SEM10EP03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalEstudiantes = 10;
        double sumaNotas = 0;
        double notaMayor = Double.MIN_VALUE;
        double notaMenor = Double.MAX_VALUE;
        
        System.out.println("Ingrese las notas de " + totalEstudiantes + " estudiantes:");
        
        for (int i = 1; i <= totalEstudiantes; i++) {
            System.out.print("Estudiante " + i + ": ");
            double nota = scanner.nextDouble();
            sumaNotas += nota;
            
            if (nota > notaMayor) {
                notaMayor = nota;
            }
            
            if (nota < notaMenor) {
                notaMenor = nota;
            }
        }
        
        double promedio = sumaNotas / totalEstudiantes;
        
        System.out.println("\n--- Resultados ---");
        System.out.printf("Promedio: %.1f\n", promedio);
        System.out.println("Mayor nota: " + (notaMayor == (int) notaMayor ? (int) notaMayor : notaMayor));
        System.out.println("Menor nota: " + (notaMenor == (int) notaMenor ? (int) notaMenor : notaMenor));
        
        scanner.close();
    }
}