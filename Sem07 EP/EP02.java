import  java.util.Scanner;

public class EP02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su Sueldo: ");
        int Sueldo = entrada.nextInt();

        if (Sueldo >= 3000
        ) {
            System.out.println("Puede solicitar 5 veces su sueldo");
        } else {
            System.out.println("Puede solicitar 2 veces su sueldo");
        }

    } // Fin del método main
} // Fin de la clase InstruccionIfElse