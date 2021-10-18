/* Escribe un programa que pida una base y
unexponente (entero positivo) y que calcule la potencia. */
import java.util.Scanner;

public class Ejercicio13 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int nPositivos = 0;
    
    for (int i = 1; i <= 10; i++) {
      System.out.printf("Número %d: ", i);
      if (s.nextInt() >= 0) nPositivos++;
    }

    s.close();

    System.out.println();
    System.out.println("Número de positivos: " + nPositivos);
    System.out.println("Número de negativos: " + ( 10 - nPositivos));
  }
}
