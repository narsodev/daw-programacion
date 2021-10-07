/* Escribe un programa que calcule el total de una factura a partir de la base
imponible. */
import java.util.Scanner;

public class Ejercicio07 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double base;

    System.out.println("Introduzca la base imponible:");
    base = s.nextDouble();

    System.out.printf("El total de la factura a partir de la base %.2f es %.2f euros\n", base, (base * 1.21));
  
    s.close();
  }
}
