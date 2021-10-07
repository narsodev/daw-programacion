/* Realiza un programa que resuelva una ecuación de primer grado
(del tipo ax+b = 0). */
import java.util.Scanner;

public class Ejercicio05 {
  public static void main(String[] args) {
    double a;
    Scanner s = new Scanner(System.in);
    
    System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");

    System.out.print("a = ");
    a = s.nextDouble();
    if (a != 0) {
      System.out.print("b = ");
      double b = s.nextDouble();
  
      System.out.printf("x = %.2f", (-b / a));
    } else System.out.println("Esta ecuación no tiene solución.");

    s.close();
  }
}
