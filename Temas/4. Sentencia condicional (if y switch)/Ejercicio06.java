/* Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
una altura h. Aplica la fórmula 
t = (2h / g) ^ 1 / 2
siendo g = 9.81m/(s^2)  */
import java.util.Scanner;

public class Ejercicio06 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca la altura: ");
    double h = s.nextDouble();

    if (h < 0) System.out.println("La altura no puede ser negativa.");
    else {
      System.out.printf("El tiempo que tardará será: %.2f segundos.", (Math.sqrt(2 * h / 9.8)));
    }

    s.close();
  }
}
