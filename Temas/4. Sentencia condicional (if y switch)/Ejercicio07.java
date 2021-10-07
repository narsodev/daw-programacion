// Realiza un programa que calcule la media de tres notas.
import java.util.Scanner;
public class Ejercicio07 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    double nota1, nota2, nota3;

    System.out.print("Nota 1: ");
    nota1 = s.nextDouble();
    
    System.out.print("Nota 2: ");
    nota2 = s.nextDouble();

    System.out.print("Nota 3: ");
    nota3 = s.nextDouble();

    s.close();
  
    System.out.printf("La nota media es: %.2f", ((nota1 + nota2 + nota3) / 3));
  }
}
