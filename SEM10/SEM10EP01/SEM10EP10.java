import java.util.Scanner;

public class SEM10EP10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalEstudiantes = 30;
        int excelente = 0;
        int bueno = 0;
        int regular = 0;
        int malo = 0;
        
        System.out.println("Ingrese la opinión de los " + totalEstudiantes + " estudiantes:");
        System.out.println("(Opciones: 1 = Excelente, 2 = Bueno, 3 = Regular, 4 = Malo)");
        
        for (int i = 1; i <= totalEstudiantes; i++) {
            System.out.print("Estudiante " + i + ": ");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    excelente++;
                    break;
                case 2:
                    bueno++;
                    break;
                case 3:
                    regular++;
                    break;
                case 4:
                    malo++;
                    break;
                default:
                    System.out.println(" Opción inválida (debe ser del 1 al 4). Repita este estudiante.");
                    break;
            }
        }
        
        String opcionMasVotada = "Excelente";
        int maxVotos = excelente;
        
        if (bueno > maxVotos) {
            maxVotos = bueno;
            opcionMasVotada = "Bueno";
        }
        if (regular > maxVotos) {
            maxVotos = regular;
            opcionMasVotada = "Regular";
        }
        if (malo > maxVotos) {
            maxVotos = malo;
            opcionMasVotada = "Malo";
        }
        
        System.out.println("\n--- Resultados de la Encuesta ---");
        System.out.println("Excelente: " + excelente);
        System.out.println("Bueno: " + bueno);
        System.out.println("Regular: " + regular);
        System.out.println("Malo: " + malo);
        System.out.println("Opción más votada: " + opcionMasVotada);
        
        scanner.close();
    }
}