/* Escribe un programa que calcule el área de un rectángulo. */
import java.util.Scanner;

public class Ejercicio05 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double base, altura;

    System.out.println("Introduzca la base del rectángulo:");
    base = s.nextDouble();

    System.out.println("Introduzca la altura del rectángulo:");
    altura = s.nextDouble();

    System.out.printf("El área del rectángulo es %.2f metros cuadrados.", (base * altura));

    s.close();
  }
}
