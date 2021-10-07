/* Escribe un programa que sume, reste, multiplique y divida dos números
introducidos por teclado. */
import java.util.Scanner;

public class Ejercicio04 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double x, y;

    System.out.print("Introduzca el primer número: ");
    x = s.nextDouble();

    System.out.print("Introduzca el segundo número: ");
    y = s.nextDouble();
    
    System.out.printf("X + Y: %.2f\n", (x + y));
    System.out.printf("X - Y: %.2f\n", (x - y));
    System.out.printf("Y - X: %.2f\n", (y - x));
    System.out.printf("X * Y: %.2f\n", (x * y));
    System.out.printf("X / Y: %.2f\n", (x / y));
    System.out.printf("Y / X: %.2f\n", (y / x));

    s.close();
  }
}
