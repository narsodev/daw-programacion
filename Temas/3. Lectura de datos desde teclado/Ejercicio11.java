// Realiza un conversor de Kb a Mb.
import java.util.Scanner;

public class Ejercicio11 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double kb;
    
    System.out.println("Introduce los Kb a convertir:");
    kb = s.nextDouble();

    System.out.printf("%.2f Kb = %.2f Mb", kb, (kb * 0.0009765625));

    s.close();
  }
}
