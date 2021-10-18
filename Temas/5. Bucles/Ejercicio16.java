/* Escribe un programa que diga si un número introducido por teclado es o no
primo. Un número primo es aquel que sólo es divisible entre él mismo y la
unidad. */
import java.util.Scanner;

public class Ejercicio16 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int num;
    boolean primo = true;

    System.out.print("Introduzca el número: ");
    num = s.nextInt();

    s.close();

    if (num <= 1) primo = false;

    int i = 2;
    while (primo && i < (num / 2)) {
      if (num % i == 0) primo = false;
      i++;
    }

    System.out.printf(num + (primo ? "" : " no") + " es primo.");
  }
}
