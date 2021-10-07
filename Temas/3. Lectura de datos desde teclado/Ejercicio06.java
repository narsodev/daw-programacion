/* Escribe un programa que calcule el área de un triángulo. */
import java.util.Scanner;

public class Ejercicio06 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double base, altura;

    System.out.println("Introduzca la base del triángulo:");
    base = s.nextDouble();

    System.out.println("Introduzca la altura del triángulo:");
    altura = s.nextDouble();

    System.out.printf("El área del triángulo es %.2f metros cuadrados.", (base * altura / 2));

    s.close();
  }
}
