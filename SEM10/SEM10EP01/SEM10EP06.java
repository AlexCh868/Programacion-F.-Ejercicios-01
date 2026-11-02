import java.util.Scanner;

public class SEM10EP06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalPersonas = 15;
        
        int edadMayor = Integer.MIN_VALUE;
        int edadMenor = Integer.MAX_VALUE;
        
        int mayoresDeEdad = 0;
        int menoresDeEdad = 0;
        
        System.out.println("Ingrese las edades de " + totalPersonas + " personas:");
        
        for (int i = 1; i <= totalPersonas; i++) {
            System.out.print("Persona " + i + ": ");
            int edad = scanner.nextInt();
            
            if (edad > edadMayor) {
                edadMayor = edad;
            }
            
            if (edad < edadMenor) {
                edadMenor = edad;
            }
            
            if (edad >= 18) {
                mayoresDeEdad++;
            } else {
                menoresDeEdad++;
            }
        }
        
        System.out.println("\n--- Resultados ---");
        System.out.println("Edad mayor: " + edadMayor);
        System.out.println("Edad menor: " + edadMenor);
        System.out.println("Mayores de edad: " + mayoresDeEdad);
        System.out.println("Menores de edad: " + menoresDeEdad);
        
        scanner.close();
    }
}