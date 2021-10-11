/* Realiza un programa que diga si un número introducido
por teclado es par y/o divisible entre 5. */

import java.util.Scanner;

public class Ejercicio14 {
  public static void main(String[] args) {
    int num;

    Scanner s = new Scanner(System.in);

    System.out.println("Introduce el número:");
    num = s.nextInt();
    s.close();

    if (num % 2 == 0) System.out.println("El número introducido es par.");
    else System.out.println("El número introducido es impar.");

    if (num % 5 == 0) System.out.println("El número introducido es divisible por 5.");
    else System.out.println("El número introducido es indivisible por 5");

  }
}
