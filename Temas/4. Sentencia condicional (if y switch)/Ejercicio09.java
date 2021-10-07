/* Realiza un programa que resuelva una ecuación de segundo grado (del tipo
ax2 + bx + c = 0). */
import java.util.Scanner;

public class Ejercicio09 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double a;

    System.out.println("Este programa resuelve ecuaciones del tipo: ax2 + bx + c = 0");

    System.out.print("a = ");
    a = s.nextDouble();

    if (a != 0) {
      double b, c, valorIntermedio, x1, x2;

      System.out.print("b = ");
      b = s.nextDouble();
  
      System.out.print("c = ");
      c = s.nextDouble();
  
      valorIntermedio = b * b - 4 * a * c;
  
      if (valorIntermedio < 0) System.out.println("Esta ecuación no tiene solución.");
      else {
        valorIntermedio = Math.sqrt(valorIntermedio);
        x1 = (-b + valorIntermedio) / (2 * a);
        x2 = (-b - valorIntermedio) / (2 * a);
  
        System.out.printf("x1 = %.2f\nx2 = %.2f", x1, x2);
      }
    } else System.out.println("Esta ecuación no tiene solución.");

    s.close();
  }
}
