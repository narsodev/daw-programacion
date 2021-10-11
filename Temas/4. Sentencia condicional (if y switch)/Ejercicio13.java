// Escribe un programa que ordene tres números enteros introducidos por teclado.
import java.util.Scanner;

public class Ejercicio13 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double num1, num2, num3, aux;

    System.out.print("Número 1: ");
    num1 = s.nextDouble();

    System.out.print("Número 2: ");
    num2 = s.nextDouble();

    System.out.print("Número 3: ");
    num3 = s.nextDouble();

    if (num3 > num1) {
      aux = num3;
      num3 = num1;
      num1 = aux;
    }

    if (num3 > num2) {
      aux = num3;
      num3 = num2;
      num2 = aux;
    }

    if (num2 > num1) {
      aux = num2;
      num2 = num1;
      num1 = aux;
    }

    System.out.println("Número ordenados de mayor a menor:");
    System.out.println("Número 1: " + num1);
    System.out.println("Número 2: " + num2);
    System.out.println("Número 3: " + num3);

    s.close();
  }
}
