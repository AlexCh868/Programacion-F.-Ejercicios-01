import java.util.Scanner;
public class Sem09E03{
public static void main(String[] args) {
Scanner entrada= new Scanner(System.in);
int respuesta = 0;
do{
System.out.println("1) Opción A");
System.out.println("2) Opción B");
System.out.println("3) Salir");

System.out.print("Elija una opción: ");
respuesta = entrada.nextInt();

System.out.println("Elegiste la opción " + respuesta);
System.out.println();
}while( respuesta != 3 );
System.out.println("Adiós!");
} // Fin del método main
} // Fin de la clase InstruccionDoWhile