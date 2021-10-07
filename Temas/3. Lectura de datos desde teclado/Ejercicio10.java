// Realiza un conversor de Mb a Kb.
import java.util.Scanner;

public class Ejercicio10 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double mb;
    
    System.out.println("Introduce los Mb a convertir:");
    mb = s.nextDouble();

    System.out.printf("%.2f Mb = %.2f Kb", mb, (mb * 1024));

    s.close();
  }
}
